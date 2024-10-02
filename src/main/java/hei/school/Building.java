package hei.school;

import lombok.*;

@Getter
@Setter
@ToString
public final class Building extends Location {
    private int numberOfFloors;
    public Building(String id, String nom, int  numberOfFloors) {
        super(id, nom);
        this.numberOfFloors = numberOfFloors;
    }
}
