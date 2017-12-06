package demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class fileReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("Untitled 1");
			int read1 = fileReader.read();
		      System.out.println((char)read1);//a
		      int read2 = fileReader.read();
		      System.out.println((char)read2);//b
		      int read3 = fileReader.read();
		      System.out.println((char)read3);//c
		      int read4 = fileReader.read();
		      System.out.println(read4);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() {
		FileReader fileReader = null;
		FileWriter fileWriter = null;
		try {
			fileReader = new FileReader("Untitled 1");
			fileWriter = new FileWriter("Untitled 2");
			char[] buffer = new char[1024];
			int lengh = 0;
			while ((lengh = fileReader.read(buffer)) != -1) {
				fileWriter.write(buffer, 0, lengh);
				System.out.println(lengh);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fileWriter != null) {
				try {
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
