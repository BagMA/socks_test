package com.exmple.service;



import com.exmple.dao.AccountDAO;
import com.exmple.dao.Operation;
import com.exmple.entity.Socks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SocksServiceImpl implements SocksService {

    @Autowired
    private AccountDAO accountDAO;

    @Override
    @Transactional
    public List<Socks> addSocks(int count, Socks socks) {
        return accountDAO.saveSocks(count, socks);
    }

    @Override
    @Transactional
    public List<Socks> getAllSocks(String color) {
        return accountDAO.getAllSocks(color);
    }

    @Override
    public List<Socks> getAllSocks(String color, String operation, int cottonPart) {
        return accountDAO.getAllSocks(color, operation, cottonPart);
    }
}
