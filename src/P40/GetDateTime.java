package P40;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GetDateTime {

	public static void main(String[] args) {
		DateFormat dateFormate = new SimpleDateFormat("yyyyMMdd-HHmmss");
		
		Date date = new Date();
		
		String date1 = dateFormate.format(date);
		
		System.out.println(date1);

	}

}
