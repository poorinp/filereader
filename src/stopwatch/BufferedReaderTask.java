package stopwatch;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTask implements Runnable{

	private String filename;
	
	public BufferedReaderTask(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() { 
		String result = "";
		FileReader reader = null;
		BufferedReader br = null;
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			String line;
			while ((line = br.readLine()) != null) { 
				result = result + line + '\n';
			}
		}
		catch ( IOException ex ){
			System.out.println(ex.getMessage());
		}
		if (br != null) 
		try {
			br.close();
		}catch (IOException ex) { System.out.println(ex.getMessage());}
	}
	
	public String toString() {
		return "Read file one line at a time using BufferedReader";
	}
}
