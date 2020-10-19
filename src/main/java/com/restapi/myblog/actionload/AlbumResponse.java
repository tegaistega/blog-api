package com.restapi.myblog.actionload;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.restapi.myblog.model.Photo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@EqualsAndHashCode(callSuper = true)
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AlbumResponse extends UserDateAuditPayload{

    private Long id;

    private String title;

    private List<Photo> photo;

    public List<Photo> getPhoto(){
        return photo == null ? null : new ArrayList<>(photo);
    }

    public void setPhoto(List<Photo> photo){
        if(photo == null){
            this.photo = null;
        }else{
            this.photo = Collections.unmodifiableList(photo);
        }
    }
}
