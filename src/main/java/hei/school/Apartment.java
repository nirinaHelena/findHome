package hei.school;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;


@Data
@AllArgsConstructor
@ToString
@Builder
public class Apartment {
    private String id;
    private String title;
    private String description;
    private double monthlyRent;
    private Status status;
    private Location location;
}
