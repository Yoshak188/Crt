import java.io.*;
public class FileDemo{
	public static void main(String[] args){
		try{
			BufferedWriter writer=new BufferedWriter(new FileWriter("students.txt"));
			writer.write("Alice\nBob\ncharlie");
			writer.close();
			BufferedReader reader=new BufferedReader(new FileReader("students.txt"));
			String line;
			System.out.println("student Names:");
			while((line=reader.readLine())!=null){
			System.out.println(line);
			}
			reader.close();
		}
		catch(IOException e){
		e.printStackTrace();
		}
	}
}
				
