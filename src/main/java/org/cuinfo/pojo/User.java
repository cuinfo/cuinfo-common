/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuinfo.pojo;

import java.io.Serializable;

/**
 *基本用户
 * @author Administrator
 */
public class User extends BasePOJO implements Serializable{
    /*
     *识别标识
     */
    private Integer id;
    /*
     * 登陆名
     */
    private String loginName;
    /**
     * 登陆密码
     */
    private String loginPsw;
    /**
     * E-mail
     */
    private String eMail;
    /**
     * 用户昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;

    public User() {
    }

    public User(String loginName, String loginPsw) {
        this.loginName = loginName;
        this.loginPsw = loginPsw;
    }

    

    
    
    
    
    @Override
    public Integer getId() {
        return this.id;
    }

   
    @Override
    public void setId(Integer id) {
        this.id=id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
   

    public String getLoginPsw() {
        return loginPsw;
    }

    public void setLoginPsw(String loginPsw) {
        this.loginPsw = loginPsw;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final User other = (User) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", loginName=" + loginName + ", loginPsw=" + loginPsw + ", eMail=" + eMail + ", name=" + name + ", sex=" + sex + '}';
    }
    
   
}
