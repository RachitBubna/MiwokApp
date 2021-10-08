package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourseId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourseId = audioResourseId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourseId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourseId = audioResourseId;
    }

    public String getmDefaultTranslation() { return mDefaultTranslation; }

    public String getmMiwokTranslation() { return mMiwokTranslation; }

    public int getmImageResourceId() { return mImageResourceId; }

    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED; }

    public int getmAudioResourseId() {return mAudioResourseId;}

}
