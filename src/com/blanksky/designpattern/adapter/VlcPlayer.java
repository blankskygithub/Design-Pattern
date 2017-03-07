package com.blanksky.designpattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing Vlc file: "+fileName);

	}

}
