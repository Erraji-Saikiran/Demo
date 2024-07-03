package initial;

public class DemoMethodType {
	//instance variable
	int num;
	//static varaiable
	static int a;
	//instance method
	void demo(int x) {
		num=x;
		System.out.println("value of num="+x);
	}
	//static method
	static void emo() {
	System.out.println("a="+a);
	}

	public static void main(String[] args) {
		//object 
		DemoMethodType dmt=new DemoMethodType();
		dmt.demo(20);
		a=40;
		System.out.println("value of a="+a);

	}

}
