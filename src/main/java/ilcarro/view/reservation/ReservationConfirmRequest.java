package ilcarro.view.reservation;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationConfirmRequest {
   private Integer order_number;
   private String  confirmation_code;
}
