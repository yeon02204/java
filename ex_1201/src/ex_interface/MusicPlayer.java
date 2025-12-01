package ex_interface;

public class MusicPlayer implements Playable{

	@Override
	public void Play() {
		System.out.println("음악재생");
	}

}
