package ilcarro.controller.impl;

import ilcarro.exception.NotImplementedException;
import ilcarro.view.comment.CommentShortView;
import ilcarro.view.comment.CommentView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/comment/{serial_number}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"comment"})
public class CommentController {
    @PostMapping(value = "/comment/{serial_number}")
    @ApiOperation(value = "Post a comment", response = CommentView.class, tags = {"comment","car"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 409, message = "Conflict")
    })
    public ResponseEntity<CommentView> postCommentById(@RequestBody final CommentShortView CommentView, @PathVariable String serial_number) {
        throw new NotImplementedException();
    }
}
