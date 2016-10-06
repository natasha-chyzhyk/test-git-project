package com.natasha.examples.first.model;

/**
 * Created by Stas on 06.10.2016.
 */
public class Cupboard {
    private Door[] doors;
    private float width;
    private float height;
    private float depth;
    private Material material;
    private Color color;
    private Box[] boxes;
    private Shelf[] shelvs;


    public void setDoors(Door... doors) {
        // ��� �����, ������ ��� �� ������������� �������� ������������
        //this.doors = doors;

        if (doors != null) {
            this.doors = new Door[doors.length];
            System.arraycopy(doors, 0, this.doors, 0, doors.length);
        } else {
            this.doors = null;
        }
    }

    /**
     * ���� �����. �� ������������� �������� ������������
     * @return
     */
    public Door[] getDoors() {
        return doors;
    }

    public Door getDoor(int index) {
        if (doors != null) {
            return (index>=0 && index<doors.length) ? doors[index] : null;
        } else {
            return null;
        }
    }

    public int getDoorsNumber() {
        return (doors != null) ? doors.length : 0;
    }
}
