package co.com.doricolor.model.shippingreport.mapper;

import co.com.doricolor.model.shippingreport.ShippingReport;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ShippingReportResponse {
    private List<ShippingReport> shippingReport;
    private int status;
    private String description;
}
