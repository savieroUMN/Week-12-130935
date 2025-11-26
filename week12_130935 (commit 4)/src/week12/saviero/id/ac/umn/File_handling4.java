package week12.saviero.id.ac.umn;
import java.io.File;

public class File_handling4 {

	public static void main(String[] args) {
		File Obj = new File("myfile.txt");
		if (Obj.delete()) {
			System.out.println("The Deleted File is: " + Obj.getName());
		}
		else {
			System.out.println("Failed in deleting the file.");
		}
	}

}
