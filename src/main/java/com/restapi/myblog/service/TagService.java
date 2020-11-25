package com.restapi.myblog.service;

import com.restapi.myblog.model.Tag;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.security.UserPrincipal;

public interface TagService {

    PagedResponse<Tag> getAllTags(int page, int size);

    Tag getTag(Long id);

    Tag addTag(Tag tag, UserPrincipal currentUser);

    Tag updateTag(Long id, Tag newTag, UserPrincipal currentUser);

    ApiResponse deleteTag(Long id, UserPrincipal currentUser);
}
