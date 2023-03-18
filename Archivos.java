
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.FileReader;


public class Archivos {
static File file = new File("test.dat");
	
	static String Usuario;
	



	public Archivos(String usuario) {
		this.Usuario=usuario;
	}


	public static void write( int nI, int nG) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		printWriter.print(Usuario);
		printWriter.print("\t"+nI);
		printWriter.print("\t"+nG);

		printWriter.close();
		}

	public static void read() throws IOException
	{
		Path fileName = Path.of(file.getPath());
		String str = Files.readString(fileName);
		if(str==null) {
		}
		else {
			System.out.println(str);
			String[] partes = str.split("\t");
			int nI = Integer.parseInt(partes[1]);
			int nG = Integer.parseInt(partes[2]);
		}

		
		




	}
	/**
	*/


}