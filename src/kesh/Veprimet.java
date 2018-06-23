package kesh;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Veprimet {

    private static File f1, f2, f3;
    private static double sum = 0;
    private double price1, price2, price3, price4;

    public Veprimet(File file1, File file2, File file3, double price1, double price2, double price3, double price4) throws IOException {
        f1 = file1;
        f2 = file2;
        f3 = file3;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
        this.price4 = price4;
        readWrite();

    }

    public void readWrite() throws FileNotFoundException, IOException {

        InputStream ExcelFileToRead1 = new FileInputStream(f1.getAbsolutePath());
        InputStream ExcelFileToRead2 = new FileInputStream(f2.getAbsolutePath());
        InputStream ExcelFileToRead3 = new FileInputStream(f3.getAbsolutePath());

        XSSFWorkbook nFizik = new XSSFWorkbook(ExcelFileToRead1);
        XSSFWorkbook mFaktike = new XSSFWorkbook(ExcelFileToRead2);
        XSSFWorkbook ace = new XSSFWorkbook(ExcelFileToRead3);

        XSSFSheet nominimiFizik = nFizik.getSheetAt(0);
        XSSFSheet matjetFaktike = mFaktike.getSheetAt(0);
        XSSFSheet ACE = ace.getSheetAt(0);

        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("new Sheet");

        FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Acer\\Desktop\\efektetFinanciare.xlsx");

        int nrOfRows = nominimiFizik.getLastRowNum() - 1;
        System.out.println(nrOfRows);
        double price = 0;

        for (int i = 1; i <= nrOfRows; i++) {
            XSSFRow rowNominim = nominimiFizik.getRow(i);
            XSSFRow rowMatje = matjetFaktike.getRow(i);
            XSSFRow row = sheet.createRow(i);
            for (int j = 1; j <= 24; j++) {
                double dif = rowNominim.getCell(j).getNumericCellValue() - rowMatje.getCell(j).getNumericCellValue();
                XSSFCell aceCell = ACE.getRow(i).getCell(j);
                if (dif > 0) {
                    if (aceCell.getNumericCellValue() > 0) {
                        price = price3;
                    } else {
                        price = price4;
                    }
                } else {
                    if (aceCell.getNumericCellValue() > 0) {
                        price = price1;
                    } else {
                        price = price2;
                    }
                }
                XSSFCell cell = row.createCell(j);
                double write = price * dif;
                cell.setCellValue(write);
                sum += write;
            }

        }
        wb.write(fileOut);
        fileOut.flush();
        fileOut.close();
    }

    public double getSum() {
        return sum;
    }
}
