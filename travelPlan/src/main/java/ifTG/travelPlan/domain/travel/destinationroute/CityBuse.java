package ifTG.travelPlan.domain.travel.destinationroute;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "city_buses")
public class CityBuse extends DestinationRoute{

    @Column(nullable = false)
    private String busNumber;

    @Column(nullable = false)
    private String startPoint;

    @Column(nullable = false)
    private String endPoint;

    @Column(nullable = false)
    private int distance;

    @Column(nullable = false)
    private int averageTime;

    @Column(nullable = false)
    private int charge;
}
