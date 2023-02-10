package co.com.doricolor.jpa;

import co.com.doricolor.jpa.entity.ShippingReportEntity;
import co.com.doricolor.jpa.helper.AdapterOperations;
import co.com.doricolor.model.shippingreport.ShippingReport;
import co.com.doricolor.model.shippingreport.gateways.ShippingReportRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<ShippingReport, ShippingReportEntity, String, JPARepository>
implements ShippingReportRepository
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, ShippingReport.class));


    }

    @Override
    public List<ShippingReport> getAllByShip() {
        var data = repository.findAllByShip();
        return this.toList(data);
    }

}
