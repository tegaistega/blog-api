package com.restapi.myblog.service;

import com.restapi.myblog.payload.requests.PhotoRequest;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.payload.response.PhotoResponse;
import com.restapi.myblog.security.UserPrincipal;

public interface PhotoService {

    PagedResponse<PhotoResponse> getAllPhotos(int page, int size);

    PhotoResponse getPhoto(Long id);

    PhotoResponse updatePhoto(Long id, PhotoRequest photoRequest, UserPrincipal currentUser);

    PhotoResponse addPhoto(PhotoRequest photoRequest, UserPrincipal currentUser);

    ApiResponse deletePhoto(Long id, UserPrincipal currentUser);

    PagedResponse<PhotoResponse> getAllPhotosByAlbum(Long albumid, int page, int size);
}
