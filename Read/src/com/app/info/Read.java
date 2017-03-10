package com.app.info;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.UnknownHostException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

public class Read {
	
	
	
	
	public void add(CareHeroesExcelData data) throws UnknownHostException{
/*		MongoTemplate mongoTemplate =
				new MongoTemplate(new MongoClient("localhost:27017"),"testingDb");
		mongoTemplate.save(data);*/
		
		MongoClient mongo = new MongoClient( "localhost" , 27017 );
		
	}
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			@SuppressWarnings("deprecation")
			Mongo mongo = new Mongo("localhost", 27017);
			
			System.out.println(mongo);
			
			CareHeroesExcelData data=null;
			FileInputStream file = new FileInputStream(new File("D:\\RamExcel.xlsx"));
			
			HSSFWorkbook workbook = new HSSFWorkbook(file);		
			HSSFSheet sheet = workbook.getSheetAt(0);
			 Row row1= sheet.getRow(0); 
			 sheet.removeRow(row1);
			 Row row;
			 for (int i = 1; i <= sheet.getLastRowNum(); i++) {
				 
				 data=new CareHeroesExcelData();
				  row = sheet.getRow(i);
	                String Process = row.getCell(0).getStringCellValue();
	                data.setAgencyName(row.getCell(0).getStringCellValue());
	                long Level = (long)row.getCell(1).getNumericCellValue();
	                data.setAgencyId((long)row.getCell(1).getNumericCellValue());
	                long A = (long)row.getCell(2).getNumericCellValue();
	                data.setProviderId((long)row.getCell(2).getNumericCellValue());
	                long B = (long)row.getCell(3).getNumericCellValue();
	                data.setPersonId((long)row.getCell(3).getNumericCellValue());
	                String D = row.getCell(4).getStringCellValue();
	                data.setFirstName(row.getCell(4).getStringCellValue());
	                String E = row.getCell(5).getStringCellValue();
	                data.setMiddleName(row.getCell(5).getStringCellValue());
	                String F = row.getCell(6).getStringCellValue();
	                data.setLastName(row.getCell(6).getStringCellValue());
	                String G = row.getCell(7).getStringCellValue();
	                data.setEmailAddress(row.getCell(7).getStringCellValue());
	                String H = row.getCell(8).getStringCellValue();
	                data.setPersonTypeCode(row.getCell(8).getStringCellValue());
	                String I = String.valueOf(row.getCell(9).getDateCellValue());
	                data.setStartDate(String.valueOf(row.getCell(9).getDateCellValue()));
	                String J = String.valueOf(row.getCell(10).getDateCellValue());
	                data.setEndDate(String.valueOf(row.getCell(10).getDateCellValue()));
	                String K = row.getCell(11).getStringCellValue();
	                data.setCity(row.getCell(11).getStringCellValue());
	                long L = (long)row.getCell(12).getNumericCellValue();
	               data.setZipCode((long)row.getCell(12).getNumericCellValue());
	                String M = row.getCell(13).getStringCellValue();
	                data.setJobTitle(row.getCell(13).getStringCellValue());
	                String N = row.getCell(14).getStringCellValue();
	                data.setJobType(row.getCell(14).getStringCellValue());
	                String O = row.getCell(15).getStringCellValue();
	                
	                System.out.println(Process);
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
	                System.out.println(O);
	                
                
			 }
                 
			new Read().add(data);
            /*Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next();
            while(rowIterator.hasNext())
            {
            	
            }*/
    }catch(Exception e){
    	
    }
}
}
	
