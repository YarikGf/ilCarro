package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.OwnCarView;
import ilcarro.view.period.BookedPeriodView;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
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
@RequestMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"user"})
public class UserController {


    @PutMapping(value = "/user")
    @ApiOperation(value = "Update user", response = UserFullView.class, tags = {"user"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<UserFullView> updateUser(@RequestBody final UserView user) {
        throw new NotImplementedException();
    }

    @DeleteMapping(value = "/user")
    @ApiOperation(value = "Delete user",response = UserFullView.class, tags = {"user"})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not Found")
    })
    public void deleteUser(){
        throw new NotImplementedException();
    }

    @GetMapping(value = "/user/cars")
    @ApiOperation(value = "Owner get cars", response = OwnCarView.class, tags = {"user","car"})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<OwnCarView>> getCarsByOwner(){
        throw new NotImplementedException();
    }

    @GetMapping(value = "/user/cars/{serial_number}")
    @ApiOperation(value = "Owner get car by id", response = OwnCarView.class, tags = {"user","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<List<OwnCarView>> getCarsById(@PathVariable String serial_number){
        throw new NotImplementedException();
    }

    @GetMapping(value = "/user/cars/{serial_number}/periods")
    @ApiOperation(value = "Owner get booked periods by car id", response = BookedPeriodView.class, tags = {"user","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<BookedPeriodView> getPeriodsByCarId(@PathVariable String serial_number){
        throw new NotImplementedException();
    }
    }



