package org.example;

import org.example.entity.Entity;

import java.util.HashMap;

public class Map {
    HashMap<Coordinates, Entity> entities = new HashMap<>();

    public void setEntity (Coordinates coordinates, Entity entity) {
        entity.coordinates = coordinates;
        entities.put(coordinates, entity);
    }
}
