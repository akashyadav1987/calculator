package com.logicalapphouse.calulator.model;

/**
 * Created by Akashyadav on 30/05/16.
 */
public class ItemData {
    private String heading;
    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    @Override
    public String toString() {
        return "ItemData{" +
                "heading='" + heading + '\'' +
                '}';
    }
}
