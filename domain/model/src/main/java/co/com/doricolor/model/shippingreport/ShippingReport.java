package co.com.doricolor.model.shippingreport;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class ShippingReport {
    private String trackingNumber;
    private String city;
    private String customer;
    private String address;
    private String phoneNumber;
    private Long unit;
    private Long actualWeight;
    private Long weightVolume;
    private Double DeclaredValue;
    private String shipping;
    private String observation;

}
