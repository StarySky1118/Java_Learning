public class Test02{
	public static void main(String[] args){
		// ��̬
		Computer h = new Huawei();
		h.startup();

		// ����ת��
		if(h instanceof Huawei)
		{
			Huawei h1 = (Huawei)h;
			h1.logo();
		}
	}
}