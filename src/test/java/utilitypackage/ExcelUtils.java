package utilitypackage;

import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ExcelUtils
{
    static FileInputStream fis ;

    public String getSingleCellData(String sheetName, int rowNum, int cellNum) throws Exception
    {
        fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

        return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
    }

    public int getFirstRowCountFromSheet(String sheetName) throws Exception
    {
        fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

        return WorkbookFactory.create(fis).getSheet(sheetName).getFirstRowNum();
    }

    public int getLastRowCountFromSheet(String sheetName) throws Exception
    {
        fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

        return WorkbookFactory.create(fis).getSheet(sheetName).getLastRowNum();
    }

    public int getFirstCellCountFromRowInSheet(String sheetName,int rowNum) throws Exception
    {
        fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

        return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getFirstCellNum();
    }

    public int getLastCellCountFromRowInSheet(String sheetName,int rowNum) throws Exception
    {
        fis = new FileInputStream("./src/test/resources/TestDataFolder/DummyTestSheet.xlsx");

        return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getLastCellNum();
    }

    public void closeConnection() throws Exception
    {
        fis.close();
    }

}
