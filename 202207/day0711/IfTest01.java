public class IfTest01{
	public static void main(String[] args){
		int age; // ���ڽ����û����������
		
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û����������
		do
		{
			System.out.print("����������:");
			age = s.nextInt(); // ���ռ�������
			if(age>=0 && age<=150) // �Ϸ�����
			{
				break;
			}// if
		}while (true);

		// ���ݼ���������ж������׶�
		if(age<=5){
			System.out.println("Ӥ�׶�");
		}else if(age<=10){
			System.out.println("�ٶ�");
		}else if(age<=18){
			System.out.println("����");
		}else if(age<=35){
			System.out.println("����");
		}else if(age<=55){
			System.out.println("����");
		}else{
			System.out.println("����");
		}// else
	}// main()
}// IfTest01