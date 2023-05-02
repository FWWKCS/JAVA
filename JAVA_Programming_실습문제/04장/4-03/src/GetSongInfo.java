class Song{
	private String title;
	private String artist;
	private int year;
	private String country;
	public Song() {}
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(this.year+"년 "+this.country+"국적의 "+this.artist+"가 부른 "+this.title);
	}
}

public class GetSongInfo {
	public static void main(String[] args) {
		Song Dancing_Queen = new Song("Dancing Queen","ABBA",1978,"스웨덴");
		Dancing_Queen.show();
	}
}
