package org.spring.bangae.main.model;

/**
 * Created by bangae1 on 2015-12-11.
 */
public class User {
    private String id;
    private String name;
    private String tel;
    private String age;
    private String gender;
    private String add_date;

    public User() {
    }

    public User(String id, String name, String tel, String age, String gender, String add_date) {

        this.id = id;
        this.name = name;
        this.tel = tel;
        this.age = age;
        this.gender = gender;
        this.add_date = add_date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAdd_date() {
        return add_date;
    }

    public void setAdd_date(String add_date) {
        this.add_date = add_date;
    }
}
