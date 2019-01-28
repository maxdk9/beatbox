package beatbox.and.mazzy.beatbox;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeatBox {
    private static final String TAG="BeatBox";
    private static final String SOUNDS_FOLDER="sample_sounds";
    private AssetManager mAssets;

    public List<Sound> getSounds() {
        return mSounds;
    }

    private List<Sound> mSounds=new ArrayList<Sound>();
    public BeatBox(Context context){
        mAssets=context.getAssets();

        loadSounds();
    }

    private void loadSounds() {
        String [] soundNames;
        try{
            soundNames=mAssets.list(SOUNDS_FOLDER);
            Log.i(TAG, "Found  "+soundNames.length+" sounds");
        }
        catch (IOException e){
            Log.e(TAG, "loadSounds: Could not load sounds from assets" );
            return;
        }

        for (String soundName : soundNames) {
            String assetPath=SOUNDS_FOLDER+"/"+soundName;
            Sound sound=new Sound(assetPath);
            mSounds.add(sound);
        }
        }



}
