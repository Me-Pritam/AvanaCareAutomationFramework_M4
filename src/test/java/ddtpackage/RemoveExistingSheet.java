package ddtpackage;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class RemoveExistingSheet
{
    public static void main(String[] args)
    {
       try
       {
           FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

           Workbook workbook=  WorkbookFactory.create(fis);

           Sheet sheet = workbook.getSheet("DataWithVoid");

           workbook.removeSheetAt(workbook.getSheetIndex(sheet));

           FileOutputStream fos = new FileOutputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

           workbook.write(fos);

           workbook.close();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
