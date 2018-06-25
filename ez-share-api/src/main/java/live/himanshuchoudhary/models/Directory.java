package live.himanshuchoudhary.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class Directory {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("createdOn")
    private Date createdOn = null;

    @JsonProperty("lastModified")
    private Date lastModified = null;

    @JsonProperty("files")
    private List<File> files = null;

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

    @ApiModelProperty(value = "")
    @JsonProperty("lastModified")
    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("files")
    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Directory {\n");

        sb.append("    name: ").append(name).append("\n");
        sb.append("    createdOn: ").append(createdOn).append("\n");
        sb.append("    lastModified: ").append(lastModified).append("\n");
        sb.append("    files: ").append(files).append("\n");
        sb.append("}");
        return sb.toString();
    }
}

