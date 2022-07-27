public class ExtendsTest01{
	public static void main(String[] args){
		Bachelor b1 = new Bachelor("114514", "田所浩二", 3);
		System.out.println(b1.getName() + "，学号：" + b1.getNo() + "，事一个一个" + b1.getGrade() +"年级学生");
		Bachelor b2 = b1;
		System.out.println(b1.equals(b2));
		System.out.println(b1.toString());
	}
}