package tutorialweek04;


public class studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1 = new student();
		s1.name = "Surendra";
		s1.age = 20;
		s1.course = "BCS";
		
		s1.details();
		student s2 = new student();
		s2.name = "Samyog";
		s2.age = 19;
		s2.course = "BCS";
		
	}
}
class student {
	String name;
	int age;
	String course;
	
	public void details() {
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Course: "+course);
	}

}


