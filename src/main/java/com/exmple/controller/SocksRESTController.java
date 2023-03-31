package com.exmple.controller;



import com.exmple.dao.Operation;
import com.exmple.entity.Socks;
import com.exmple.service.SocksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SocksRESTController {

    @Autowired
    private SocksService socksService;

    @GetMapping("/socks")
    public List<Socks> showAllSocks(@RequestParam(required=true) String color){
//        String color = request.getParameter("color");
        List<Socks> allSocks = socksService.getAllSocks(color);
        return allSocks;
    }

    @GetMapping("/socks/cotton")
    public List<Socks> showSocksInColorAndCotton(@RequestParam(required = true) String color,
                                                 @RequestParam(required = true)String operation,
                                                 @RequestParam(required = true) int cottonPart){
        List<Socks> allSocks = socksService.getAllSocks(color, operation, cottonPart);
        return allSocks;
    }

    @PostMapping("/socks/add")
    public List<Socks> addNewsSocks(@RequestParam(required = true) int count, @RequestBody Socks socks){
        List<Socks> socksSave = socksService.addSocks(count, socks);
        return socksSave;
    }

}
