package com.exmple.controller;



import com.exmple.entity.Socks;
import com.exmple.service.SocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SocksRESTController {

    @Autowired
    private SocksService socksService;

    @GetMapping("/socks")
    public List<Socks> showAllSocks(){
        List<Socks> allSocks = socksService.getAllSocks();
        return allSocks;
    }

//    @GetMapping("/socks")
//    public List<Socks> showAllSocks(@RequestParam(required=false) String color){
////        String color = request.getParameter("color");
//        List<Socks> allSocks = socksService.getAllSocks(color);
//        return allSocks;
//    }
}
