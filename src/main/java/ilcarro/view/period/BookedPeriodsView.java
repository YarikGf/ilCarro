package ilcarro.view.period;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class BookedPeriodsView {
    private List<BookedPeriodWithPersonView> booked_periods= new ArrayList<>();
}
