public class ObjectTest02{
	public static void main(String[] args){
		// ����Ʒ�ƶ���
		Brand iqoo = new Brand();
		iqoo.name = "IQOO";
		iqoo.slogan = "����լ�ı�����";

		// ����оƬ����
		Soc snapdragon865 = new Soc();
		snapdragon865.name = "����865";
		snapdragon865.f = 2.4;
		
		// �����ֻ�����
		Phone iqooNeo3 = new Phone();
		iqooNeo3.brand = iqoo;
		iqooNeo3.soc = snapdragon865;

		// �����ֻ�Ʒ�Ʊ���
		System.out.println(iqooNeo3.brand.name + "��" + iqooNeo3.brand.slogan);
	}
}

class Phone{
// �ֻ���
	Brand brand; // Ʒ��
	Soc soc; // оƬ
}// Phone

class Brand{
// Ʒ����
	String name; // Ʒ����
	String slogan; // ����
}// Brand

class Soc{
// оƬ��
	String name; // оƬ��
	double f; // ʱ��Ƶ��
}// Soc