public class SwitchTest01{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// �����û�����
		System.out.print("������һ��������");
		int userInputNum = s.nextInt();

		// ���
		String day;
		switch(userInputNum){
		case 1: case 2: case 3:
			day = "����һ";
			break;
		case 4:
			day = "������";
			break;
		case 5:
			day = "������";
			break;
		case 6:
			day = "������";
			break;
		default:
			day = "������";
		}// switch
		System.out.println(day);
	}

}