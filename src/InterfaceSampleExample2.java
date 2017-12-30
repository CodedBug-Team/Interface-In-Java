interface Ia{
	int x = 10;
	void a();
}
interface Ib{
	void b();
}
interface Ic extends Ia,Ib{
	void c();
}
abstract class Cc implements Ic{
	public void a(){
		System.out.println("A");
	}
}
class DerivedC extends Cc{
	public void b(){
		System.out.println("B");
	}
	public void c(){
		System.out.println("C");
	}
	public void d(){
		System.out.println("D");
	}
}
public class InterfaceSampleExample2 {
	
	public static void main(String args[]){	
		Ia obj = new DerivedC();
		obj.a();
		System.out.println(obj instanceof DerivedC);
		Ib obj1 = new DerivedC();
		obj1.b();
		System.out.println(obj instanceof Cc);
		Ic obj2 = new DerivedC();
		obj2.a();
		obj2.b();
		obj2.c();
		System.out.println(obj2 instanceof Ia);
		System.out.println(obj2 instanceof Ib);
		System.out.println(obj2 instanceof Ic);
		System.out.println(obj2 instanceof Cc);
		System.out.println(obj2 instanceof DerivedC);
	}

}
