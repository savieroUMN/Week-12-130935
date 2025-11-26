package week12.saviero.id.ac.umn;
import java.io.IOException;
import java.io.FileWriter;

public class File_handling3 {
	public static void main(String[] args) {
		try {
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Nama saya John Doe\n");
			Writer.write("Saya Dari Universitas Multimedia Nusantara\n");
			Writer.close();
			System.out.println("Successfully written.");
		}
		catch (IOException e) {
			System.out.println("An error has occured.");
			e.printStackTrace();
		}
	}
}
