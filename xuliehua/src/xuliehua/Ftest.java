package xuliehua;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Ftest {
	
	public static void main(String[] args) {
		
		String filepath="d://test.txt";
		ObjectInputStream inputStream=null;
		Student student=null;
		try {
			inputStream =new ObjectInputStream(new FileInputStream(filepath));
			student=(Student)inputStream.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(student);
	}

}
