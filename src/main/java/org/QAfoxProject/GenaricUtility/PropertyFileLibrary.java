package org.QAfoxProject.GenaricUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//import org.testng.Reporter;
//
///**
// * * This Class provides Reusable Method To Perform CRUD in Property File
// * 
// * @return
// * @return
// * @throws
// **/
//
public class PropertyFileLibrary {
//	FileInputStream fis;
//	FileOutputStream fos;
//	Properties property;
//
//	public void initPropertyFile() {
//		// Steps to Fetch the Data From external Resources - PropertyFile
//
//		// 1.Create The physical File Into Java Understandable
//		try {
//			fis = new FileInputStream(PathConstant.PROPERTY_PATH);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		// 2.Create an object For Properties Class
//		property = new Properties();
//
//		// 3.Call the Non Static method --To load the Property
//		try {
//			property.load(fis);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * This Method is used to Read the Data in Property File
//	 * 
//	 * @param key
//	 * @return
//	 */
//
//	public String readProperty(String key) {
//		// Fetch the data-by Calling getProperty
//		return property.getProperty(key);
//
//	}
//
//	/**
//	 * This Method is used To Write the Data in Property File
//	 * 
//	 * @param key
//	 * @param value
//	 */
//
//	public void writeProperty(String key, String value) {
//		// enter the data
//		property.put(key, value);
//
//		// create instance for FileOutputStream Class
//		try {
//			fos = new FileOutputStream(PathConstant.PROPERTY_PATH);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		// store The Data
//		try {
//			property.store(fos, "Updated the New Key-Value Successfully");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
//	/**
//	 * This method Used to Display the Property
//	 * 
//	 * @param key
//	 */
//	public void displayProperty(String key) {
//		// Fetch the data-By calling getProperty()
//		String data = property.getProperty(key);
//		// Display the Data
//		Reporter.log(key + ":" + data, true);
//	}
	
	
	FileInputStream fis;
	FileOutputStream fos;
	Properties property;
	/**
	 * initialize property file
	 */
	public void initPropertyFile() {
		try {
			fis = new FileInputStream(PathConstant.PROPERTY_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//create an object for properties class
		property=new Properties();
		//load the property file
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * this method is used to read the data from property file
	 * @param key
	 * @return
	 */
	public String readData(String key) {
		return property.getProperty(key);
	}
	/**
	 * this method is used to write the data from property file
	 * @param key
	 * @param value
	 */
	public void writeData(String value, String key) {
		property.put(key, value);
	//create instance for fos class
	try {
		fos=new FileOutputStream(PathConstant.PROPERTY_PATH);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//STORE THE property file
	try {
		property.store(fos, "update the new key value");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	/**
	 * this method is used to display the data from property file
	 * @param key
	 * 
	 */
	public void displayPropertyFile(String key) {
		String data=property.getProperty(key);
		Reporter.log(key+":"+data,true);
	}
}
