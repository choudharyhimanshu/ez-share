package live.himanshuchoudhary.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;

public class File {
    @JsonProperty("id")
    private UUID id = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("createdOn")
    private Date createdOn = null;

    @JsonProperty("size")
    private Integer size = null;

    @ApiModelProperty(value = "")
    @JsonProperty("id")
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }

    @ApiModelProperty(value = "")
    @JsonProperty("name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @ApiModelProperty(value = "")
    @JsonProperty("createdOn")
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @ApiModelProperty(value = "Size in KB")
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }
    public void setSize(Integer size) {
        this.size = size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class File {\n");

        sb.append("    id: ").append(id).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    createdOn: ").append(createdOn).append("\n");
        sb.append("    size: ").append(size).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
