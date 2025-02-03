package org.QAfoxProject.GenaricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;
//
///**
// * This Class Provides reusable methods to perform CRUD in excel file
// * 
// * @author swathi
// */
//
public class ExcelFileLibrary {
//
//	/**
//	 * This Class provides reuasble method to perform CRUD in Excel File
//	 * 
//	 * @author swathi
//	 * @param sheetName
//	 * @param RowNumber
//	 * @param columnNumber
//	 **/
//
//	FileInputStream fis;
//	FileOutputStream fos;
//	Workbook wb;
//	DataFormatter df;
//
//	/**
//	 * This method used to fetch the single data from Excel file
//	 */
//	public String readSingleData(String sheet, int row, int column) {
//
//		// optimized code
//
//		return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
//
//	}
//
//	/**
//	 * This method used to fetch the specific column data from Excel file
//	 * 
//	 * @param sheetName
//	 * @param columnNumber
//	 */
//	public ArrayList<Object> readSpecificColumnData(String sheet, int column) {
//
//		// fetch all the data from one specific column---from excel file
//		int lastrow = wb.getSheet(sheet).getLastRowNum();
//		ArrayList<Object> value = new ArrayList<Object>();
//		for (int i = 1; i < lastrow; i++) {
//			String data = wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
//			value.add(data);
//		}
//		return value;
//	}
//
//	/**
//	 * This method used to fetch the specific Row data from Excel file
//	 * 
//	 * @param sheetName
//	 * @param RowNumber
//	 */
//	public ArrayList<Object> readSpecificRowData(String sheet, int row) {
//
//		// fetch the last cell num in one specific row
//		int lastcolumn = wb.getSheet(sheet).getRow(row).getLastCellNum();
//		ArrayList<Object> value = new ArrayList<Object>();
//		for (int i = 1; i < lastcolumn; i++) {
//			String data = wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
//			value.add(data);
//		}
//		return value;
//	}
//
//	/**
//	 * This method used to display the multiple records from Excel file
//	 * 
//	 * @param sheetName
//	 * @param RowNumber
//	 */
//	public void displayMultipleRecords(String sheet, int row) {
//		// 1.convert the physical file into java understandable
//
//		// fetch the data from multiple record
//		// (Exclude Last column data in each record...)
//
//		int lastrow = wb.getSheet(sheet).getLastRowNum();
//		for (int i = 1; i <= lastrow; i++) {
//			int lastcolumn = wb.getSheet(sheet).getRow(i).getLastCellNum();
//			for (int j = 0; j <= lastcolumn; j++) {
//				String data = wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
//				System.out.println(data + "\t");
//			}
//			System.out.println();
//
//		}
//	}
//
//	/**
//	 * This method used to display the multiple records from Excel file
//	 * 
//	 * @param sheetName
//	 * @param RowNumber
//	 */
//	public void readMultipleRecords(String sheet, int row) {
//		System.out.println("Read Multiple Records from Excel file");
//
//	}
//
//	/**
//	 * This method is used to read data from excel and stores it in the map object
//	 * as Key value pairs
//	 * 
//	 * @param sheetName
//	 * @param expectedTestName
//	 * @return
//	 */
//	public Map<String, String> readMultipleRecords(String sheet, String expectedTestName) {
//		Map<String, String> map = new HashMap<>();
//		Sheet sh = wb.getSheet(sheet);
//		for (int i = 0; i <= sh.getLastRowNum(); i++) {
//			if (df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestName)) {
//				for (int j = i; j <= sh.getLastRowNum(); j++) {
//					String key = df.formatCellValue(sh.getRow(j).getCell(2));
//					String value = df.formatCellValue(sh.getRow(j).getCell(3));
//					map.put(key, value);
//					if (key.equals("###"))
//						;
//					break;
//				}
//				break;
//			}
//		}
//		return map;
//	}
//
//	/**
//	 * This Method initializes excel file
//	 * 
//	 * 
//	 */
//	public void intExcel() {
//		try {
//			fis = new FileInputStream(PathConstant.EXCEL_PATH);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//
//		}
//
//		// 2.Create an workbook using workbook factory
//		try {
//			wb = WorkbookFactory.create(fis);
//		} catch (EncryptedDocumentException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		df = new DataFormatter();
//	}
//
//	/**
//	 * This Method is used to close workbook
//	 * 
//	 * 
//	 */
//	public void closeExcel() {
//		try {
//			wb.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
//	/**
//	 * This Method is used to write a single data
//	 * @param SheetName
//	 * @param RowNum
//	 * @param column num
//	 * @param Test Data
//	 * @throws IOException 
//	 * 
//	 * 
//	 */
//	public void WriteSingleData_NewRow(String sheet,int row,int column,String data)  {
//		//create new row and create data
//		wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
//		//write the data
//		
//		try {
//			wb.write(fos);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
//	/**
//	 * This Method is used to update the single data 
//	 * @param column num
//	 * @param Test Data
//	 * @throws IOException 
//	 * 
//	  
//	 */
//	public void UpadateSingleData_ExistingRow(String sheet,int row,int column,String data) {
//		//create new row and create data
//		wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
//		//write data
//		try {
//			wb.write(fos);
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//	}
/**
		 * this method is used to pause the script execution for specified time
		 * @param time
		 */
		public void pause(long time) {
			try {
				Thread.sleep(time);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		/**this method is used to fetch current date and time
		 * @return
		 */
		public String getCurrentTime() {
			Date date=new Date();
			SimpleDateFormat sdf=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
			return sdf.format(date);
			}
		/**this method is used to generates random number within the specified limit
		 * @param limit
		 * @return
		 */
		public int generateRandomNum(int limit) {
			Random random=new Random();
			return random.nextInt(limit);
		}
	 FileInputStream fis;
		FileOutputStream fos;
		Workbook wb;
		DataFormatter df;


			/** this method is used to fetch the single data from excel file
			 * @param sheetname
			 * @param rownumber
			 * @param column number
			 * @return
			 **/
			public String readSingleData(String sheet, int row, int column) {
					//optimized code
					return wb.getSheet(sheet).getRow(row).getCell(column).getStringCellValue();
			}
			/**
			 * this method used to fetch the special column data from excel file
			 * @param sheetname
			 * @param columnnumber
			 * @return
			 */
			public ArrayList<Object> readSpecificColumnData(String sheet, int column){
				//fetch all data from one specific column--------from excel file
			int lastrow=wb.getSheet(sheet).getLastRowNum();
				ArrayList<Object> value=new ArrayList<Object>();
			for(int i=1;i<=lastrow;i++)
			{
				String data=wb.getSheet(sheet).getRow(i).getCell(column).getStringCellValue();
				value.add(data);
			}
			return value;
				}
			/**
			 * this method used to fetch the special row data from excel file
			 * @param sheetname
			 * @param rownumber
			 * 
			 * @return
			 */
			public ArrayList<Object> readSpecificRowData(String sheet, int row){
				
				//fetch all data from one specific row--------from excel file
			int lastcolumn=wb.getSheet(sheet).getRow(row).getLastCellNum();
				ArrayList<Object> value=new ArrayList<Object>();
			for(int i=1;i<=lastcolumn;i++)
			{
				String data=wb.getSheet(sheet).getRow(row).getCell(i).getStringCellValue();
				value.add(data);
			}
			return value;
			}
			/** this method is used to fetch the single data from excel file
			 * @param sheetname
			 * @param coloumnNumber
			 * @param rownumber
			 **/
			public void displayMultipleRecords(String sheet, int row, int column) {
					
					//fetch the data from multiple record
					//exclude last column data in each records)
					int lastrow=wb.getSheet(sheet).getLastRowNum();
				for(int i=1;i<=lastrow;i++)
				{
					int lastcolumn=wb.getSheet(sheet).getRow(i).getLastCellNum();
					for(int j=0;j<lastcolumn;j++) {
						String data=wb.getSheet(sheet).getRow(i).getCell(j).getStringCellValue();
						System.out.println(data+"\t");
					}
					System.out.println();
				}
			}
				/**
				 * this method used to fetch the multiple records from excel file
				 * key value pairs
				 * @param sheetName
				 * @param excpectedTestName
				 * @return
				 */
				public Map<String,String> readFromExcel(String sheetName,String expectedTestName){
					Map<String,String> map=new HashMap<>();
					Sheet sh=wb.getSheet(sheetName);
					for(int i=0;i<=sh.getLastRowNum();i++) {
						if(df.formatCellValue(sh.getRow(i).getCell(1)).equals(expectedTestName)) {
							for(int j=i;j<=sh.getLastRowNum();j++) {
								String key=df.formatCellValue(sh.getRow(j).getCell(2));
								String value=df.formatCellValue(sh.getRow(j).getCell(3));
								map.put(key, value);
								if(key.equals("####"))
									break;
							}
							break;
						}
					}
					return map;
				}
				/**
				 * this method initializes excel file
				 */
				public void initExcel() {
					try {
						fis = new FileInputStream(PathConstant.EXCEL_PATH);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					try {
						 wb=WorkbookFactory.create(fis);
					} catch (EncryptedDocumentException |IOException e) {
						e.printStackTrace();
					
					}
					//initialize data formatter
					df=new DataFormatter();
				}
				/**
				 * this method is used to close workbook
				 */
				public void closeExcel() {
					try {
						wb.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				/**
				 * this method is used to write single data
				 * @param sheetname
				 * @param rownumber
				 * @param columnnumber
				 * @param testdata
				 */
				public void writeSingleData_NewRow(String sheet, int row, int column, String data) {
					//create new row and create data
					wb.getSheet(sheet).createRow(row).createCell(column).setCellValue(data);
					
						//write the data
					try {
					wb.write(fos);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				/**
				 * this method is used to update single data
				 * @param sheetname
				 * @param rownumber
				 * @param columnnumber
				 */
				public void updateSingleData_ExistingRow(String sheet, int row, int column, String data) {
					//create new row and create data
					wb.getSheet(sheet).getRow(row).createCell(column).setCellValue(data);
					//write the data
							try {
							wb.write(fos);
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
				}
		}