/*	
	String i="0";
	CareHeroesExcelData data=null;
	FileInputStream file = new FileInputStream(new File("D:\\RamExcel.xlsx"));
	
	HSSFWorkbook workbook = new HSSFWorkbook(file);		
	HSSFSheet sheet = workbook.getSheetAt(0);
	 Row row1= sheet.getRow(0); 
	 sheet.removeRow(row1);
	Iterator<Row> rowIterator = sheet.iterator();
	while(rowIterator.hasNext()) {
		
		data=new CareHeroesExcelData();
		Row row = rowIterator.next();
		
		
		System.out.println(row.);
		
		
		Iterator<Cell> cellIterator = row.cellIterator();
		while(cellIterator.hasNext()) {
			
			Cell cell = cellIterator.next();
			System.out.println(cell);
			if(String.valueOf(i).equals(String.valueOf(cell.getCellType()))){
			    long name =(long)(cell.getNumericCellValue());
				System.out.println(name+"====");
				
				System.out.println("number==============");
				
				
			}else{
			     data.set
				System.out.println("String==============");
			}
			data.setAgencyName(cell.getStringCellValue());
			 System.out.println(data);
			data.setAgencyId(cell.getStringCellValue());
			 System.out.println(data);
	        data.setProviderId(cell.getStringCellValue());
	        System.out.println(data);
	        data.setPersonId(cell.getStringCellValue());
	        System.out.println(data);
	        data.setFirstName(cell.getStringCellValue());
	        System.out.println(data);
	        
	        data.setMiddleName(cell.getStringCellValue());
	        System.out.println(data);
	        data.setLastName(cell.getStringCellValue());
	        System.out.println(data);
	        data.setEmailAddress(cell.getStringCellValue());
	        System.out.println(data);
	        data.setPersonTypeCode(cell.getStringCellValue());
	        System.out.println(data);
	        data.setStartDate(cell.getStringCellValue());
	        System.out.println(data);
	        data.setEndDate(cell.getStringCellValue());
	        System.out.println(data);
	        
	        data.setCity(cell.getStringCellValue());
	        System.out.println(data);
	        data.setZipCode(cell.getStringCellValue());	
	        System.out.println(data);
	        data.setJobTitle(cell.getStringCellValue());
	        System.out.println(data);
	        data.setJobType(cell.getStringCellValue());
	        System.out.println(data);
	        data.setLastName(cell.getStringCellValue()); 
	        System.out.println(data);
	        data.setPhone(cell.getStringCellValue());
	        System.out.println(data);
	        
	       
	        
	    //    System.out.println(data);
   }	
 } 

}
*/
		
		/*
		switch(cell.getCellType()) 
        {
            case Cell.CELL_TYPE_BOOLEAN:
                System.out.println("boolean===>>>"+cell.getBooleanCellValue() + "\t");
                break;
            case Cell.CELL_TYPE_NUMERIC:
                System.out.println("numeric===>>>"+cell.getNumericCellValue() + "\t");
                data.setAgencyId((long)cell.getNumericCellValue());               			 
       	        data.setProviderId((long)cell.getNumericCellValue());               	        
       	        data.setPersonId((long)cell.getNumericCellValue());
       	        data.setZipCode((long)cell.getNumericCellValue());
       	     data.setPhone((long)cell.getNumericCellValue());
       	     System.out.println(data);
                break;
            case Cell.CELL_TYPE_STRING:
                System.out.println("String===>>>"+cell.getStringCellValue() + "\t");
                data.setAgencyName(cell.getStringCellValue());               			
   			              	       
   	        data.setFirstName(cell.getStringCellValue());               	     
   	        
   	        data.setMiddleName(cell.getStringCellValue());               	       
   	        data.setLastName(cell.getStringCellValue());               	        
   	        data.setEmailAddress(cell.getStringCellValue());               	       
   	        data.setPersonTypeCode(cell.getStringCellValue());               	       
   	        data.setStartDate(cell.getStringCellValue());               	       
   	        data.setEndDate(cell.getStringCellValue());             	       
   	        
   	        data.setCity(cell.getStringCellValue());               	      
   	                      	      
   	        data.setJobTitle(cell.getStringCellValue());
   	       
   	        data.setJobType(cell.getStringCellValue());
   	        
   	        data.setLastName(cell.getStringCellValue());  	       
   	        
                break;
        }
    }
    System.out.println("=="+data);
    
}
*/