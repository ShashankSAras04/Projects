package com.gentech.PoiAssignment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class FruitNames {
    public static void main(String[] args) {
        writeExcel();
    }
        private static void writeExcel()
        {
            FileOutputStream wr = null;
            Workbook wb = null;
            Sheet sh = null;
            Sheet sh1=null;
            Row rw=null;
            Cell cl=null;
            try {
                    wb=new XSSFWorkbook();
                    sh=wb.createSheet("FruitsName");
                    for(int i=0;i<20;i++)
                    {
                        rw=sh.createRow(i);
                        for(int j=0;j<1;j++)
                        {
                            cl=rw.createCell(j);
                            cl.setCellValue("Fruit"+(i+1));
                        }
                    }
                    wr=new FileOutputStream("D:\\File_Operations\\ExcelOperations\\Friut.xlsx");
                    wb.write(wr);
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            finally
            {
                try {
                    wr.close();
                    wb.close();
                }catch (Exception e)
                {
                    e.printStackTrace();
                }
            }

        }

}
