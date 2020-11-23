package com.restapi.myblog.payload.response;

import lombok.Data;

@Data
public class PhotoResponse {

    private Long id;
    private String title;
    private String url;
    private String thumbnailUrl;
    private Long albumid;

    public PhotoResponse(Long id, String title, String url, String thumbnailUrl, Long albumid){
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
        this.albumid = albumid;
    }
}
