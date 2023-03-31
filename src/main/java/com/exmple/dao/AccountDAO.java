package com.exmple.dao;


import com.exmple.entity.Socks;
import java.util.List;

public interface AccountDAO {

    List<Socks> getAllSocks(String color);
    List<Socks> getAllSocks(String color, String operation, int cottonPart);
    List<Socks> saveSocks(int count, Socks socks);


}
