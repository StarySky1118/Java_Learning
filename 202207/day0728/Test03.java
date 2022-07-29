public class Test03 {
	public static void main(String[] args) {
		Girl cs = new ChengShu();
		Girl wyq = new Wyq();

		cs.makeup();
		wyq.makeup();

		if(cs instanceof ChengShu)
		{
			ChengShu cs1 = (ChengShu)cs;
			cs1.suck();
		}
	}
}
