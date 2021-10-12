package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import tw.brad.myclass.Student;

public class Brad54 {

	public static void main(String[] args) {
		try {
			ObjectInputStream oin = new ObjectInputStream(
					new FileInputStream("dir1/mystudent.score"));
			Student s1 = (Student)oin.readObject();	// read => Object
			Student s2 = (Student)oin.readObject();
			Student s3 = (Student)oin.readObject();
			
//			if (s1 instanceof Student) {
//				// OK
//			}
			
			System.out.println(s1.sum() + ":" + s1.avg());
			System.out.println(s2.sum() + ":" + s2.avg());
			System.out.println(s3.sum() + ":" + s3.avg());
			
			oin.close();
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}

}
