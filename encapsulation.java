package tutorialweek04;

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s5 = new student1();
		s5.setName("Surendra Giri");
		s5.setAge(20);
		String name1 = s5.getName();
		int Age1 = s5.getAge();
		System.out.println("Name of the Sincere Student of this college is Mr."+name1+"\nHe is "+Age1+"years old.");
	}
}
class student1{
	private String name;
	private int age;
	void setName(String n) {
		this.name = n;
	}
	String getName() {
		return name;
	}
	void setAge(int a) {
		this.age = a;
	}
	int getAge() {
		return age;
	}
}