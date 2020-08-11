package com.java.redfood.resources;

import com.java.redfood.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Dario", "dario@gmaio.com", "33 94567-9078", "1234");
        return ResponseEntity.ok().body(u);
    }
}
