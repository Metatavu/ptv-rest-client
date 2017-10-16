/*global module:false*/

const fs = require('fs');
const util = require('util');

const PTV_VERSION = 'v6';
const SWAGGER_URL = util.format('https://api.palvelutietovaranto.trn.suomi.fi/swagger/%s/swagger.json', PTV_VERSION);

module.exports = function(grunt) {
  require('load-grunt-tasks')(grunt);
  
  grunt.initConfig({
    'clean': {
      'clean-ptv-java-client-cruft': [
        'generated-sources/docs', 
        'generated-sources/gradle', 
        'generated-sources/build.gradle',
        'generated-sources/build.sbt',
        'generated-sources/git_push.sh',
        'generated-sources/gradle.properties',
        'generated-sources/gradlew',
        'generated-sources/gradlew.bat',
        'generated-sources/LICENSE',
        'generated-sources/README.md',
        'generated-sources/settings.gradle',
        'generated-sources/src/test',
        'generated-sources/src/main/AndroidManifest.xml',
        'generated-sources/src/main/java/io',
        'generated-sources/src/main/java/fi/metatavu/ptv/auth',
        'generated-sources/src/main/java/fi/metatavu/ptv/*.java'
      ],
      'sources': ['generated-sources/src']
    },
    'copy': {
      'copy-ptv-rest-client-extras': {
        src: '**',
        dest: 'generated-sources',
        cwd: 'client-extras',
        expand: true
      }
    },
    'curl': {
      'swagger-codegen':  {
        src: 'http://repo1.maven.org/maven2/io/swagger/swagger-codegen-cli/2.2.1/swagger-codegen-cli-2.2.1.jar',
        dest: 'swagger-codegen-cli.jar'
      }
    },
    'shell': {
      'generate-ptv-java-client': {
        command : 'mv generated-sources/pom.xml generated-sources/pom.xml.before && ' +
          'java -jar swagger-codegen-cli.jar generate ' +
          util.format('-i %s ', SWAGGER_URL) +
          '-l java ' +
          '--api-package fi.metatavu.ptv.client ' +
          '--model-package fi.metatavu.ptv.client.model ' +
          '--group-id fi.metatavu.ptv.rest-client ' +
          '--artifact-id ptv-rest-client ' +
          '--artifact-version `cat generated-sources/pom.xml.before|grep version -m 1|sed -e \'s/.*<version>//\'|sed -e \'s/<.*//\'` ' +
          '--template-dir templates ' +
          '--library jersey2 ' +
          '--additional-properties dateLibrary=java8 ' +
          '-o generated-sources/'
      },
      'install-ptv-java-client': {
        command : 'mvn install',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      },
      'release-ptv-java-client': {
        command : 'git add src pom.xml && git commit -m "Generated source" && git push && mvn -B release:clean release:prepare release:perform',
        options: {
          execOptions: {
            cwd: 'generated-sources'
          }
        }
      }
    }
  });
  
  grunt.registerTask('download-dependencies', 'if-missing:curl:swagger-codegen');
  grunt.registerTask('default', ['download-dependencies', 'clean:sources', 'shell:generate-ptv-java-client', 'clean:clean-ptv-java-client-cruft', 'copy:copy-ptv-rest-client-extras', 'shell:install-ptv-java-client', 'shell:release-ptv-java-client' ]);
  
};