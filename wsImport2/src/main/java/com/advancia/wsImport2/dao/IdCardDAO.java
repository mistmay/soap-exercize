package com.advancia.wsImport2.dao;

import java.util.List;

import com.advancia.wsImport2.ws.client.IdCard;
import com.advancia.wsImport2.ws.client.IdCardServiceImpl;
import com.advancia.wsImport2.ws.client.IdCardServiceImplService;

public class IdCardDAO {
	public static List<IdCard> getIdCardList() {
		IdCardServiceImplService service = new IdCardServiceImplService();
		IdCardServiceImpl eSrc = service.getIdCardServiceImplPort();
		return eSrc.getIdCardList();
	}

}
