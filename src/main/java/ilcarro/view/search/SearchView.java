package ilcarro.view.search;

import ilcarro.view.car.CarByIdView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class SearchView {
    private Integer current_page;
    private Integer items_on_page;
    private Integer  items_total;
    private List<CarByIdView> cars=new ArrayList<>();

}
