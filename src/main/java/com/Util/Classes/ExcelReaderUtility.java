package com.Util.Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderUtility {

	FileInputStream fis;

	public static String projectPath = System.getProperty("user.dir");

	public FileInputStream readExcel() throws FileNotFoundException {

		return fis = new FileInputStream(projectPath + "\\src\\test\\resources\\Login.xlsx");
	}

	public Sheet getSheet(FileInputStream fis, String sheet) throws EncryptedDocumentException, IOException {
		return WorkbookFactory.create(fis).getSheet(sheet);

	}

	public Object readSingleData(Sheet sheet, int row, int col) {
		if (sheet.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("String"))
			return sheet.getRow(row).getCell(col).getStringCellValue();
		else
			return sheet.getRow(row).getCell(col).getNumericCellValue();

	}

	public Map<String, Object> readAllExcelData(Sheet sh, int row, int col) {

		Map<String, Object> map = new HashMap<>();
		for (int i = 0; i < sh.getLastRowNum(); i++) {

			double cellCount = sh.getRow(i).getLastCellNum();
			for (int j = 0; j < cellCount; j++) {
				String firstRow = sh.getRow(0).getCell(j).getStringCellValue();

				if (sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("String")) {
					map.put(firstRow, sh.getRow(i).getCell(j).getStringCellValue());

				} else
					map.put(firstRow, sh.getRow(i).getCell(j).getNumericCellValue());

			}

		}

		return map;

	}

	public Object readRowData(Sheet sh, int row) {

		double colCount = sh.getRow(row).getLastCellNum();

		for (int col = 0; col < colCount; col++) {

			if (sh.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("String")) {
				return sh.getRow(row).getCell(col).getStringCellValue();

			} else {
				return sh.getRow(row).getCell(col).getNumericCellValue();
			}
		}
		return 0;

	}

}
