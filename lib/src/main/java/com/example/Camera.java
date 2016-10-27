package com.example;
import java.util.*;

public class Camera
{
    // Camera properties
    private boolean rawPhotos;
    private boolean locationCapture;
    private boolean touchDisplay;
    private boolean uploadToCloud;
    private boolean videoStabilization;
    private boolean voiceControl;

    // The constructor sets true or false to all of the camera's properties
    Camera(boolean photoRaw, boolean captureLocation, boolean displayTouch, boolean cloudUpload, boolean stabilizationVideo, boolean controlVoice)
    {
        this.rawPhotos = photoRaw;
        this.locationCapture = captureLocation;
        this.touchDisplay = displayTouch;
        this.uploadToCloud = cloudUpload;
        this.videoStabilization = stabilizationVideo;
        this.voiceControl = controlVoice;


    }

    // The next six methods return the above camera properties for comparison
    public boolean returnRawPhotos()
    {

        return rawPhotos;

    }

    public boolean returnLocationCapture()
    {
        return locationCapture;

    }

    public boolean returnTouchDisplay()
    {

        return touchDisplay;

    }

    public boolean returnUploadToCloud()
    {
        return uploadToCloud;
    }

    public boolean returnVideoStabilization()
    {

        return videoStabilization;
    }

    public boolean returnVoiceControl()
    {

        return voiceControl;

    }





}
