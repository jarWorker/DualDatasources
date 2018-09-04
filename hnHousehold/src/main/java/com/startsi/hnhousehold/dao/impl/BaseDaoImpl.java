package com.startsi.hnhousehold.dao.impl;



import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;

import com.startsi.hnhousehold.dao.BaseDao;

@Service
public class BaseDaoImpl implements BaseDao {

	public SessionFactory sessionFactory1;
	
	public SessionFactory sessionFactory2;
	@Override
	public String saveObjectOfMysql(Object object) throws Exception {
	Serializable id=this.sessionFactory2.getCurrentSession().save(object);
		return id.toString();
	}

	@Override
	public String updateObject(Object object) throws Exception {
		// TODO Auto-generated method stub
		this.sessionFactory1.getCurrentSession().update(object);
		return "success";
	}
		
	public SessionFactory getSessionFactory1() {
		return sessionFactory1;
	}

	public void setSessionFactory1(SessionFactory sessionFactory1) {
		this.sessionFactory1 = sessionFactory1;
	}

	public SessionFactory getSessionFactory2() {
		return sessionFactory2;
	}

	public void setSessionFactory2(SessionFactory sessionFactory2) {
		this.sessionFactory2 = sessionFactory2;
	}

	

	
	

}
