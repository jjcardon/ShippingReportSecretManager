package co.com.doricolor.usecase.shippingreport;

import co.com.doricolor.model.shippingreport.gateways.ShippingReportRepository;
import co.com.doricolor.model.shippingreport.mapper.ShippingReportResponse;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@AllArgsConstructor
public class ShippingReportUseCase {
    private ShippingReportRepository shippingReportRepository;

    public ShippingReportResponse queryShippingReportAllByShip(){
        var response = ShippingReportResponse.builder().build();

        var responseRepor = shippingReportRepository.getAllByShip();
        if (responseRepor != null) {
            response.setStatus(200);
            response.setDescription("BUSQUEDA EXITOSA");
            response.setShippingReport(responseRepor);
        } else {
            response.setStatus(203);
            response.setDescription("NO SE ENCONTRARON DATOS");
        }

        return response;


    }

}
