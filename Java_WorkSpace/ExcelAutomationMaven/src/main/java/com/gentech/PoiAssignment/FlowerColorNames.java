package com.gentech.PoiAssignment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class FlowerColorNames {
    public static void main(String[] args) {
        writeExcel();
    }
    private static void writeExcel()
    {
        FileOutputStream wr = null;
        Workbook wb = null;
        Sheet sh=null;
        Row rw=null;
        Cell cl=null;
        try {
            wb=new XSSFWorkbook();
            sh=wb.createSheet("FlowerColorNames");
            for(int i=0;i<20;i++)//row
            {
                rw = sh.createRow(i);
                for (int j = 0; j < 2; j++)//1st col
                {
                    cl = rw.createCell(j);
                    cl.setCellValue("Color" + ( i+ 1));
                    if(j==1)
                    {
                        cl = rw.createCell(j);
                        cl.setCellValue("Flower" + ( i+ 1));
                    }
                }
            }
            wr=new FileOutputStream("D:\\File_Operations\\ExcelOperations\\FlowerColor.xlsx");
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
