package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.HelloRepository;
import com.example.demo.repository.Greeting;

@Service
public class HelloService {

    @Autowired
    private HelloRepository helloRepository;

    public Greeting getGreetingById(long id) {
        return helloRepository.findById(id);
    }
}
