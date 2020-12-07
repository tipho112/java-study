class Student {
	
	String stuName;
	int stuAge;
	
	
	Student() {
		stuName = "È«±æµ¿";
		stuAge = 20;
	}
	
	Student(String name) {
		stuName = name;
		stuAge = 20;
	}
	
	Student(int age) {
		stuName = "È«±æµ¿";
		stuAge = age;
	}
	
	Student(String name, int age) {
		stuName = name;
		stuAge = age;
	}
}

class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student("°©");
		Student stu3 = new Student(24);
		Student stu4 = new Student("À»", 30);
		
		System.out.println("stu1 : " + stu1.stuName + "\t" + stu1.stuAge);
		System.out.println("stu2 : " + stu2.stuName + "\t" + stu2.stuAge);
		System.out.println("stu3 : " + stu3.stuName + "\t" + stu3.stuAge);
		System.out.println("stu4 : " + stu4.stuName + "\t" + stu4.stuAge);
	}
}