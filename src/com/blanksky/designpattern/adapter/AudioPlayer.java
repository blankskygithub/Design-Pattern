package com.blanksky.designpattern.adapter;

public class AudioPlayer implements MediaPlayer {

	private MediaAdapter mediaAdapter;
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file: "+fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter("Mp4");
			mediaAdapter.play(audioType, fileName);
		}else if(audioType.equalsIgnoreCase("vlc")){
			mediaAdapter = new MediaAdapter("vlc");
			mediaAdapter.play(audioType, fileName);
		}else{
			System.out.println("Invalid media file: "+fileName);
		}
	}

}
