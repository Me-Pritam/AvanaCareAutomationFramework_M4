package ddtpackage;



import java.io.FileInputStream;
import java.util.Properties;

public class FetchingDataFromPropertyFile
{
    public static void main(String[] args)
    {
      try
      {
          FileInputStream fis = new FileInputStream("./src/test/resources/AvanaCareConfig.properties");

          Properties property = new Properties();

          property.load(fis);

          System.out.println(property.getProperty("fullName"));
          System.out.println(property.getProperty("url"));


      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
