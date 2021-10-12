package tw.brad.myjava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import tw.brad.myclass.Student;

public class Brad53 {

	public static void main(String[] args) {
		Student s1 = new Student(80, 76, 43);
		Student s2 = new Student(50, 36, 23);
		Student s3 = new Student(90, 16, 83);
		System.out.println(s1.sum() + ":" + s1.avg());
		System.out.println(s2.sum() + ":" + s2.avg());
		System.out.println(s3.sum() + ":" + s3.avg());
		
		try {
			FileOutputStream fout = new FileOutputStream("dir1/mystudent.score");
			ObjectOutputStream oout = new ObjectOutputStream(fout);
			
			oout.writeObject(s1);	// 所有物件 => Object's 物件實體
			oout.writeObject(s2);
			oout.writeObject(s3);
			
			fout.flush();
			fout.close();
			System.out.println("save OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
