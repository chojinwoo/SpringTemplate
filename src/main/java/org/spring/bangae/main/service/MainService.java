package org.spring.bangae.main.service;

import org.spring.bangae.main.model.User;

import java.util.List;

/**
 * Created by bangae1 on 2015-12-11.
 */
public interface MainService {
    public List selectUsers();
    public User selectUser(String id);
    public void insertUser(User user);
    public void updateUser(User user);
}
