// ��ʾʵ�������ʹ��
public class InstanceTest01{
	{
		System.out.println("��̬�����ִ�У�");
	}

	public static void main(String[] args){
		InstanceTest01 t = new InstanceTest01("����");
	}
	
	// �޲ι��췽��
	public InstanceTest01(){}

	// �вι��췽��
	public InstanceTest01(String name){
		System.out.println(name);
	}
}