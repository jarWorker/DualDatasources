package com.startsi.hnhousehold.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startsi.hnhousehold.dao.HzDao;
import com.startsi.hnhousehold.model.Hkz;
import com.startsi.hnhousehold.model.HkzMysql;
import com.startsi.hnhousehold.service.HzService;

@Service
public class HzServiceImpl implements HzService {

	@Autowired
	private HzDao hzDao;

	
	@Override
	public void starthzService() throws Exception {
		// TODO Auto-generated method stub

		System.out.println(hzDao);
		System.out.println("进入service");
		List<Hkz> hkzList = hzDao.getHkzList();
		System.out.println("hkzList开始"+hkzList);
		Hkz hkz=null;
		if(hkzList!=null) {
			 hkz = hkzList.get(0);
		}
		
		System.out.println("查询开始");
		try {
		if (null!=hkz) {
			System.err.println("有数据");
			String id = hkz.getId();
			String name = hkz.getName();
			System.out.println(name);
			HkzMysql mysql = new HkzMysql();
			mysql.setId(id);
			mysql.setName(name);
			hzDao.saveObjectOfMysql(mysql);
			hkz.setFlag("1");
			hzDao.updateObject(hkz);
			System.out.println("hkz更新成功" + hkz);
			
		} if((null==hkz)) {
			System.out.println("没有数据");
			} 
		}catch (Exception e) {
			// TODO: handle exception
			hkz.setFlag("E");
			hzDao.updateObject(hkz);
			System.out.println("发生异常"+e.getMessage());
		}
	}

}
