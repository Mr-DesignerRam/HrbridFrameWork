package com.Util.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

	FileInputStream fis;
	public static String projectPath = System.getProperty("user.dir");

	public FileInputStream excelReader() throws FileNotFoundException {

		return fis = new FileInputStream(projectPath + "\\src\\test\\resources\\Login.xlsx");
	}

	public Sheet sheetRead(FileInputStream fis, String sheet) throws EncryptedDocumentException, IOException {
		return WorkbookFactory.create(fis).getSheet(sheet);
	}

	public Object getSingleData(Sheet sh, int row, int col) {

		if (sh.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("String")) {
			return sh.getRow(row).getCell(col).getStringCellValue();
		} else
			return sh.getRow(row).getCell(col).getNumericCellValue();

	}

	public Map<String, Object> readAllData(Sheet sh, int row, int col) {

		Map<String ,Object> data = new HashMap<>();
		
		for (int i = 0; i < sh.getLastRowNum(); i++) {
			
			

			int cellCount = sh.getRow(i).getLastCellNum();

			for (int j = 0; j < cellCount; j++) {
				
				String firstRowInfo= sh.getRow(0).getCell(j).getStringCellValue();

				if (sh.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("String")) {
					
					return (Map<String, Object>) data.put(firstRowInfo, sh.getRow(row).getCell(col).getStringCellValue());
					
				} else {
				
					return (Map<String, Object>) data.put(firstRowInfo, sh.getRow(row).getCell(col).getNumericCellValue());
				}

			}
		}return data;

	}

}
