package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.reservation.ReservationConfirmRequest;
import ilcarro.view.reservation.ReservationRequest;
import ilcarro.view.reservation.ReservationResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/reservation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"reservation"})
public class ReservationController {

    @PostMapping(value = "/reservation/confirm")
    @ApiOperation(value = "Confirm payment", response = ReservationConfirmRequest.class, tags = {"reservation"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<ReservationConfirmRequest> confirmReservation(@RequestBody final ReservationConfirmRequest reservation) {
        throw new NotImplementedException();
    }

    @PostMapping(value = "/car/{serial_number}/reservation")
    @ApiOperation(value = "Make a reservation", response = ReservationConfirmRequest.class, tags = {"reservation","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<ReservationResponse> makeReservation(@RequestBody final ReservationRequest reservationRequest, @PathVariable String serial_number) {
        throw new NotImplementedException();
    }
}
