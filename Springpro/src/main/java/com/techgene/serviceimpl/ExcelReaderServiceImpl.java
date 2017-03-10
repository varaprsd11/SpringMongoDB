package com.techgene.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgene.dao.ExcelReaderDao;
import com.techgene.model.CareHeroesExcelData;
import com.techgene.service.ExcelReaderService;

@Service
public class ExcelReaderServiceImpl implements ExcelReaderService {
	@Autowired
	private ExcelReaderDao excelReaderDao;

	public void insertExcelSheet(CareHeroesExcelData careHeroesExcelData) {
		excelReaderDao.insertExcelSheet(careHeroesExcelData);
	}

}
