package com.example.secureapplication.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApplicationRepository {

    public String hi() {
        return "Hi!";
    }

    public String welcome() {
        return "Welcome!";
    }

    public String read() {
        return "Y can reading";
    }

    public String write() {
        return "Y can write";
    }

    public String delete() {
        return "Delete!";
    }
}
