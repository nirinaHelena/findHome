package hei.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Builder
public sealed class Location permits Building, District{
    private String id;
    private String name;

    public int howManyApartment(Location location, List<Apartment> apartments){
        int totalApartment = 0;
        if (location instanceof Building){
            totalApartment += howManyApartmentInBuilding((Building) location, apartments);
        }if (location instanceof District){
            for (int i = 0; i < ((District) location).getBuildings().size(); i++) {
                Building building = ((District) location).getBuildings().get(i);
                totalApartment += howManyApartmentInBuilding(building, apartments);
            }
        }
        return totalApartment;
    }
    private int howManyApartmentInBuilding(Building building, List<Apartment> apartments){
        var totalApartment = 0;
        for (int i = 0; i < apartments.size(); i++) {
            Apartment apartment = apartments.get(i);
            if (apartment.getLocation().equals(building)){
                totalApartment ++;
            }
        }
        return totalApartment;
    }
}
