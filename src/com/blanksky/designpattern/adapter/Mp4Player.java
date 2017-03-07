package com.blanksky.designpattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing Mp4 file: "+fileName);

	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

}
