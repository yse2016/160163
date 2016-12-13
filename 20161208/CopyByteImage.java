import java.io.*;
public class CopyByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;
		try{
			FileInputStream outFile = new FileInputStream("2.jpg");
			inFile = new FileInputStream("3.jpg");
			int data;
			int n=0;
			while((data = inFile.read())!= -1){
				n++;
			outFile.write(data);
			System.out.println("くり返し: "+n+"回");
		}
		inFile.close();
	}catch(IOException e) {
		System.err.println("エラーです。");
		System.exit(1);
		}
	}
}