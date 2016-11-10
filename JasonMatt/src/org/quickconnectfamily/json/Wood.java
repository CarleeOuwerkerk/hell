package org.quickconnectfamily.json;

import java.io.Serializable;

/**
 * Created by foxma on 11/1/2016.
 */
public class Wood implements Serializable {
    private int woodAmout;
    private String woodName;
    private String woodTyp;

    public Wood(int woodAmout, String woodName, String woodTyp){
        setWoodAmout(woodAmout);
        setWoodName(woodName);
        setWoodTyp(woodTyp);
    }

    public int getWoodAmout() {
        return woodAmout;
    }

    public void setWoodAmout(int woodAmout) {
        this.woodAmout = woodAmout;
    }

    public String getWoodName() {
        return woodName;
    }

    public void setWoodName(String woodName) {
        this.woodName = woodName;
    }

    public String getWoodTyp() {
        return woodTyp;
    }

    public void setWoodTyp(String woodTyp) {
        this.woodTyp = woodTyp;
    }

    @Override
    public String toString() {
        return "Wood{" +
                "woodAmout=" + woodAmout +
                ", woodName='" + woodName + '\'' +
                ", woodTyp='" + woodTyp + '\'' +
                '}';
    }
}
