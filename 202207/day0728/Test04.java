public class Test04 {
	public static void main(String[] args) {
		Instrument i1 = new Guitar();
		Instrument i2 = new Piano();
		Musician m1 = new Musician();

		m1.play(i1);
		m1.play(i2);

	}
}
