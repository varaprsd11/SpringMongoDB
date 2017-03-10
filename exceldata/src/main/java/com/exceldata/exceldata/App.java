package com.exceldata.exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.net.UnknownHostException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		
		try {			
			
			CareHeroesExcelData data=null;
			FileInputStream file = new FileInputStream(new File("D:\\RamExcel.xlsx"));
			
			HSSFWorkbook workbook = new HSSFWorkbook(file);		
			int numberOfsheet = workbook.getNumberOfSheets();

			for (int j = 0; j < numberOfsheet; j++) {
							
			 HSSFSheet sheet =workbook.getSheetAt(j);			 
			
			 Row row1= sheet.getRow(0); 
			 sheet.removeRow(row1);
			 Row row;
			 for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				 
				 data=new CareHeroesExcelData();
				  row = sheet.getRow(i);
	           
	                data.setAgencyName(row.getCell(0).getStringCellValue());	          
	                data.setAgencyId((long)row.getCell(1).getNumericCellValue());	           
	                data.setProviderId((long)row.getCell(2).getNumericCellValue());
	                data.setPersonId((long)row.getCell(3).getNumericCellValue());	          
	                data.setFirstName(row.getCell(4).getStringCellValue());	            
	                data.setMiddleName(row.getCell(5).getStringCellValue());	           
	                data.setLastName(row.getCell(6).getStringCellValue());	           
	                data.setEmailAddress(row.getCell(7).getStringCellValue());	          
	                data.setPersonTypeCode(row.getCell(8).getStringCellValue());	         
	                data.setStartDate(String.valueOf(row.getCell(9).getDateCellValue()));	         
	                data.setEndDate(String.valueOf(row.getCell(10).getDateCellValue()));
	      	        data.setCity(row.getCell(11).getStringCellValue());	    
	                data.setZipCode((long)row.getCell(12).getNumericCellValue());	        
	                data.setJobTitle(row.getCell(13).getStringCellValue());	      
	                data.setJobType(row.getCell(14).getStringCellValue());	      
	                data.setPhone(row.getCell(15).getStringCellValue());
	                
	              /*  System.out.println(Process);
	                System.out.println(Level);
	                System.out.println(A);
	                System.out.println(B);
	              //  System.out.println(C);
	                
	                System.out.println(D);
	                System.out.println(E);
	                System.out.println(F);
	                System.out.println(G);
	                System.out.println(H);
	                
	                System.out.println(I);
	                System.out.println(J);
	                System.out.println(K);
	                System.out.println(L);
	                System.out.println(M);
	                
	              
	                System.out.println(N);
	                System.out.println(O);*/
	                
	                new App().add(data);
			 }
            
	   }
    }catch(Exception e){
    	
    }
}
    
	public void add(CareHeroesExcelData data) throws UnknownHostException{
		
		MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		
		System.out.println(mongoClient);
		
		
		@SuppressWarnings("deprecation")
		DB db = mongoClient.getDB("testingDb");
		
		DBCollection collection = db.getCollection("careHeroesExcelData");
		
		  BasicDBObject careHeroesExcelData = new BasicDBObject();
		  careHeroesExcelData.append("agencyName", data.getAgencyName());
		  careHeroesExcelData.append("agencyId", data.getAgencyId());
		  careHeroesExcelData.append("providerId", data.getProviderId());
		  careHeroesExcelData.append("personId", data.getPersonId());
		  careHeroesExcelData.append("firstName", data.getFirstName());
		  careHeroesExcelData.append("middleName", data.getMiddleName());
		  careHeroesExcelData.append("lastName", data.getLastName());
		  careHeroesExcelData.append("emailAddress", data.getEmailAddress());
		  careHeroesExcelData.append("personTypeCode", data.getPersonTypeCode());
		  careHeroesExcelData.append("startDate", data.getStartDate());
		  careHeroesExcelData.append("endDate", data.getEndDate());
		  careHeroesExcelData.append("city", data.getCity());
		  careHeroesExcelData.append("zipCode", data.getZipCode());
		  careHeroesExcelData.append("jobTitle", data.getJobTitle());
		  careHeroesExcelData.append("jobType", data.getJobType());
		  careHeroesExcelData.append("phone", data.getPhone());
		  
		  
		
	       collection.insert(careHeroesExcelData);
	       
	}
}
