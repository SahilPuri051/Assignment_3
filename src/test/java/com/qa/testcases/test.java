package com.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.record.formula.functions.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test {

	public static FileInputStream fis;
	static int Apr=0,May=0,June=0,July=0;
	public static int sumOT1April=0,sumOT1May=0,sumOT1June=0,sumOT1July=0;
	public static int sumOT2April=0,sumOT2May=0,sumOT2June=0,sumOT2July=0;
	public static int sumOT3April=0,sumOT3May=0,sumOT3June=0,sumOT3July=0;
	public static int sumOT4April=0,sumOT4May=0,sumOT4June=0,sumOT4July=0;
	public static int sumOT5April=0,sumOT5May=0,sumOT5June=0,sumOT5July=0;
	public static void main(String args[]) throws IOException
	{
		try {
			fis=new FileInputStream("C:\\Users\\SAHIL\\eclipse-workspace\\February2019_Project\\CSPL_QA_Assignment_03.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("input");
		XSSFSheet sheetop=wb.getSheet("output");
		int rowsize=sheet.getLastRowNum();
		int colsize=sheet.getRow(0).getLastCellNum();
		System.out.println(rowsize);
		System.out.println(colsize);
		/*DataFormatter formatter=new DataFormatter();
		for(int w=2;w<colsize;w++)
		{
		    System.out.println(sheet.getRow(0).getCell(w).getStringCellValue());
		    String month=sheet.getRow(0).getCell(w).getStringCellValue().toString();
					
			if(month.contains("Apr"))
			{
				Apr++;
			}
			else if(month.contains("May"))
			{
				May++;
			}
			else if(month.contains("June"))
			{
				June++;
			}
			else
			{
				July++;
			}*/
			
		/*}
		System.out.println("April Entries : "+Apr);
		System.out.println("May Entries : "+May);
		System.out.println("June Entries : "+June);
		System.out.println("July Entries : "+July);*/
		for (int i=1;i<rowsize;i++)
		{
				if(sheet.getRow(i).getCell(0).getStringCellValue().contains("OT1"))
				{
						for(int qcol=2;qcol<=31;qcol++)
						{
							sumOT1April+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
						}
						for(int qcol=32;qcol<=62;qcol++)
						{
							sumOT1May+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
						}
						for(int qcol=63;qcol<=92;qcol++)
						{
							sumOT1June+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
						}
						for(int qcol=93;qcol<=96;qcol++)
						{
							sumOT1July+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
						}
				}
				
				if(sheet.getRow(i).getCell(0).getStringCellValue().contains("OT2"))
				{
					for(int qcol=2;qcol<=31;qcol++)
					{
						sumOT2April+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=32;qcol<=62;qcol++)
					{
						sumOT2May+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=63;qcol<=92;qcol++)
					{
						sumOT2June+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					
					for(int qcol=93;qcol<=96;qcol++)
					{
						sumOT2July+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
				}
					
				if(sheet.getRow(i).getCell(0).getStringCellValue().contains("OT3"))
				{
					for(int qcol=2;qcol<=31;qcol++)
					{
						sumOT3April+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=32;qcol<=62;qcol++)
					{
						sumOT3May+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=63;qcol<=92;qcol++)
					{
						sumOT3June+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					
					for(int qcol=93;qcol<=96;qcol++)
					{
						sumOT3July+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
				
				}
				
				if(sheet.getRow(i).getCell(0).getStringCellValue().contains("OT4"))
				{
					for(int qcol=2;qcol<=31;qcol++)
					{
						sumOT4April+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=32;qcol<=62;qcol++)
					{
						sumOT4May+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=63;qcol<=92;qcol++)
					{
						sumOT4June+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=93;qcol<=96;qcol++)
					{
						sumOT4July+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
				
				
				}
				
				
				if(sheet.getRow(i).getCell(0).getStringCellValue().contains("OT5"))
				{
					for(int qcol=2;qcol<=31;qcol++)
					{
						sumOT5April+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=32;qcol<=62;qcol++)
					{
						sumOT5May+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					
					for(int qcol=63;qcol<=92;qcol++)
					{
						sumOT5June+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
					for(int qcol=93;qcol<=96;qcol++)
					{
						sumOT5July+=sheet.getRow(i).getCell(qcol).getNumericCellValue();
					}
				
				}
			
	
			}
		System.out.println("APRIL MONTH SALES ARE : MONTH WISE");
		System.out.println(sumOT1April);
		System.out.println(sumOT2April);
		System.out.println(sumOT3April);
		System.out.println(sumOT4April);
		System.out.println(sumOT5April);
		
		System.out.println("MAY MONTH SALES ARE : MONTH WISE");
		System.out.println(sumOT1May);
		System.out.println(sumOT2May);
		System.out.println(sumOT3May);
		System.out.println(sumOT4May);
		System.out.println(sumOT5May);
		
		System.out.println("June MONTH SALES ARE : MONTH WISE");
		System.out.println(sumOT1June);
		System.out.println(sumOT2June);
		System.out.println(sumOT3June);
		System.out.println(sumOT4June);
		System.out.println(sumOT5June);
		
		System.out.println("July MONTH SALES ARE : MONTH WISE");
		System.out.println(sumOT1July);
		System.out.println(sumOT2July);
		System.out.println(sumOT3July);
		System.out.println(sumOT4July);
		System.out.println(sumOT5July);
		
		int[][] input= {{sumOT1April,sumOT1May,sumOT1June,sumOT1July},{sumOT2April,sumOT2May,sumOT2June,sumOT2July},{sumOT3April,sumOT3May,sumOT3June,sumOT3July},{sumOT4April,sumOT4May,sumOT4June,sumOT4July},{sumOT5April,sumOT5May,sumOT5June,sumOT5July}};
		int[][] output=new int [5][4];
		int row=0, col=0;
		  for(int m=1;m<=5;m++)
		  {
			 col=0;
			  for(int n=1;n<=4;n++)
			  {
				 output[row][col]= (int) sheetop.getRow(m).getCell(n).getNumericCellValue();
				 col++;
			  }
			  	 row++;
		  }
		  
		 for(int l=0;l<5;l++)
		 {
			 for(int p=0;p<4;p++)
			 {
				 if(input[l][p]!=output[l][p])
				 {
					 System.out.println("Incorrect Sum at "+(l+2)+" row & "+(p+2)+" column ****** "+input[l][p]+" should be present , instead of : "+output[l][p]);
				 }
			 }
		 }
	}
	
	  

}
