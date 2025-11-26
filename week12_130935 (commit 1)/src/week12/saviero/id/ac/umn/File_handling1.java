package week12.saviero.id.ac.umn;
import java.io.File;
import java.io.IOException;

public class File_handling1 {
	public static void main(String[] args) {
		try {
			File Obj = new File("myfile.txt");
			if (Obj.createNewFile()) {
				System.out.println("File created: " + Obj.getName());
			}
			else {
				System.out.println("File already exists. ");
			}
		}
		catch (IOException e) {
			System.out.println("An error has occurred.");
		}
	}
}
