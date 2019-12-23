package ilcarro.view.car;

import ilcarro.view.period.BookedPeriodView;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookedCarView {
    private String serialNumber;
    private BookedPeriodView bookedPeriod;
}