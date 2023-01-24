package practice04;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class P7 {

    @Test
    public void name() throws IOException {

        String dosyayolu="C:\\Users\\akfkp\\Desktop\\data.xlsx";


        FileInputStream fis=new FileInputStream(dosyayolu);
        Workbook workbook= WorkbookFactory.create(fis);
        workbook.getSheet("Sayfa1").createRow(3).createCell(0).setCellValue("2. Kullanıcı Bilgileri");
        workbook.getSheet("Sayfa1").createRow(4).createCell(0).setCellValue("email");
        workbook.getSheet("Sayfa1").createRow(5).createCell(0).setCellValue("password");
        FileOutputStream fos=new FileOutputStream(dosyayolu);
        workbook.write(fos);

    }
}
