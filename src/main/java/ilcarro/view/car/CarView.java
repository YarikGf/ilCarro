package ilcarro.view.car;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class CarView {
    private String serial_number;
    private String make;
    private String model;
    private Integer year;
    private String engine;
    private FuelType fuel;
    private GearType gear;
    private WheelsDriveType wheelsDrive;
    private Integer doors;
    private Integer seats;
    private BigDecimal fuelConsumption;
    private CarClassType carClass;
    private PriceView pricePerDay;
    private Integer distanceIncluded;
    private String about;
    private PickUpPlaceView pick_up_place;
    private List<String> imageUrls = new ArrayList<>();
}