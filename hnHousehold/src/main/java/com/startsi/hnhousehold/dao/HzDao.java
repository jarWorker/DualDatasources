package com.startsi.hnhousehold.dao;

import java.util.List;

import com.startsi.hnhousehold.model.Hkz;
import com.startsi.hnhousehold.model.HkzMysql;

public interface HzDao extends BaseDao{
public List<Hkz> getHkzList() throws Exception;
public List<HkzMysql> getHkzMysqlList() throws Exception;
}
