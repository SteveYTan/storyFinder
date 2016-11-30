package team29.storyfinder;

import android.graphics.Bitmap;

import java.util.UUID;


public class Story {
    UUID mUuid;
    String mName;
    String mDescription;
    Bitmap img;

    public Bitmap getImg() {

        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getmDescription() {

        return mDescription;
    }

    public void setmDescription(String mDescription) {

        this.mDescription = mDescription;
    }

    public String getmName() {

        return mName;
    }

    public void setmName(String mName) {

        this.mName = mName;
    }

    public UUID getmUuid() {
        return mUuid;
    }

    public void setmUuid(UUID mUuid) {
        this.mUuid = mUuid;
    }
}
