package ilcarro.view.car;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;


@Getter
@Setter
public class PriceView {
    private CurrencyType currency;
    private BigDecimal amount;
}