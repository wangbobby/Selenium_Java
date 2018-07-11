package P40;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadExcel {
	
	static File src = new File("./src/Files/test_data.xlsx");
	
	static FileInputStream fis;
	
	static XSSFWorkbook wb;

	public static void main(String[] args) throws IOException {
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		
		
		read();
		
		write();
		
		read();
		
		wb.close();
		
	}
	
	public static void read() {
		
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
//		System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
//		System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
		
		for(int i = 0; i < sh1.getPhysicalNumberOfRows(); i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(sh1.getRow(i).getCell(j).getStringCellValue());
			}
		}	
	}
	
	public static void write() throws IOException {
		XSSFSheet sh1 = wb.getSheetAt(0);
		sh1.getRow(0).createCell(2).setCellValue("Pass");
		sh1.getRow(1).createCell(2).setCellValue("Fail");
		sh1.getRow(2).createCell(2).setCellValue("N/A");
		sh1.getRow(3).createCell(2).setCellValue("Pass");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		fout.close();
	}
	
	
	
//	public static void main(String[] args) {  
//        
//        try{  
//              
//            // 指定excel的路径  
//            File src = new File(".\\src\\Files\\test_data.xlsx");  
//              
//            // 加载文件  
//            FileInputStream fis = new FileInputStream(src);  
//              
//            // 加载workbook  
////            @SuppressWarnings("resource")  
//            XSSFWorkbook wb = new XSSFWorkbook(fis);  
//              
//            //加载sheet，这里我们只有一个sheet,默认是sheet1  
//            XSSFSheet sh1= wb.getSheetAt(0);  
//              
//            // 开始读取第一行第一列的数据  
//            System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());  
//            // 读取第一行第二列内容  
//            System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());  
//            // 读取第二行第二列内容  
//            System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());  
//            // 读取第二行第二列内容  
//            System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());  
//              
//            // 获取实际总行数  
//            System.out.println(sh1.getPhysicalNumberOfRows());  
//              
//            // 获取实际总列数  
//            System.out.println(sh1.getPhysicalNumberOfRows());  
//              
//        } catch (Exception e){  
//              
//            System.out.println(e.getMessage());  
//              
//        }  
//  
//    } 
	
	public static void listFilesInFolder() {
		File file = new File(".");
		for(String fileNames : file.list()) System.out.println(fileNames);
	}

}
