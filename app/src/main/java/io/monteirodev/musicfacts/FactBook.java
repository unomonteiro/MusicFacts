package io.monteirodev.musicfacts;

import java.util.Random;

public class FactBook {

    // Fields (Member Variables - Properties about the object
    private int mLastFactNumber = 0;
    private String[] mFacts = {
            "The chills you get when you listen to music, is mostly caused by the brain releasing dopamine while anticipating the peak moment of a song.",
            "There are few activities in life that utilizes the entire brain, and music is one of them.",
            "Playing music regularly will physically alter your brain structure.",
            "The brain responds to music the same way it responds to something that you eat.",
            "Listening to music while exercising can significantly improve your work-out performance.",
            "An emotional attachment could be the reason for your favorite song choice.",
            "Your heartbeat changes to mimics the music you listen to.",
            "Listening to happy vs. sad music can affect the way you perceive the world around you.",
            "An “earworm” is a song that  you can’t seem to get out of your head.",
            "Music triggers activity in the same part of the brain that releases Dopamine, the “pleasure chemical”.",
            "Music is often prescribed to patients with Parkinson’s Disease and stroke victims.",
            "According to a study, Learning a musical instrument can improve fine motor and reasoning skills."
    };

    // Methods - Actions the object can take
    public String getFact() {
        String fact;
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        if (mLastFactNumber == randomNumber){
            //get next fact without exceeding Facts length
            randomNumber = (randomNumber + 1) % (mFacts.length);
        }

        fact = mFacts[randomNumber];
        mLastFactNumber = randomNumber;

        return fact;
    }
}
