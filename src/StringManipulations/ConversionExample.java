package StringManipulations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ConversionExample {

	public static void main(String[] args) throws ParseException 
	{
		String date = "12-Jun-2020";
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-mmm-yyyy",Locale.ENGLISH);
		Date date1 = formatter1.parse(date);
		System.out.println(formatter1.format(date1));
		

	}

}
