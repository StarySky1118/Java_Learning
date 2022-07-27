public class T{
	A a;

	public static void main(String[] args){
		T t = new T();
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		t.a = a;
		a.b = b;
		b.c = c;
		c.d = d;
		d.i = 250;

		System.out.println(t.a.b.c.d.i);
	}
}// T

class A{
	B b;
}// A

class B{
	C c;
}// B

class C{
	D d;
}// C

class D{
	int i;
}// D