package com.startsi.hnhousehold.dao;

import java.util.List;

import com.startsi.hnhousehold.model.Hkz;


public interface HzDao extends BaseDao{
public List<Hkz> getHkzList() throws Exception;

}
