package ilcarro.view.filter;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter

public class FilterView {
    private String make;
    private List<String> makes = new ArrayList<>();
    private String model;
    private List<String> models = new ArrayList<>();
    private String year;
    private List<String> years = new ArrayList<>();
    private String engine;
    private List<String> engines = new ArrayList<>();
    private String fuel;
    private List<String> fuels = new ArrayList<>();
    private String gear;
    private List<String> gears = new ArrayList<>();
    private String wheels_drive;
    private List<String> wheelsDrives = new ArrayList<>();
}
