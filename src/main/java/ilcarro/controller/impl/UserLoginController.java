package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.user.UserFullView;
import ilcarro.view.user.UserView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/user/login", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"userLogin"})
public class UserLoginController {
    @GetMapping(value = "/user")
    @ApiOperation(value = "Login user", response = UserFullView.class, tags = {"userLogin"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized")
    })
    public ResponseEntity<UserFullView> getCurrentCapacityById(@RequestBody final UserView userView) {
        throw new NotImplementedException();
    }
}
