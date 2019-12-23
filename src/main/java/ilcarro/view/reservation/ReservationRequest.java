package ilcarro.view.reservation;

import ilcarro.view.period.PeriodView;
import ilcarro.view.user.PersonWhoBookedView;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationRequest extends PeriodView {
    private PersonWhoBookedView person_who_booked;
}