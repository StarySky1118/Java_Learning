public class IfTest01{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û���������
		System.out.print("�������������䣺");
		int age = s.nextInt();

		// ѭ������ֱ�����ݺϷ�
		while(age<0 || age>150){
			System.out.print("�����������������䣬ȷ��������������");
			age = s.nextInt();
		}// while

		// ���ݼ���������ж������׶�
		String stage;
		if(age<=5){
			stage = "��̬baby��";
		}else if(age<=10){
			stage = "����Сѧ��";
		}else if(age<=18){
			stage = "������ѧ��";
		}else if(age<=35){
			stage = "����һ��һ�����갡������";
		}else if(age<=55){
			stage = "�˵�����";
		}else{
			stage = "����һ��һ��������";
		}// if
		System.out.println("�������������׶�Ϊ" + stage);
	}
}