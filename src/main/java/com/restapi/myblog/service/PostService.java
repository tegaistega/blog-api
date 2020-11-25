package com.restapi.myblog.service;

import com.restapi.myblog.model.Post;
import com.restapi.myblog.payload.requests.PostRequest;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.payload.response.PostResponse;
import com.restapi.myblog.security.UserPrincipal;

public interface PostService {

    PagedResponse<Post> getAllPosts(int page, int size);

    PagedResponse<Post> getPostsByCreatedBy(String username, int page, int size);

    PagedResponse<Post> getPostsByCategory(Long id, int page, int size);

    PagedResponse<Post> getPostsByTag(Long id, int page, int size);

    Post updatePost(Long id, PostRequest newPostRequest, UserPrincipal currentUser);

    ApiResponse deletePost(Long id, UserPrincipal currentUser);

    PostResponse addPost(PostRequest postRequest, UserPrincipal currentUser);

    Post getPost(Long id);
}
