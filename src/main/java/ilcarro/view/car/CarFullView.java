package ilcarro.view.car;

import ilcarro.view.period.BookedPeriodView;
import ilcarro.view.user.OwnerView;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class CarFullView extends CarView {
   private OwnerView owner;
   private List<BookedPeriodView> booked_periods=new ArrayList<>();
}
