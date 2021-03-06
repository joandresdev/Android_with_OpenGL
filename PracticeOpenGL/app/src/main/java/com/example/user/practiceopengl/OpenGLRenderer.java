package com.example.user.practiceopengl;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class OpenGLRenderer implements GLSurfaceView.Renderer {
    private double readValue = 1f;
    private double greenValue = 1f;
    private static final double FLASH_DURATION = 10000;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        GLES20.glClearColor((float) readValue,0,0,1f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {

    }

    @Override
    public void onDrawFrame(GL10 gl) {
        GLES20.glClearColor((float) readValue,(float) greenValue,0,1f);
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
        readValue = ((Math.sin(System.currentTimeMillis()*2*Math.PI/FLASH_DURATION)*0.5)+0.5);
        greenValue = ((Math.cos(System.currentTimeMillis()*2*Math.PI/FLASH_DURATION)*0.5)+0.5);
    }
}
