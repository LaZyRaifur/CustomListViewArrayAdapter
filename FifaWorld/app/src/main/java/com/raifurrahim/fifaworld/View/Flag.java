package com.raifurrahim.fifaworld.View;

public class Flag {

    private int mImage;
    private String mDescription;
    private String mName;


    public Flag(int mImage, String mDescription, String mName) {
        this.mImage = mImage;
        this.mDescription = mDescription;
        this.mName = mName;
    }

    public int getmImage() {
        return mImage;
    }

    public void setmImage(int mImage) {
        this.mImage = mImage;
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
}
