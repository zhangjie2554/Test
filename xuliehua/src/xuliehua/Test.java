package xuliehua;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
	public static void main(String[] args) {
		
		String filePath="d://test.txt";
		ObjectOutputStream outputStream=null;
		
		Student student=new Student(1, "张三", "男", "123", "山东省");
		try {
			outputStream=new ObjectOutputStream(new FileOutputStream(filePath));
			outputStream.writeObject(student);
			outputStream.writeInt(250);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("成功");
	}

}
