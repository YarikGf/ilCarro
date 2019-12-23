package ilcarro.controller.impl;


import ilcarro.exception.NotImplementedException;
import ilcarro.view.search.SearchFilterView;
import ilcarro.view.search.SearchView;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = {"search"})
public class SearchController {

    @GetMapping(value = "/search")
    @ApiOperation(value = "Search", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> search() {throw new NotImplementedException(); }

    @GetMapping(value = "/search/geo")
    @ApiOperation(value = "Search by coordinates", response = SearchView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchView> searchGeo() {throw new NotImplementedException(); }

    @GetMapping(value = "/search/filters")
    @ApiOperation(value = "Search by filters", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> searchByFilters() {throw new NotImplementedException(); }

    @GetMapping(value = "/search/all")
    @ApiOperation(value = "Search that contains all searches", response = SearchFilterView.class, tags = {"search"})
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found")
    })
    public ResponseEntity<SearchFilterView> searchAll() {throw new NotImplementedException(); }

}
