public class IfTest02{
	public static void main(String[] args)
	{
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û�����
		System.out.print("������ɼ�ֵ:");
		int score = s.nextInt();

		// �жϼ����Ƿ�Ϸ�
		while(score<0 || score>100)
		{
			System.out.print("�ɼ��Ƿ�������������:");
			score = s.nextInt();
		}// while

		// ���ݼ���ֵ����ȵ�
		String grade;
		if(score>=90){
			grade = "����";
		}else if (score>=80){
			grade = "����";
		}else if (score>=60){
			grade = "����";
		}else{
			grade = "������";
		}// if
		System.out.println("��ĵȵ���" + grade);

	}
}