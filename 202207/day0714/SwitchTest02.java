public class SwitchTest02{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �û���������
		System.out.print("������ɼ�:");
		int score = s.nextInt();
		while(score<0||score>100){
			System.out.print("�ɼ��Ƿ�������������ɼ�:");
			score = s.nextInt();
		}// while

		// ���ݼ�����������ȵ�
		String grade;
		switch(score/10){
		case 9 : case 10 :
			grade = "��";
			break;
		case 8 : 
			grade = "��";
			break;
		case 7 : 
			grade = "��";
			break;
		case 6 : 
			grade = "����";
			break;
		default : 
			grade = "������";
		}
		System.out.println(grade);
	}
}