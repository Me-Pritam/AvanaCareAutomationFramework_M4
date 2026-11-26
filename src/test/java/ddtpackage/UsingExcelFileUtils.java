package ddtpackage;

import utilitypackage.ExcelUtils;

public class UsingExcelFileUtils
{
    public static void main(String[] args) {

        try
        {
            ExcelUtils excelUtils = new ExcelUtils();

            int firstRow = excelUtils.getFirstRowCountFromSheet("DataSheet");
            int lastRow = excelUtils.getLastRowCountFromSheet("DataSheet");

            int firstCell = excelUtils.getFirstCellCountFromRowInSheet("DataSheet",firstRow);
            int lastCell = excelUtils.getLastCellCountFromRowInSheet("DataSheet",firstRow);

            for(int r=firstRow+1;r<=lastRow;r++ )
            {
                for(int c=firstCell;c<lastCell;c++)
                {
                    System.out.print(excelUtils.getSingleCellData("DataSheet",r,c));

                }
                System.out.println();
            }

            excelUtils.closeConnection();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
