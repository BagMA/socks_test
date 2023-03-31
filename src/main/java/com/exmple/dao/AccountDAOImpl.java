package com.exmple.dao;


import com.exmple.entity.Socks;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class AccountDAOImpl implements AccountDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Socks> getAllSocks() {
        Session session = entityManager.unwrap(Session.class);
        Query<Socks> query = session.createQuery("from Socks", Socks.class);
        List<Socks> allSocks = query.getResultList();
//        List<Socks> allSocks = session.createQuery("from Socks", Socks.class).getResultList();
        return allSocks;
    }

//    @Override
//    public List<Socks> getAllSocks(String color) {
//        Session session = sessionFactory.getCurrentSession();
//        List<Socks> allSocks = session.createQuery("from Socks", Socks.class).getResultList();
//        List<Socks> socksNewList = new ArrayList<Socks>();
//        for (Socks socksOne: allSocks) {
//            if (color == socksOne.getColor()){
//                socksNewList.add(socksOne);
//            }
//        }
//        if (socksNewList.size() == 0){
//            System.out.println("Таких носков нет!");
//        }
//        return socksNewList;
//    }
}
