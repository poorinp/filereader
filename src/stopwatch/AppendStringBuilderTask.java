package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringBuilderTask implements Runnable{
	
	private String filename;
	
	public AppendStringBuilderTask(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() { 
		StringBuilder tmp = new StringBuilder();
		InputStream in = null;
		try {
			in = new FileInputStream( filename );
			InputStreamReader reader = new InputStreamReader( in );
			int c;
			while (true) {
				c = reader.read();
				if( c < 0 ) break;
				tmp.append((char) c);
			}
		}
		catch ( IOException ex ){
			System.out.println(ex.getMessage());
		}
		if (in != null) 
		try {
			in.close();
		}catch (IOException ex) { System.out.println(ex.getMessage());}
	}
	
	public String toString() {
		return "Read file 1-char at a time to StringBuilder";
	}
}
