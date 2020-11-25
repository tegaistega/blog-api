package com.restapi.myblog.service;

import com.restapi.myblog.model.Todo;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.payload.response.PagedResponse;
import com.restapi.myblog.security.UserPrincipal;

public interface TodoService {

    Todo completeTodo(Long id, UserPrincipal currentUser);

    Todo unCompleteTodo(Long id, UserPrincipal currentUser);

    PagedResponse<Todo> getAllTodos(UserPrincipal currentUser, int page, int size);

    Todo addTodo(Todo todo, UserPrincipal currentUser);

    Todo getTodo(Long id, UserPrincipal currentUser);

    Todo updateTodo(Long id, Todo newTodo, UserPrincipal currentUser);

    ApiResponse deleteTodo(Long id, UserPrincipal currentUser);

}
