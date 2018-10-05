/*
 * PTV Open Api version 9
 * Here you can see listed all the PTV Open Api methods.
 *
 * OpenAPI spec version: v9
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * OPEN API - View Model of a accessibility sentence.
 */
@ApiModel(description = "OPEN API - View Model of a accessibility sentence.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-05T18:15:03.681+03:00")
public class VmOpenApiSentenceValue {
  @JsonProperty("sentence")
  private List<VmOpenApiLanguageItem> sentence = null;

  public VmOpenApiSentenceValue sentence(List<VmOpenApiLanguageItem> sentence) {
    this.sentence = sentence;
    return this;
  }

  public VmOpenApiSentenceValue addSentenceItem(VmOpenApiLanguageItem sentenceItem) {
    if (this.sentence == null) {
      this.sentence = new ArrayList<VmOpenApiLanguageItem>();
    }
    this.sentence.add(sentenceItem);
    return this;
  }

   /**
   * List of localized sentences.
   * @return sentence
  **/
  @ApiModelProperty(value = "List of localized sentences.")
  public List<VmOpenApiLanguageItem> getSentence() {
    return sentence;
  }

  public void setSentence(List<VmOpenApiLanguageItem> sentence) {
    this.sentence = sentence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VmOpenApiSentenceValue vmOpenApiSentenceValue = (VmOpenApiSentenceValue) o;
    return Objects.equals(this.sentence, vmOpenApiSentenceValue.sentence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentence);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VmOpenApiSentenceValue {\n");
    
    sb.append("    sentence: ").append(toIndentedString(sentence)).append("\n");
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
