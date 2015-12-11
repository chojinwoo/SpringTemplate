package org.spring.bangae.main.service;

import org.spring.bangae.main.dao.MainDao;
import org.spring.bangae.main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by bangae1 on 2015-12-11.
 */
@Service
public class MainServiceImpl implements MainService {
    @Autowired
    private MainDao mainDao;

    @Override
    @Transactional
    public List selectUsers(){
        mainDao.insertUser(createUser());
        mainDao.updateUser(updateUser());
        mainDao.insertUser(createUser());
        return mainDao.selectUsers();
    }

    @Override
    public User selectUser(String id) {
        return null;
    }

    @Override
    public void insertUser(User user) {

    }

    @Override
    public void updateUser(User user) {

    }

    public User createUser() {
        User user = new User();
        user.setAge("11");
        user.setGender("m");
        user.setId("bangae1");
        user.setName("chojinwoo");
        user.setTel("010-5338-1140");
        return user;
    }

    public User updateUser() {
        User user = new User();
        user.setAge("27");
        user.setGender("m");
        user.setId("bangae1");
        user.setName("Á¶Áø¿ì");
        user.setTel("010-5338-1141");
        return user;
    }
}
