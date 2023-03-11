package com.cm.businessdirectory.gateway.web;

import com.cm.businessdirectory.domain.Business;
import com.cm.businessdirectory.gateway.BusinessGateway;
import com.cm.businessdirectory.usecase.CreateBusiness;
import com.cm.businessdirectory.usecase.GetBusiness;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@Slf4j
@RequestMapping("/directory")
@RequiredArgsConstructor
public class BusinessController {
    private final CreateBusiness createBusiness;
    private final GetBusiness getBusiness;

    @Operation(summary = "Create a new Business")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Business successfully created"),
            @ApiResponse(responseCode = "400", description = "Bad request")
    })
    @PostMapping(value = "/business",
            produces = APPLICATION_JSON_VALUE,
            consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<BusinessModelResponse> createBusiness(
            @RequestBody @Valid final BusinessModelRequest createBusinessRequest) {
        log.info("Creating business {}", createBusinessRequest);

        var response = createBusiness.createBusiness(createBusinessRequest);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }


    @GetMapping(value = "/business")
    public List<BusinessModelResponse> getBusinesses() {

        return getBusiness.getBusinesses();


    }
    //TODO metodo nuevo, anotation de GET, sin parametros, retorna una lista de negocios
}
