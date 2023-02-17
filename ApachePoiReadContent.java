package automation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ApachePoiReadContent {


	public static void main(String[] args, int introwindex)throws Exception {
    File file = new File("C:\\Testdata.xlsx");
    FileInputStream inputStream = new FileInputStream(file);
    Workbook workbook = WorkbookFactory.create(inputStream);
    System.out.println("#Sheets:"+workbook.getNumberOfSheets());
    org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("Sheet1");
    System.out.println("#Rows:"+sheet.getPhysicalNumberOfRows());
    System.out.println("FirstRowNumber:"+sheet.getFirstRowNum());
    System.out.println("LastRowNumber:"+sheet.getLastRowNum());
    System.out.println("#Column:"+sheet.getRow(0).getPhysicalNumberOfCells());
    System.out.println("FirstColumanNumber:"+sheet.getRow(0).getFirstCellNum());
    System.out.println("LastColumanNumber:"+sheet.getRow(0).getLastCellNum());
    for(int rowIndex = sheet.getFirstRowNum();rowIndex<= sheet.getLastRowNum();rowIndex++) {
    for(int colindex = sheet.getRow(rowIndex).getFirstCellNum();colindex<sheet.getRow(rowIndex).getLastCellNum();colindex++) {
    	System.out.println(sheet.getRow(rowIndex).getCell(colindex).toString()+"\t");
    }
    System.out.println();
    }
    
    
    
   
		
	}
    	
    
    		
	}


