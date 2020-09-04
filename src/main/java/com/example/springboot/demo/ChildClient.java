package com.example.springboot.demo;

import org.springframework.stereotype.Component;

/**
 * @Author : pp
 * @Date : 2020/9/3 20:32
 */
@Component
public class ChildClient extends Client {
    @Override
    public void run() {
        System.out.println(1);
    }
    public void eat() {
        System.out.println("eat");
    }
    

    public static void main(String[] args) {
        ChildClient childClient = new ChildClient();
        childClient.run();
        childClient.eat();
    }
}
