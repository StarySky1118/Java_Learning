public class IfTest01{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û�����
		System.out.print("��������ĳɼ�:");
		double score = s.nextDouble();

		// ������Ҫ���ظ�����ֱ���Ϸ�
		while(score<0 || score>100){
			System.out.print("������Ϸ��ĳɼ�:");
			score = s.nextDouble();
		}// while

		// ���ݼ���ֵ����ȼ�
		String grade;
		if(score>=90){
			grade = "����";
		}else if(score>=80){
			grade = "����";
		}else if(score>=70){
			grade = "�е�";
		}else if(score>=60){
			grade = "����";
		}else{
			grade = "������";
		}// else
		System.out.println("��ĵȵ���" + grade);
	}

}