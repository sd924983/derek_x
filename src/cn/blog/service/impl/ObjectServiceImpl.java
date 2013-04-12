package cn.blog.service.impl;

import java.io.Serializable;


import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.blog.model.user.User;
import cn.blog.service.ObjectService;

@Service @Transactional
public class ObjectServiceImpl implements ObjectService {
	@Resource SessionFactory sessionFactory;
	
	public void save(Object object) {
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public Object find(Serializable objId) {
		return sessionFactory.getCurrentSession().get(Object.class, objId);
	}

	@Override
	public void delete(Serializable objId) {
		sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().load(Object.class, objId));
	}

	@Override
	public void update(Object object) {
		sessionFactory.getCurrentSession().merge(object);
	}

	@Override
	public boolean validate(String account, String password) {
		User validater = (User) sessionFactory.getCurrentSession().createQuery("from User o where o.account=? and o.password=?")
				.setParameter(0, account).setParameter(1, password).uniqueResult();
		return validater!=null;
	
	
	}

	@Override
	public Object findByAccount(String account) {
		return sessionFactory.getCurrentSession().createQuery("from User o where o.account=?").setParameter(0, account).uniqueResult();
	}

}
