package ilcarro.view.car;

import ilcarro.view.period.BookedPeriodWithPersonView;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class OwnCarView extends CarView {
    private List<BookedPeriodWithPersonView> bookedPeriods = new ArrayList<>();
}