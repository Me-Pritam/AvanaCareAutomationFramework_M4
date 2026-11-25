package utilitypackage;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtils
{
    public String getValueOfKey(String key) throws Exception
    {
        FileInputStream fis = new FileInputStream("./src/test/resources/CommonDataFolder/AvanaCareConfig.properties");

        Properties property = new Properties();

        property.load(fis);

        return property.getProperty(key);

    }
}
