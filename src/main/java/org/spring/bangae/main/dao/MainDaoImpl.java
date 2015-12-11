package org.spring.bangae.main.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.spring.bangae.main.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bangae1 on 2015-12-11.
 */
@Repository
public class MainDaoImpl implements MainDao {

    @Autowired
    private SqlSessionTemplate sessionTemplate;

    public List selectUsers() {
        return sessionTemplate.selectList("user.selectUsers");
    }

    @Override
    public User selectUser(String id) {
        return sessionTemplate.selectOne("user.selectUser", id);
    }

    public void insertUser(User user) {
        sessionTemplate.insert("user.insertUser", user);
    }

    public void updateUser(User user) {
        sessionTemplate.update("user.updateUser", user);
    }
}
