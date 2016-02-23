package com.interfaces;

// attributes normally only associated with a singer song writer specifically are
// defined here but we see it also extends singer and song writer so will incorporate 
// their specific attributes also.
public interface SingerSongWriter extends SInger, Songwriter {

	void strum();
	void actSensitive();
}
