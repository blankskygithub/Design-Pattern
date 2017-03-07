package com.blanksky.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {

	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("Mp4")){
			advancedMediaPlayer = new Mp4Player();
		}else if(audioType.equalsIgnoreCase("Vlc")){
			advancedMediaPlayer = new VlcPlayer();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("Mp4")){
			advancedMediaPlayer.playMp4(fileName);
		}else if(audioType.equalsIgnoreCase("Vlc")){
			advancedMediaPlayer.playVlc(fileName);
		}
	}

}
