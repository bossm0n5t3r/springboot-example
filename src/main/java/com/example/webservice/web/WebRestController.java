package com.example.webservice.web;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import com.example.webservice.dto.posts.PostsSaveRequestDto;
import com.example.webservice.service.PostsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@AllArgsConstructor
public class WebRestController {
    
    private PostsService postsService;

    @GetMapping(value="/hello")
    public String hello() {
        return "HelloWorld";
    }
    
    @PostMapping(value="/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
        return postsService.save(dto);
    }

}