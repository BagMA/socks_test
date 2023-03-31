package com.exmple.dao;


import com.exmple.entity.Socks;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Socks> getAllSocks(String color) {
        Session session = entityManager.unwrap(Session.class);
        //List<Socks> allSocks = session.createQuery("from Socks", Socks.class).getResultList();
        Query<Socks> query = session.createQuery("from Socks where color= :paramColor", Socks.class);
        query.setParameter("paramColor", color);
        List<Socks> allSocks = query.getResultList();
        if (allSocks.size() == 0){
            System.out.println("Таких носков нет!");
        }
        return allSocks;
    }

    @Override
    public List<Socks> getAllSocks(String color, String operation, int cottonPart) {
        Session session = entityManager.unwrap(Session.class);
//        String moreThan = Operation.MORE_THAN.getState();
        List<Socks> allSocks = null;
        Query<Socks> query;
        switch (operation) {
            case "moreThan":
                 query = session.createQuery("from Socks where color= :paramColor and cotton_part> :paramCotton", Socks.class);
                query.setParameter("paramColor", color);
                query.setParameter("paramCotton", cottonPart);
                allSocks = query.getResultList();
                if (allSocks.size() == 0){
                    System.out.println("Таких носков нет!");
                }
                break;
//                return allSocks;
            case "lessThan":
                 query = session.createQuery("from Socks where color= :paramColor and cotton_part< :paramCotton", Socks.class);
                query.setParameter("paramColor", color);
                query.setParameter("paramCotton", cottonPart);
                allSocks = query.getResultList();
                if (allSocks.size() == 0){
                    System.out.println("Таких носков нет!");
                }
                break;
        }
        return allSocks;
    }

    @Override
    public List<Socks> saveSocks(int count, Socks socks) {
        List<Socks> socksList = new ArrayList<Socks>();
        for (int index = 0; index < count; index++) {
            Socks socks1 = entityManager.merge(socks);
            socks.setColor(socks1.getColor());
            socks.setCottonPart(socks1.getCottonPart());
            socksList.add(socks);
        }
        return socksList;
    }
}
