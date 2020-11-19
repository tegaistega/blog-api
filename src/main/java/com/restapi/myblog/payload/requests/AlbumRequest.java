package com.restapi.myblog.payload.requests;

import com.restapi.myblog.model.Photo;
import com.restapi.myblog.model.user.User;
import com.restapi.myblog.payload.UserDateAuditPayload;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@Data
public class AlbumRequest extends UserDateAuditPayload {

    private Long albumrequestid;

    private String albumRequestTitle;

    private User user;

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
