package com.rakuten.prj.dao;

import com.rakuten.prj.entity.Mobile;

public class MobileDaoMongoImpl implements MobileDao {

	@Override
	public void addMobile(Mobile m) {
		System.out.println("stored innn monngo DB");
	}

}
