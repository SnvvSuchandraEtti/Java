
abstract class animal{
	//2 implemention
	abstract void introduce();// abstract method
}
class cat extends animal{
	void introduce() {
		System.out.println("Hey, i am cat");
		
	}
}
class elephant extends animal{
	void introduce() {
		System.out.println("Hey, i am elephant");
		
	}
}
public class Animal {
	public static void main(String[] arg) {
		cat c1=new cat();
		c1.introduce();
		elephant e1=new elephant();
		e1.introduce();
	}

}