package com.gentech.PoiAssignment;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileOutputStream;

public class FlowerNames {
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
            sh=wb.createSheet("FlowerNames");
                rw=sh.createRow(5);
                for(int j=0;j<20;j++)
                {
                    cl=rw.createCell(j);
                    cl.setCellValue("Flowers"+(j+1));
                }
            wr=new FileOutputStream("D:\\File_Operations\\ExcelOperations\\Flower.xlsx");
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
