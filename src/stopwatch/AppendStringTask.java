package stopwatch;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class AppendStringTask implements Runnable{
	
	private String filename;
	
	public AppendStringTask(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void run() {
		String data = "";
		InputStream in = null;
		try {
			in = new FileInputStream( filename );
			InputStreamReader reader = new InputStreamReader( in );
			int c;
			while (true) {
				c = reader.read();
				if( c < 0 ) break;
				data = data + (char)c;
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
		return "Read file 1-char at a time to String";
	}
}
