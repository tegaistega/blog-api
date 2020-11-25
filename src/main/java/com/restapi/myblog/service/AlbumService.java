package com.restapi.myblog.service;

import com.restapi.myblog.payload.requests.AlbumRequest;
import com.restapi.myblog.payload.response.AlbumResponse;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.model.Album;
import com.restapi.myblog.security.UserPrincipal;
import org.springframework.http.ResponseEntity;


/**
 * @author Tadi's
 * Tega Isiboge
 * */
public interface AlbumService {

    PagedResponse<AlbumResponse> getAllAlbums(int page, int size);

    ResponseEntity<Album> addAlbum(AlbumRequest albumRequest,
                                   UserPrincipal currentUser);

    ResponseEntity<Album> getAlbum(Long id);

    ResponseEntity<AlbumResponse> updateAlbum(Long id, AlbumRequest newAlbum, UserPrincipal currentUser);

    ResponseEntity<ApiResponse> deleteAlbum(Long id, UserPrincipal currentUser);

    PagedResponse<Album> getUserAlbums(String username, int page, int size);

}
