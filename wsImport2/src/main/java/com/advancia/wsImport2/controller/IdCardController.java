package com.advancia.wsImport2.controller;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.advancia.wsImport2.dao.IdCardDAO;
import com.advancia.wsImport2.ws.client.IdCard;

@Path("/idcard")
public class IdCardController {
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<IdCard> getIdCardList() {
        return IdCardDAO.getIdCardList();
    }
}
