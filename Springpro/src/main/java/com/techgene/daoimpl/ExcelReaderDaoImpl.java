package com.techgene.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.techgene.dao.ExcelReaderDao;
import com.techgene.model.CareHeroesExcelData;
@Repository
public class ExcelReaderDaoImpl implements ExcelReaderDao{
	@Autowired
	private MongoTemplate  mongoTemplate;

	public void insertExcelSheet(CareHeroesExcelData careHeroesExcelData) {
		mongoTemplate.insert(careHeroesExcelData,"excelreader");;
		
	}

}
