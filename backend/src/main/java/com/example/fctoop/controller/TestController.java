package com.example.fctoop.controller;

import com.example.fctoop.model.FCTdata;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TestController {
    @PostMapping("/test")
    public int test(){
        int a=22;
        return a;
    }

    @PostMapping("/login")
    public String login(){
        return "You are logged in!";
    }

    @GetMapping("/get-amount")
    public long getAmount(){
        return 100;
    }

    @GetMapping("/cal-add/{inp}")
    public int addition(@PathVariable int inp){
        int num = 10;
        return num + inp;
    }

    @GetMapping("/cal-sub")
    public int subtraction(@RequestParam int inp){
        int num = 10;
        return (num - inp);
    }

    @GetMapping("/cal-mul")
    public int multiplication(@RequestBody FCTdata fcTdata){
        int num = 10;
        return num * fcTdata.getVal1() * fcTdata.getVal2() * fcTdata.getVal3();
    }
}
