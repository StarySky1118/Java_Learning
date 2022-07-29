// 乐手类
public class Musician{
	public void play(Instrument instrument){
		// 向下转型
		if(instrument instanceof Guitar){
			Guitar g = (Guitar)instrument;
			g.play_Guitar();
		}else if (instrument instanceof Piano){
			Piano p = (Piano)instrument;
			p.play_Piano();
		}
	}
}