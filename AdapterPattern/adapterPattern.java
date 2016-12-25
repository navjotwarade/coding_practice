package AdapterPattern;
interface AdvancedMediaPlayer{
    void playMp4();
    void playVlc();
    
}
class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
		System.out.println("playing mp4 song");
	}

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		
	}
	
}
class VlcPlayer implements AdvancedMediaPlayer{

	@Override
	public void playMp4() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void playVlc() {
		// TODO Auto-generated method stub
		System.out.println("playing vlc song");
	}
	
}
class MediaAdapter{
	
	AdvancedMediaPlayer advancedMPlayer;
	
		public void playVlc() {
			// TODO Auto-generated method stub
			advancedMPlayer = new VlcPlayer();
			advancedMPlayer.playVlc();
		}
		
		public void playMp4() {
			// TODO Auto-generated method stub
			advancedMPlayer = new Mp4Player();
			advancedMPlayer.playMp4();
		}
}
	

class AudioPlayer{
	MediaAdapter mediaadapter = new MediaAdapter();
	
	
	void play(String audioType, String songname)
    {
      if(audioType.equalsIgnoreCase("mp3")){
    	  System.out.println("playing "+ songname+ ".mp3");
      }
      else if(audioType.equalsIgnoreCase("mp4")  || audioType.equalsIgnoreCase("vlc")){
    	  if(audioType.equalsIgnoreCase("mp4"))  	  mediaadapter.playMp4();
    	  if(audioType.equalsIgnoreCase("vlc"))       mediaadapter.playVlc();
      }
	}
}
public class adapterPattern {

	public static void main(String[] args) {
	AudioPlayer audioplayer = new AudioPlayer();
	audioplayer.play("mp3","asaman tera.mp3");
	audioplayer.play("mp4", "raat ki baat.mp4");
		
	}
}
