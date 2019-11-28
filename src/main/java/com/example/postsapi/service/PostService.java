package com.example.postsapi.service;

import com.example.postsapi.model.Post;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;

import java.io.IOException;
import java.net.MalformedURLException;

public interface PostService {

    public Iterable<Post> getAll();

    public Post searchById(long id);

    public HttpStatus deletePost(long id) throws IOException;

    public Post createPost(Post post, String username);

//    public HttpStatus updatePost(long id, Post postRequest);

}
