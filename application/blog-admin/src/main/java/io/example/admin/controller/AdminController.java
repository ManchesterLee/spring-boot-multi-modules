package io.example.admin.controller;

import io.example.entity.Post;
import io.example.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ManchesterLee  <a href="mailto:man.chester.lee.cn@gmail.com">Contact me.</a>
 * @version 1.0
 * @since 2018/11/24
 */
@RestController
@RequestMapping("/admin/post")
public class AdminController {
    @Autowired
    private PostService postService;

    @GetMapping
    public List<Post> findAll() {
        return postService.findAll();
    }

}
