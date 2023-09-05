package ReviewPackageNotInFramework;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C21_ExcelFiles {

    /*

     when we need to get information from an Excel file, we can use this code.
     */

    @Test
    public void test() throws IOException {

        String filePath = "src/test/java/ReviewPackageNotInFramework/countries.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook workbook = WorkbookFactory.create(fis); // this creates a copy of the file in the system

        System.out.println(workbook.getSheet("Sayfa1").getRow(8).getCell(3).toString());

        String value = workbook.getSheet("Sayfa1").getRow(8).getCell(3).toString(); // Erivan

        workbook.getSheet("Sayfa1").getRow(8).createCell(3).setCellValue("654654654"); // will not change original file, only changes the copy file

        FileOutputStream fos = new FileOutputStream(filePath);

        workbook.write(fos);


    }

}
