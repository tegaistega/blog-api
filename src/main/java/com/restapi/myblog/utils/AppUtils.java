package com.restapi.myblog.utils;

import com.restapi.myblog.exception.BlogApiException;
import org.springframework.http.HttpStatus;

public class AppUtils {

    public static void validatePageNumberAndSize(int page, int size){
        if(page <= 0){
            throw new BlogApiException(HttpStatus.BAD_REQUEST, "page number cannot be less than or equal to zero");
        }
        if (size < 0) {
            throw new BlogApiException(HttpStatus.BAD_REQUEST, "size number cannot be less than zero");
        }

        if (size > ApplicationConstants.MAX_PAGE_SIZE){
            throw new BlogApiException(HttpStatus.BAD_REQUEST, "page size cannot exceed" + ApplicationConstants.MAX_PAGE_SIZE);
        }
    }
}
