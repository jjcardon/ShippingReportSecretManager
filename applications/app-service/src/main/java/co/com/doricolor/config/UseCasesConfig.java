package co.com.doricolor.config;

import co.com.doricolor.model.shippingreport.gateways.ShippingReportRepository;
import co.com.doricolor.usecase.shippingreport.ShippingReportUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
public class UseCasesConfig {
        @Bean
        ShippingReportUseCase shippingReportUseCase(ShippingReportRepository shippingReportRepository){
                return new ShippingReportUseCase(shippingReportRepository);
        }
}
