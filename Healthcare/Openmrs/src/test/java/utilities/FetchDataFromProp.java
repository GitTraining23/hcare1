package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.constantData;

public class FetchDataFromProp {

	public static Properties readDataFromProp() throws IOException
	{
		FileReader fr=new FileReader(constantData.propPath);
		Properties prop=new Properties();
		prop.load(fr);
		return prop;
	}
	
	
	
	
	
	
}
