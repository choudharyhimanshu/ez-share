package live.himanshuchoudhary.ezshare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import live.himanshuchoudhary.ezshare.util.LocalDateDeserializer;
import live.himanshuchoudhary.ezshare.util.LocalDateSerializer;

import java.time.LocalDateTime;
import java.util.List;

public class Directory {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("createdOn")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime createdOn = null;

    @JsonProperty("lastModified")
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime lastModified = null;

    @JsonProperty("files")
    private List<FileModel> files = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public List<FileModel> getFiles() {
        return files;
    }

    public void setFiles(List<FileModel> files) {
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

