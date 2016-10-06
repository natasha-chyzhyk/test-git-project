package com.natasha.examples.first.model;

/**
 * Created by Stas on 06.10.2016.
 */
public class Door {
    private float width;
    private float height;
    private Handle handle;
    private Material[] material;

    public Door(float w, float h, Material[] material) {

        this.material = new Material[3];
        this.material[0] = Material.DSP;
        this.material[1] = Material.GLASS;

        width = w;
        height = h;
        this.material = material;
    }

    public float getWidth(){
        return width;
    }

    public float getHeight(){
        return height;
    }
}
