public class IfTest02{
	public static void main(String[] args){
		// ����ɨ��������
		java.util.Scanner s = new java.util.Scanner(System.in);

		// ����������Ϣ
		System.out.print("������������Ϣ:");
		int weather = s.nextInt();
		while(weather!=0 && weather!=1){
			System.out.print("����������������Ϣ:");
			weather = s.nextInt();
		}// while

		// �����Ա���Ϣ
		System.out.print("�������Ա���Ϣ:");
		int sex = s.nextInt();
		while(sex!=1 && sex!=0){
			System.out.print("�����������Ա���Ϣ:");
			sex = s.nextInt();
		}// while

		// ���
		String action;
		if(weather==1){
			if(sex ==1){
				action = "��һ�Ѵ��ɡ";
			}else{
				action = "��һ��С��ɡ";
			}// else
		}else{
			if(sex ==1){
				action = "ֱ�����𣬳�ȥ��ˣ";
			}else{
				action = "�����ɹ˪����ȥ��ˣ";
			}// else
		}// else

		System.out.println(action);
	}
}