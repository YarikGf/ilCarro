package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.CarByIdView;
import ilcarro.view.comment.CommentView;
import ilcarro.view.filter.FilterView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/util", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"util"})
public class UtilController {

   @GetMapping(value = "/filters")
   @ApiOperation(value = "Get filters", response = FilterView.class, tags = {"util","filter"})
   @ApiResponses(value = {
           @ApiResponse(code = 200, message = "OK"),
           @ApiResponse(code = 404, message = "Not Found")
   })
   public ResponseEntity<List<FilterView>> getFilters(){
       throw new NotImplementedException();
   }

   @GetMapping(value = "/comments")
   @ApiOperation(value = "Latest comments", response = CommentView.class, tags = {"util","comments"})
   @ApiResponses(value = {
           @ApiResponse(code = 200, message = "OK"),
           @ApiResponse(code = 404, message = "Not Found")
   })
    public ResponseEntity<List<CommentView>> getLatestComments(){ throw new NotImplementedException(); }

    @GetMapping(value = "/car{serial_number}")
    @ApiOperation(value = "Get car by id for users", response = CarByIdView.class, tags = {"util","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<CarByIdView> getCarById(@PathVariable String serial_number){ throw new NotImplementedException(); }

    @GetMapping(value = "/car/best")
    @ApiOperation(value = "Best booked", response = CarByIdView.class, tags = {"util","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<CarByIdView>> bestBooked(){ throw new NotImplementedException(); }
}
