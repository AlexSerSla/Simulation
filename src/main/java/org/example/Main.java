package org.example;

import org.example.entity.Entity;
import org.example.entity.Rock;

public class Main {
    public static void main(String[] args) {
        Map map = new Map();

        map.setEntity(new Coordinates(5, 7), new Rock(new Coordinates(5, 7)));

        int a = 123;

    }
}