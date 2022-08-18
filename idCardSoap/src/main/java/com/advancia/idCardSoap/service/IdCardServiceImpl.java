package com.advancia.idCardSoap.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Base64;

import javax.imageio.ImageIO;


import com.advancia.idCardSoap.model.IdCard;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class IdCardServiceImpl {
	private static final String baseUrl = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "webapp" + File.separator + "assets" + File.separator;
	
	@WebMethod
	public List<IdCard> getIdCardList() {
		List<IdCard> idCardList = new ArrayList<>();
		idCardList.add(new IdCard("Giuseppe", "Marchesiello", generateDate("25/02/1990"), generatePhoto(baseUrl + "img1.png")));
		idCardList.add(new IdCard("Germano", "Maestri", generateDate("02/10/1995"), generatePhoto(baseUrl + "img2.png")));
		idCardList.add(new IdCard("Pinco", "Pallino", generateDate("15/08/1970"), generatePhoto(baseUrl + "img3.jpg")));
		return idCardList;
	}
	
	private Date generateDate(String date) {
		try {
			return new SimpleDateFormat("dd/MM/yyyy").parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			return new Date();
		}
	}
	
	private String generatePhoto(String url) {
		String imageString = null;  
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			BufferedImage bImage = ImageIO.read(new File(url));
			ImageIO.write(bImage, "png", bos );
			byte[] imageBytes = bos.toByteArray(); 
	        imageString = Base64.getEncoder().encodeToString(imageBytes);  
	        bos.close(); 
		} catch (IOException e) {  
            e.printStackTrace();  
        }  
		return imageString;
	}
}
