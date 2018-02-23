package stopwatch;

import java.io.*;

public class Tasks {
	public static String readFileToString(String filename) {
		//create String to read data 
		String data = "";
		
		InputStream in = null;
		//open the file
		try {
			in = new FileInputStream( filename );
			//read as characters
			InputStreamReader reader = new InputStreamReader( in );
			int c;
			while (true) { //while((c=reader.read()) >= 0)
				c = reader.read();
				if( c < 0 ) break;
				data = data + (char)c;
			}
		}
		catch ( IOException ex ){
			System.out.println(ex.getMessage());
		}
		//close the file
		if (in != null) 
		try {
			in.close();
		}catch (IOException ex) { System.out.println(ex.getMessage());}
		return data;
	}
	
	public static String readFileToStringBuilder(String filename) {
		//create String to read data 
		StringBuilder tmp = new StringBuilder();
		InputStream in = null;
		//open the file
		try {
			in = new FileInputStream( filename );
			//read as characters
			InputStreamReader reader = new InputStreamReader( in );
			int c;
			while (true) { //while((c=reader.read()) >= 0)
				c = reader.read();
				if( c < 0 ) break;
				tmp.append((char) c);
			}
		}
		catch ( IOException ex ){
			System.out.println(ex.getMessage());
		}
		//close the file
		if (in != null) 
		try {
			in.close();
		}catch (IOException ex) { System.out.println(ex.getMessage());}
		return tmp.toString();
	}
	
	public static String BufferedReader(String filename) {
		//create String to read data 
		String result = "";
		FileReader reader = null;
		BufferedReader br = null;
		//open the file
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			//read as characters
//			InputStreamReader reader = new InputStreamReader( in );
			String line;
			while ((line = br.readLine()) != null) { //while((c=reader.read()) >= 0)
				result = result + line + '\n';
			}
		}
		catch ( IOException ex ){
			System.out.println(ex.getMessage());
		}
		//close the file
		if (br != null) 
		try {
			br.close();
		}catch (IOException ex) { System.out.println(ex.getMessage());}
		return result.toString();
	}
	
	
	public static void main(String[] args) {
		Stopwatch sw = new Stopwatch();
		sw.start();
		String alice = readFileToString("D:/OOP2/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to String.");
		System.out.printf("Read %d chars in %.6f sec.\n", alice.length(), sw.getElapsed());
		
		sw = new Stopwatch();
		sw.start();
		alice = readFileToStringBuilder("D:/OOP2/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.println("Reading Alice-in-Wonderland.txt using FileReader, append to StringBuilder.");
		System.out.printf("Read %d chars in %.6f sec.\n", alice.length(), sw.getElapsed());
		
		sw = new Stopwatch();
		sw.start();
		alice = BufferedReader("D:/OOP2/Alice-in-Wonderland.txt");
		sw.stop();
		System.out.println("Reading Alice-in-Wonderland.txt using BufferedReader, append lines to String.");
		System.out.printf("Read %d chars in %.6f sec.\n", alice.length(), sw.getElapsed());
	}
}
