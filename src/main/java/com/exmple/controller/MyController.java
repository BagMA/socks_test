//package com.exmple.controller;
//
//
//import com.exmple.dao.SocksRepository;
//import com.exmple.entity.Socks;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api")
//public class MyController {
//
//    @Autowired
//    private SocksRepository socksRepository;
//
//    @GetMapping("/all")
//    public @ResponseBody Iterable<Socks> getAllSocks(){
//        return socksRepository.findAll();
//    }
//
//}
