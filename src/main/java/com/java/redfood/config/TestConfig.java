package com.java.redfood.config;

import com.java.redfood.domain.User;
import com.java.redfood.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(1L, "Dario", "dario@gmaio.com", "33 94567-9078", "1234");
        User u2 = new User(2L, "Mario", "mario@gmaio.com", "34 94567-9090", "1256");
        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
