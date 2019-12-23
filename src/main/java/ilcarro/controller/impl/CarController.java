package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.car.CarFullView;
import ilcarro.view.car.CarView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/car", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"car"})
public class CarController {

    @PostMapping(value = "/")
    @ApiOperation(value = "Add Car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CarFullView> addCar(@RequestBody final CarView car) {
        throw new NotImplementedException();
    }

    @PutMapping(value = "/{serial_number}")
    @ApiOperation(value = "Update car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<CarFullView> updateCar(@RequestBody final CarView car, @PathVariable String serial_number) {
        throw new NotImplementedException();
    }

    @DeleteMapping(value = "/{serial_number}")
    @ApiOperation(value = "Delete Car", response = CarFullView.class, tags = {"car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public void deleteCar(@PathVariable String serial_number){
        throw new NotImplementedException();
    }
}
