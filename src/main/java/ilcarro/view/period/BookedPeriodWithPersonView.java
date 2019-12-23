package ilcarro.view.period;

import ilcarro.view.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookedPeriodWithPersonView extends BookedPeriodView{
    private PersonWhoBookedView personWhoBooked;
}