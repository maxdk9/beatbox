package beatbox.and.mazzy.beatbox;

public class SoundViewModel {
    private Sound mSound;
    private BeatBox mBeatBox;
    public SoundViewModel(BeatBox beatBox){
        mBeatBox=beatBox;
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound s){
        mSound=s;
    }

    public String getTitle(){
        return mSound.getName();
    }


}
