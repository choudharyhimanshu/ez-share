package live.himanshuchoudhary.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import live.himanshuchoudhary.model.File;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaInflectorServerCodegen", date = "2018-06-24T08:20:58.683Z")
public class Directory {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("createdOn")
    private Date createdOn = null;

    @JsonProperty("lastModified")
    private Date lastModified = null;

    @JsonProperty("files")
    private List<File> files = null;

    /**
     **/
    public Directory name(String name) {
        this.name = name;
        return this;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     **/
    public Directory createdOn(Date createdOn) {
        this.createdOn = createdOn;
        return this;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("createdOn")
    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    /**
     **/
    public Directory lastModified(Date lastModified) {
        this.lastModified = lastModified;
        return this;
    }


    @ApiModelProperty(value = "")
    @JsonProperty("lastModified")
    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date lastModified) {
        this.lastModified = lastModified;
    }

    /**
     **/
    public Directory files(List<File> files) {
        this.files = files;
        return this;
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Directory directory = (Directory) o;
        return Objects.equals(name, directory.name) &&
                Objects.equals(createdOn, directory.createdOn) &&
                Objects.equals(lastModified, directory.lastModified) &&
                Objects.equals(files, directory.files);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, createdOn, lastModified, files);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Directory {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
        sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
        sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

