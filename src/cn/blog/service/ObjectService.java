package cn.blog.service;

import java.io.Serializable;
import java.util.List;

public interface ObjectService {
	
	/**
	 * 保存记录
	 * @param object
	 */
	public void save(Object object);
	
	/**
	 * 根据ID查找记录
	 * @param objId
	 * @return
	 */
	public Object find(Serializable objId);
	
	/**
	 * 删除记录
	 * @param objId
	 */
	public void delete(Serializable objId);
	
	/**
	 * 更新记录
	 * @param object
	 */
	public void update(Object object);
	
	/**
	 * 登录验证，用户名密码是否正确
	 * @param account
	 * @param password
	 * @return
	 */
	public boolean validate(String account, String password);
	
	/**
	 * 根据用户名查找用户
	 * @param account
	 * @return
	 */
	public Object findByAccount(String account);
	
}
