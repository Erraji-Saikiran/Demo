package initial;

public class Rectangle {
	//method with parameters
	void area(int length,int breadth) {
		System.out.println("Area of a Rectangle="+(length*breadth));
	}
	//method with parameters
	void perimeter(int length,int breadth) {
	System.out.println("Perimeter of a Rectangle="+2*(length+breadth));	
	}
	public static void main(String[] args) {
		//creating object
	Rectangle re=new Rectangle();
	re.area(2, 4);
	re.perimeter(2, 4);
	}

}
