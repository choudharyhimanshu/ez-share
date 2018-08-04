package live.himanshuchoudhary.ezshare.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ApiResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

  public ApiResponse(Integer code, String type, String message){
    this.code = code;
    this.type = type;
    this.message = message;
  }

  public ApiResponse(String message){
    this.message = message;
  }

  public Integer getCode() {
    return code;
  }
  public void setCode(Integer code) {
    this.code = code;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelApiResponse {\n");
    
    sb.append("    code: ").append(code).append("\n");
    sb.append("    type: ").append(type).append("\n");
    sb.append("    message: ").append(message).append("\n");
    sb.append("}");
    return sb.toString();
  }

}
