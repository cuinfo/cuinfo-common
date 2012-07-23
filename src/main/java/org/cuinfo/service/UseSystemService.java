/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cuinfo.service;

import org.cuinfo.exception.SystemException;
import org.cuinfo.pojo.User;

/**
 *使用系统，登陆，退出等
 * @author Administrator
 */
public interface UseSystemService {
        /**
	 * 检查用户是否是平台用户，若是返回用户信息，否则抛出异常信息
	 * @param user
	 * @return
	 * @throws SystemException 
	 */
	public User checkUser(User user) throws SystemException;
	/***
	 * 修改用户密码
	 * @param newUser
	 * @param oldUser
	 */
	public void modifyPassword(User newUser, User oldUser);
}
