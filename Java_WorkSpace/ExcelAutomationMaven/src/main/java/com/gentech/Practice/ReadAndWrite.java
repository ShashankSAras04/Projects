package com.gentech.Practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite {
    public static void main(String[] args) {
        getFile();
    }

    private static void getFile() {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        Workbook wb = null;
        Sheet sh = null;
        Sheet sh1 = null;
        Row rw = null;
        Row rw1 = null;
        Cell cl = null;
        Cell cl1 = null;
        try {
            fin = new FileInputStream("D:\\File_Operations\\ExcelOperations\\Friut.xlsx");

            wb = new XSSFWorkbook(fin);
            fout = new FileOutputStream("D:\\File_Operations\\ExcelOperations\\Friut.xlsx");
           // wb= new XSSFWorkbook();
            sh = wb.getSheet("FruitsName");
            sh1 = wb.getSheet("NewSheet");
            if (sh1 == null) {
                sh1 = wb.createSheet("NewSheet");
            }
            int row = sh.getPhysicalNumberOfRows();

            for (int i = 0; i < row; i++) {
                rw = sh.getRow(i);
                rw1 = sh1.getRow(i);
                if (rw1 == null) {
                    rw1 = sh1.createRow(i);
                }
                int col = rw.getPhysicalNumberOfCells();

                for (int j = 0; j < col; j++) {
                    cl = rw.getCell(j);
                    cl1 = rw1.getCell(j);
                    if (cl1 == null) {
                        cl1 = rw1.createCell(j);
                    }
                    String data = cl.getStringCellValue();
                    //  System.out.print(data+"     ");
                     // System.out.printf("%-21s",data);
                      cl1.setCellValue(data);
                }
             //   System.out.println();
            }
            //fout = new FileOutputStream("D:\\File_Operations\\ExcelOperations\\Friut.xlsx");
            wb.write(fout);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fout.flush();
                fout.close();
                fin.close();
                wb.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
