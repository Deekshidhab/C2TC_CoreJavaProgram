package day1.basics;

public class BuffReader {

	public static void main(String[] args) throws IOException {
		URL resource = FileReaderDemo.class.getResource("C2TC_Java.txt");
		if (resource == null) {
			System.out.println("File not found");
			return;
		}
		File file = new File(resource.getFile());
		FileReader filereader = new FileReader(file);
		
	}

}
