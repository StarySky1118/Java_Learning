public class Test02{
	public static void main(String[] args){
		// 多态
		Computer h = new Huawei();
		h.startup();

		// 向下转型
		if(h instanceof Huawei)
		{
			Huawei h1 = (Huawei)h;
			h1.logo();
		}
	}
}