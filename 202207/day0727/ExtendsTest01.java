public class ExtendsTest01{
	public static void main(String[] args){
		Bachelor b1 = new Bachelor("114514", "�����ƶ�", 3);
		System.out.println(b1.getName() + "��ѧ�ţ�" + b1.getNo() + "����һ��һ��" + b1.getGrade() +"�꼶ѧ��");
		Bachelor b2 = b1;
		System.out.println(b1.equals(b2));
		System.out.println(b1.toString());
	}
}