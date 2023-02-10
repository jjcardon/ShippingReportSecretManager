package co.com.doricolor.api;
import co.com.doricolor.model.shippingreport.mapper.ShippingReportResponse;
import co.com.doricolor.usecase.shippingreport.ShippingReportUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {
    private final ShippingReportUseCase useCase;

    @GetMapping(path = "/getAllByShip")
    public ResponseEntity<ShippingReportResponse> getAllByShip() {
        var response = ShippingReportResponse.builder().build();
        var httpCode = HttpStatus.CONTINUE;
        //if(!clientId.equalsIgnoreCase(clientIdValue)){
        //    httpCode = HttpStatus.UNAUTHORIZED;
        //}else{
        response = useCase.queryShippingReportAllByShip();
        if (response.getStatus()==200) {
            httpCode = HttpStatus.OK;
        }
        //}
        return new ResponseEntity<ShippingReportResponse>(response,httpCode);


    }
}
