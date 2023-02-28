package com.example.service;

import com.example.model.Song;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HibernateSongService implements SongService{
//    private static SessionFactory sessionFactory;
//    private static EntityManager entityManager;
//
//    static {
//        try {
//            sessionFactory = new Configuration()
//                    .configure("hibernate.conf.xml")
//                    .buildSessionFactory();
//            entityManager = sessionFactory.createEntityManager();
//        } catch (HibernateException e) {
//            e.printStackTrace();
//        }
//    }
    //khai bao nay performance hơn
    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private EntityManager entityManager;
    @Autowired
    public List<Song> findAll(){
        TypedQuery<Song> query = entityManager.createQuery("select s from Song  as s", Song.class);
    return query.getResultList();
    }

    @Override
    public Song findOne(Long id) {
        return null;
    }

    @Override
    public Song save(Song song) {
        return null;
    }
}
