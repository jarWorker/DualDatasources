package com.startsi.hnhousehold.dao.impl;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Service;

import com.startsi.hnhousehold.dao.HzDao;
import com.startsi.hnhousehold.model.Hkz;
import com.startsi.hnhousehold.model.HkzMysql;

@Service
public class HzDaoImpl extends BaseDaoImpl implements HzDao {

	@Override
	public List<Hkz> getHkzList() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("1====="+sessionFactory1);
		System.out.println("2====="+sessionFactory2);
		Criteria criteria = this.sessionFactory1.getCurrentSession().createCriteria(Hkz.class);
		criteria.add(Restrictions.eq("flag", "0"));
		/*System.out.println("sesion===="+this.sessionFactory1.getCurrentSession());
		System.out.println("criteria===="+criteria.list());*/
		
			return criteria.list().size()==0?null:criteria.list();
}
