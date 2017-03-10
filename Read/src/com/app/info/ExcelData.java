/*package com.app.info;


import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ExcelData extends App{
	
	 Mongo mongoTemplate = new Mongo("127.0.0.1"),"testingDb");
	
  

	
	public static void main(String[] args) {
		CareHeroesExcelData exceldata= null;
		 App app =new App();
		try
        {
           // FileInputStream file = new FileInputStream(new File("D:/Recover Health - Active Caregivers.xlsx"));
 
            FileInputStream input_document = new FileInputStream(new File("D:/Recover Health - Active Caregivers.xlsx")); //Read XLS document - Office 97 -2003 format     
	         HSSFWorkbook my_xls_workbook = new HSSFWorkbook(input_document); //Read the Excel Workbook in a instance object    
	         HSSFSheet my_worksheet = my_xls_workbook.getSheetAt(0); //This will read the sheet for us into another object

	            Row row1= my_worksheet.getRow(0); 
	            my_worksheet.removeRow(row1);
	         Iterator<Row> rowIterator = my_worksheet.iterator(); // Create iterator object
	         while(rowIterator.hasNext()) {
	        	 exceldata = new CareHeroesExcelData();
	                 Row row = rowIterator.next(); //Read Rows from Excel document       
	                 Iterator<Cell> cellIterator = row.cellIterator();//Read every column for every row that is READ
	                         while(cellIterator.hasNext()) {
	                                 Cell cell = cellIterator.next(); //Fetch CELL
	                                 switch(cell.getCellType()) { 
	                                 case Cell.CELL_TYPE_NUMERIC:
	                                        //System.out.print((long)cell.getNumericCellValue() + "\t\t"); //print numeric value
	                               	 System.out.print(cell.getNumericCellValue() + "t");
	                                    if (cell.getColumnIndex() == 1) {
	                                    exceldata.setAgencyId((long)(cell.getNumericCellValue()));
	                                    }
	                                    if (cell.getColumnIndex() == 2) {
	                                        exceldata.setProviderId((long)(cell.getNumericCellValue()));
	                                        }
	                                    if (cell.getColumnIndex() == 3) {
	                                        exceldata.setPersonId((long)(cell.getNumericCellValue()));
	                                        }
	                                    if (cell.getColumnIndex() == 12) {
	                                        exceldata.setZipCode((long)(cell.getNumericCellValue()));
	                                        }
	                                    
	                                    if (cell.getColumnIndex() == 15) {
	                                        exceldata.setPhone((long)(cell.getNumericCellValue()));
	                                        }                                  

	                                        break;
	                                   case Cell.CELL_TYPE_STRING:
	                                   	 if (cell.getColumnIndex() == 0) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setAgencyName(cell.getStringCellValue());
	                                        }
	                                        //Cell with index 3 contains marks in English
	                                        else if (cell.getColumnIndex() == 4) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setFirstName(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 5) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setMiddleName(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 6) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setLastName(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 7) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setEmailAddress(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 8) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setPersonTypeCode(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 9) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setStartDate(cell.getDateCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 10) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setEndDate(cell.getDateCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 11) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setCity(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 13) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setJobTitle(cell.getStringCellValue());
	                                        }
	                                        else if (cell.getColumnIndex() == 14) {
	                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
	                                        	exceldata.setJobType(cell.getStringCellValue());
	                                        }
	                                        
	                                        

	                                       // System.out.print(cell.getStringCellValue() + "\t\t"); //print string value
	                                        break;
	                                }	                                 
                                   app.save(exceldata);
	                                   
                }
                System.out.println("");
            }
          //  file.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
}
	
	
	try{
		CareHeroesExcelData exceldata= null;
        FileInputStream input_document = new FileInputStream(new File("D://Images & file CareGiver//Recover Health - Active Caregivers.xls")); //Read XLS document - Office 97 -2003 format     
          
		 XSSFWorkbook workbook = new XSSFWorkbook(input_document); 
		 
	        for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
	                
         XSSFSheet sheet = workbook.getSheetAt(i);        
         Row row1= sheet.getRow(0); 
         sheet.removeRow(row1);
	        
         //Iterate through each rows one by one
         Iterator<Row> rowIterator = sheet.iterator();
         while (rowIterator.hasNext()) 
         {
             Row row = rowIterator.next();
            
             Iterator<Cell> cellIterator = row.cellIterator();
              
             while (cellIterator.hasNext()) 
             {                     
                 Cell cell = cellIterator.next();
                 //Check the cell type and format accordingly
                 exceldata=new CareHeroesExcelData();
                 switch (cell.getCellType()) 
                 {                  
                                case Cell.CELL_TYPE_NUMERIC:
                                        //System.out.print((long)cell.getNumericCellValue() + "\t\t"); //print numeric value
                               	 System.out.print(cell.getNumericCellValue() + "t");
                                    if (cell.getColumnIndex() == 1) {
                                    exceldata.setAgencyId((long)(cell.getNumericCellValue()));
                                    }
                                    if (cell.getColumnIndex() == 2) {
                                        exceldata.setProviderId((long)(cell.getNumericCellValue()));
                                        }
                                    if (cell.getColumnIndex() == 3) {
                                        exceldata.setPersonId((long)(cell.getNumericCellValue()));
                                        }
                                    if (cell.getColumnIndex() == 12) {
                                        exceldata.setZipCode((long)(cell.getNumericCellValue()));
                                        }
                                    
                                    if (cell.getColumnIndex() == 15) {
                                        exceldata.setPhone((long)(cell.getNumericCellValue()));
                                        }
                                    

                                        break;
                                   case Cell.CELL_TYPE_STRING:
                                   	 if (cell.getColumnIndex() == 0) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setAgencyName(cell.getStringCellValue());
                                        }
                                        //Cell with index 3 contains marks in English
                                        else if (cell.getColumnIndex() == 4) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setFirstName(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 5) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setMiddleName(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 6) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setLastName(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 7) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setEmailAddress(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 8) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setPersonTypeCode(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 9) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setStartDate(cell.getDateCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 10) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setEndDate(cell.getDateCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 11) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setCity(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 13) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setJobTitle(cell.getStringCellValue());
                                        }
                                        else if (cell.getColumnIndex() == 14) {
                                        	System.out.println(String.valueOf(cell.getStringCellValue()));
                                        	exceldata.setJobType(cell.getStringCellValue());
                                        }
                                        
                                        

                                       // System.out.print(cell.getStringCellValue() + "\t\t"); //print string value
                                        break;
                                }
                                excelReaderDaoImpl.insertExcelSheet(exceldata);
                        }
        System.out.println(""); // To iterate over to the next row
      }  
        } 
	}catch(Exception e){
		System.out.println(e);
	}
	}
}
	

*/