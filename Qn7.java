package tutorialweek04;

public class Qn7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box main = new Box();
		Box square = new Box(10);
		Box rect = new Box(10,8);
		
	}

}
class Box{
	float width;
	float height;
	float length;
	float areaofsquare;
	float areaofrect;
	
	
	// for Square
	Box(float length){
		this.length =length;
		this.areaofrect = length*length;
		System.out.println("The Area of the Square is: "+areaofrect);
	}
	
	//for Rectangle
	Box(float length,float width){
		this.length = length;
		this.width =width;
		this.areaofrect = length*width;
		System.out.println("The area of the rectangle is: "+areaofrect);
	}
	
	//N0 Parameter
	Box(){
		float length = 10;
		float width = 8;
		float heigth = 12;
		System.out.println("Entered Values are: \n");
		System.out.println(length+"\n"+width+"\n"+heigth);
	}
}