package Properties;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Demo {
	public static void main(String[] args) throws Exception {
		Properties capitals = new Properties();
		OutputStream outputStream = new FileOutputStream("info.properties");
		Set states;
		String str;
		capitals.setProperty("Illinois", "Springfield");
	    capitals.setProperty("Missouri", "Jefferson City");
        capitals.setProperty("Washington", "Olympia");
        capitals.setProperty("California", "Sacramento");
        capitals.setProperty("Indiana", "Indianapolis");
    
	}
	
}
