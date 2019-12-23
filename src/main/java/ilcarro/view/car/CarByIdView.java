package ilcarro.view.car;

import ilcarro.view.period.PeriodView;
import ilcarro.view.user.OwnerView;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class CarByIdView extends CarView{
    private OwnerView owner;
    private List<PeriodView> booked_periods=new ArrayList<>();
}
