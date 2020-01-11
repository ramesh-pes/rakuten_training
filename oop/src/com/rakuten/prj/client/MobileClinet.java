package com.rakuten.prj.client;

import com.rakuten.prj.dao.MobileDao;
import com.rakuten.prj.dao.MobileDaoMongoImpl;
import com.rakuten.prj.dao.MobileDaoMySQLImpl;
import com.rakuten.prj.entity.Mobile;

public class MobileClinet {
	public static void main(String[] args) {
		Mobile m = new Mobile();
		MobileDao mobiledao = new MobileDaoMySQLImpl();
		mobiledao.addMobile(m);
	}
}
