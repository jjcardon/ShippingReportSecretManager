package co.com.doricolor.model.shippingreport.gateways;

import co.com.doricolor.model.shippingreport.ShippingReport;

import java.util.List;

public interface ShippingReportRepository {

    public List<ShippingReport> getAllByShip();
}
