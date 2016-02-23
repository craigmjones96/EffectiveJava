package com.interfaces;

// Via interface hierarchy we can produce a singer songwriter that fulfills the job
// of a singer (sing), a song writer (compose) and specifics we normally only associate 
// with a singer songwriter (strum and actSensitive)

// we wouldn't have been able to do this using using abstracted classes as you can only extend one class.
// if we had extended singer, we wouldn't be able to get the song writer extension and vice versa.

// we could have created a class to implement what a singer and song writer does (such as the methods
// shown below) but that would mean there would be no separation of classes for a singer and a song writer
// (without having code duplication or bloated hierarchy system).
public class SingerSongwriterImpl implements SingerSongWriter {

	@Override
	public void sing(String song) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void compose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void strum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actSensitive() {
		// TODO Auto-generated method stub
		
	}

}
