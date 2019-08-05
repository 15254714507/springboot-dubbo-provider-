/**
 * 
 */
package com.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.alibaba.dubbo.config.annotation.Service;
import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;

/**
 * @author 作者
 * @data 2019年7月31日 
 */
@Service(version = "${demo.service.version}")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> getAllUser() throws Exception {
		List<User> list = null;
	System.out.println("1111111");
			try {
				 list = userMapper.getAllUser();
				System.out.println("2222222");
				return list;
			} catch (Exception e) {
				 TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
			}
	
		return list;
	}
	
}
