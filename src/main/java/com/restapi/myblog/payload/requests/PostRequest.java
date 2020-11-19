package com.restapi.myblog.payload.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class PostRequest {

    @NotBlank
    private String postTitle;

    @NotBlank
    private String postBody;

    @NotNull
    private Long categoryId;

    private List<String> tags;

    public List<String> getTags(){
        return tags == null ? Collections.emptyList() : new ArrayList<>(tags);
    }

    public void setTags(List<String> tags){
        if(tags == null){
            this.tags = null;
        }else{
            this.tags = Collections.unmodifiableList(tags);
        }
    }
}
