package hei.school;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Getter
@Setter
@ToString
@Builder
public final class District extends Location{
    private List<Building> buildings;
    public District(String id, String name, List<Building> buildings) {
        super(id, name);
        this.buildings = buildings;
    }

    public boolean isApartmentIsinDistrict(District district, Apartment apartment){
        List<Building> buildings = district.getBuildings();
        Location apartmentLocation = apartment.getLocation();
        if (district.equals(apartmentLocation)){
            return true;
        }if (buildings.contains(apartmentLocation)){
            return true;
        }
        return false;
    }
}
