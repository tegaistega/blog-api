package com.restapi.myblog.payload.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class PhotoRequest {

    @NotBlank
    private String title;

    @NotBlank
    private String url;

    @NotBlank
    private String thumbnailUrl;

    @NotNull
    private Long albumid;
}
