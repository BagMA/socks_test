package com.exmple.service;


import com.exmple.dao.Operation;
import com.exmple.entity.Socks;

import java.util.List;

public interface SocksService {

    List<Socks> getAllSocks(String color);

    List<Socks> getAllSocks(String color, String operation, int cottonPart);

    List<Socks> addSocks(int count, Socks socks);
}
