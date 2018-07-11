package P40;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
	
	public static String browser_name;
	public static String server_url;

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		
		InputStream ips = new FileInputStream("./src/Files/config.properties");
		p.load(ips);
		
		browser_name = p.getProperty("browserName");
		server_url = p.getProperty("serverUrl");
		
		System.out.println(browser_name);
		System.out.println(server_url);
		ips.close();
	}

}
