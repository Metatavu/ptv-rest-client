/*
 * PTV Open Api version 10
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v10
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package fi.metatavu.ptv.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import fi.metatavu.ptv.client.model.VmOpenApiLanguageItem;
import fi.metatavu.ptv.client.model.VmOpenApiSentenceValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of accessibility sentences.
 */
@ApiModel(description = "OPEN API - View Model of accessibility sentences.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-08T12:51:13.642+03:00")
public class VmOpenApiAccessibilitySentence {
  @JsonProperty("sentenceGroup")
  private List<VmOpenApiLanguageItem> sentenceGroup = null;

  @JsonProperty("sentences")
  private List<VmOpenApiSentenceValue> sentences = null;

  public VmOpenApiAccessibilitySentence sentenceGroup(List<VmOpenApiLanguageItem> sentenceGroup) {
    this.sentenceGroup = sentenceGroup;
    return this;
  }

  public VmOpenApiAccessibilitySentence addSentenceGroupItem(VmOpenApiLanguageItem sentenceGroupItem) {
    if (this.sentenceGroup == null) {
      this.sentenceGroup = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.sentenceGroup.add(sentenceGroupItem);
    return this;
  }

   /**
   * List of localized sentence group names.
   * @return sentenceGroup
  **/
  @ApiModelProperty(value = "List of localized sentence group names.")
  public List<VmOpenApiLanguageItem> getSentenceGroup() {
    return sentenceGroup;
  }

  public void setSentenceGroup(List<VmOpenApiLanguageItem> sentenceGroup) {
    this.sentenceGroup = sentenceGroup;
  }

  public VmOpenApiAccessibilitySentence sentences(List<VmOpenApiSentenceValue> sentences) {
    this.sentences = sentences;
    return this;
  }

  public VmOpenApiAccessibilitySentence addSentencesItem(VmOpenApiSentenceValue sentencesItem) {
    if (this.sentences == null) {
      this.sentences = new ArrayList<VmOpenApiSentenceValue>();
    }
    this.sentences.add(sentencesItem);
    return this;
  }

   /**
   * List of localized sentences.
   * @return sentences
  **/
  @ApiModelProperty(value = "List of localized sentences.")
  public List<VmOpenApiSentenceValue> getSentences() {
    return sentences;
  }

  public void setSentences(List<VmOpenApiSentenceValue> sentences) {
    this.sentences = sentences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiAccessibilitySentence vmOpenApiAccessibilitySentence = (VmOpenApiAccessibilitySentence) o;
    return Objects.equals(this.sentenceGroup, vmOpenApiAccessibilitySentence.sentenceGroup) &&
        Objects.equals(this.sentences, vmOpenApiAccessibilitySentence.sentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentenceGroup, sentences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiAccessibilitySentence {\n");
    
    sb.append("    sentenceGroup: ").append(toIndentedString(sentenceGroup)).append("\n");
    sb.append("    sentences: ").append(toIndentedString(sentences)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

