package com.logicalapphouse.calulator.model;

import android.graphics.Bitmap;

/**
 * Created by AkashYad on 4/30/2016.
 */
public class ItemObjects {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override
    public String toString() {
        return "ItemObjects{" +
                "name='" + name + '\'' +
                ", bitmap=" + bitmap +
                '}';
    }

    private Bitmap bitmap;

}
