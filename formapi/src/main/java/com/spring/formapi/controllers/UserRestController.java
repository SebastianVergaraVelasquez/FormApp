package com.spring.formapi.controllers;

import com.spring.formapi.domain.models.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/form"})
public class UserRestController {
   
   @PostMapping({"/post"})
   public User postUser(@RequestBody User user) {
      return user;
   }
}
