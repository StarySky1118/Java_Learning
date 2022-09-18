package api01;

public class Person extends Animal{
    public String name;
    protected char gender;
    int age;
    private int sal;
    private static int n1 = 200;

    public void m1() {
        System.out.println("m1..");
    }

    protected void m2() {
        System.out.println("m2..");
    }

    void m3() {
        System.out.println("m3..");
    }

    private void m4() {
        System.out.println("m4..");
    }
}
