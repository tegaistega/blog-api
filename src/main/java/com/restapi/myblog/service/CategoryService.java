package com.restapi.myblog.service;

import com.restapi.myblog.exception.UnauthorizedException;
import com.restapi.myblog.model.Category;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.security.UserPrincipal;
import org.springframework.http.ResponseEntity;

public interface CategoryService {
    PagedResponse<Category> getAllCategories(int page, int size);

    ResponseEntity<Category> getCategory(Long id);

    ResponseEntity<Category> addCategory(Category category, UserPrincipal currentUser);

    ResponseEntity<Category> updateCategory(Long id, Category newCategory, UserPrincipal currentUser)
            throws UnauthorizedException;

    ResponseEntity<ApiResponse> deleteCategory(Long id, UserPrincipal currentUser) throws UnauthorizedException;

}
