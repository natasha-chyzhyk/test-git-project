package com.natasha.examples.first;

import com.natasha.examples.first.model.Cupboard;
import com.natasha.examples.first.model.Door;
import com.natasha.examples.first.model.Material;

public class Main {

    public static void main(String[] args) {
        Cupboard cupboard = new Cupboard();
        cupboard.setDoors(new Door(5, 5, Material.WOOD), new Door(), new Door());

        cupboard.setDoors(new Door[]{ new Door(), new Door(), new Door() });

        for (int i=0; i<cupboard.getDoorsNumber(); i++) {
            System.out.println("Высота "+i+" двери шкафа: " +cupboard.getDoor(i).getHeight()+ " ширина: " +cupboard.getDoor(i).getWidth());
        }



    }
}
