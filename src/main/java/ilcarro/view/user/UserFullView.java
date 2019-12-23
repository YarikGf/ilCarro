package ilcarro.view.user;

import ilcarro.view.car.BookedCarView;
import ilcarro.view.car.OwnCarView;
import ilcarro.view.comment.CommentView;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class UserFullView extends OwnerView{
    private List<CommentView> comments = new ArrayList<>();
    private List<OwnCarView> ownCars = new ArrayList<>();
    private List<BookedCarView> bookedCars = new ArrayList<>();
    private List<BookedCarView> history = new ArrayList<>();


}
