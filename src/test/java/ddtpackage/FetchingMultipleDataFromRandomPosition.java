package ddtpackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class FetchingMultipleDataFromRandomPosition
{
    public static void main(String[] args) {

        try
        {
            FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

            Workbook workbook= WorkbookFactory.create(fis);

            Sheet sheet = workbook.getSheet("DataSheet2");

            int firstRowNum = sheet.getFirstRowNum();

            int lastRowNum = sheet.getLastRowNum();

            int firstCellNum = sheet.getRow(firstRowNum).getFirstCellNum();

            int lastCellNum = sheet.getRow(firstRowNum).getLastCellNum();

            for(int r=firstRowNum+1;r<=lastRowNum;r++)
            {
                Row newRow = sheet.getRow(r);

                for(int c=firstCellNum;c<lastCellNum;c++)
                {
                    System.out.print(newRow.getCell(c).toString()+"   ");
                }
                System.out.println();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
