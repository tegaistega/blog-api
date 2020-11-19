package com.restapi.myblog.payload.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author Tadi's
 * Tega Isiboge
 * */
@Data
public class CommentRequest {
    @NotBlank
    @Size(min = 12, message = "Comment body must not be less than or equal to 12 characters")
    private String commentBody;
}
