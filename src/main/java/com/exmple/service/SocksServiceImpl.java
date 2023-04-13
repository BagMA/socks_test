package com.exmple.service;



import com.exmple.dao.AccountDAO;
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
    public List<Socks> getAllSocks() {
        return accountDAO.getAllSocks();
    }

//    @Override
//    @Transactional
//    public List<Socks> getAllSocks(String color) {
//        return accountDAO.getAllSocks(color);
//    }
}
