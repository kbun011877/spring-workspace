package com.sample.mvc.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

public class CustomExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		String title = (String) model.get("title");
		int buy = (Integer) model.get("매입");
		int sell = (Integer) model.get("매출");
		int profit = (Integer) model.get("영업이익");
		
		
		
		HSSFSheet sheet = workbook.createSheet("sample sheet");
		
		HSSFRow row = sheet.createRow(0);
		row.createCell(0).setCellValue("제목");
		row.createCell(1).setCellValue(title);
		 
		HSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("총매입금액");
		row1.createCell(1).setCellValue(buy);

		HSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("총매출금액");
		row2.createCell(1).setCellValue(sell);
		
		HSSFRow row3 = sheet.createRow(3);
		row3.createCell(0).setCellValue("총영업이익");
		row3.createCell(1).setCellValue(profit);
		
		response.setContentType("applcation/octet-stream");
		response.setHeader("Content-Disposition", "attachment; filename=sample.xls");
		
	}
}
