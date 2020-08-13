package com.java.redfood.config;

import com.java.redfood.domain.Order;
import com.java.redfood.domain.User;
import com.java.redfood.domain.enums.OrderStatus;
import com.java.redfood.repositories.OrderRepository;
import com.java.redfood.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Dario", "dario@gmaio.com", "33 94567-9078", "1234");
        User u2 = new User(null, "Mario", "mario@gmaio.com", "34 94567-9090", "1256");

        Order o1 = new Order(null, Instant.parse("2020-06-20T19:53:07Z"), OrderStatus.DELIVERED, u1);
        Order o2 = new Order(null, Instant.parse("2020-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2020-07-22T15:21:22Z"), OrderStatus.PAID, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
