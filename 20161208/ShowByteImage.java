import java.io.*;
public class ShowByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;
		try{
			inFile = new FileInputStream("2.jpg");
			int data = inFile.read();
			inFile.close();
		}catch(IOException e){  
			System.out.println("エラーです。");
			System.exit(1)
		}
	}
}