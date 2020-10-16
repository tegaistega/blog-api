package com.restapi.myblog.exception;

import com.restapi.myblog.actionload.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Tadi's
 * Tega Isiboge
 * */

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class BadRequestException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private ApiResponse apiResponse;

    public BadRequestException(ApiResponse apiResponse){
        super();
        this.apiResponse = apiResponse;
    }

    public BadRequestException(String badRequestExceptionMessage){
        super(badRequestExceptionMessage);
    }

    public BadRequestException(String badRequestExceptionMessage, Throwable cause){
        super(badRequestExceptionMessage, cause);
    }

    public ApiResponse getApiResponse(){
        return apiResponse;
    }
}
