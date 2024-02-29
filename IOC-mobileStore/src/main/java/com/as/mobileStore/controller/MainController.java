package com.as.mobileStore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.as.mobileStore.DAO.ImobileStore;
import com.as.mobileStore.entity.MobileStoreEntity;

@Service("cnt")
public class MainController {

	@Autowired
	private ImobileStore dao;
	
	public String registerProduct(MobileStoreEntity entity) throws Exception {
		return dao.createProduct(entity);
	}
}
