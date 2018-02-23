package stopwatch;

public class Main {
	public static void main(String[] args) {
		AppendStringTask a1 = new AppendStringTask("D:/OOP2/Alice-in-Wonderland.txt");
		TaskTimer T = new TaskTimer(a1);
		AppendStringBuilderTask a2 = new AppendStringBuilderTask("D:/OOP2/Alice-in-Wonderland.txt");
		TaskTimer T2 = new TaskTimer(a2);
		BufferedReaderTask a3 = new BufferedReaderTask("D:/OOP2/Alice-in-Wonderland.txt");
		TaskTimer T3 = new TaskTimer(a3);
	}
}
