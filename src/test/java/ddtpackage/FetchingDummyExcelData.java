package ddtpackage;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;

public class FetchingDummyExcelData
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

            Workbook workbook = WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("DataSheet");

            Row row = sheet.getRow(1);

            Cell cell = row.getCell(0);

            System.out.println(cell.toString());

        }
        catch (Exception e)
        {
            e.printStackTrace();

        }

    }
}
