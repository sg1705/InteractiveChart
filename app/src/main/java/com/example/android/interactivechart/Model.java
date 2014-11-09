package com.example.android.interactivechart;

/**
 * Created by sagupta on 9/27/14.
 */
public class Model {

    public float[] currentViewPort;
    public int[] content = new int[4];

    Model(float[] currentViewPort) {
        this.currentViewPort = currentViewPort;
    }
}
