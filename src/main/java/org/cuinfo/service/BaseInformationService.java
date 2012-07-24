/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuinfo.service;

import java.util.List;
import org.cuinfo.pojo.User;

/**
 * 基本信息业务接口类
 * 每个方法抛出运行时异常;。便于业务逻辑出错时，用户体验
 * @author Administrator
 */
public interface BaseInformationService {
    /**
     * 获得所有用户
     * @return  获得集合链表
     */
    public List<User> getAll() ;
    /**
     * 保存一个用户信息
     * @param user 
     */
    public void save(User user) ;
     /**
     * 更新一个用户信息
     * @param user 
     */
    public void update(User user) ;
    /**
     * 删除一个用户信息
     * @param user 
     */
    public void delete(User user) ;
     /**
     * 查看一个用户信息
     * @param user 
     */
    public User view(User user) ;
}
