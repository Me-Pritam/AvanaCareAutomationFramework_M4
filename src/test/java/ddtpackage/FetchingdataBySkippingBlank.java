package ddtpackage;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class FetchingdataBySkippingBlank
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

          Workbook workbook= WorkbookFactory.create(fis);

          Sheet sheet= workbook.getSheet("DataWithVoid");

          int firstRow = sheet.getFirstRowNum();
          int lastRow = sheet.getLastRowNum();

          int firstCell = sheet.getRow(firstRow).getFirstCellNum();
          int lastCell = sheet.getRow(firstRow).getLastCellNum();

          for(int r=firstRow+1;r<=lastRow;r++)
          {
              Row newRow = sheet.getRow(r);

              if (!(newRow==null))
              {
                  for(int c=firstCell;c<lastCell;c++)
                  {
                      if (!(newRow.getCell(c)==null))
                      {
                          System.out.print(newRow.getCell(c).toString()+" ");
                      }
                  }
                  System.out.println();
              }


          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
