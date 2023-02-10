package co.com.doricolor.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class ShippingReportEntity {
    @Id
    @Column(name = "trackingNumber") private String trackingNumber;
    @Column(name = "city") private String city;
    @Column(name = "customer") private String customer;
    @Column(name = "address") private String address;
    @Column(name = "phoneNumber") private String phoneNumber;
    @Column(name = "unit") private Long unit;
    @Column(name = "actualWeight") private Long actualWeight;
    @Column(name = "weightVolume") private Long weightVolume;
    @Column(name = "DeclaredValue") private Double DeclaredValue;
    @Column(name = "Shipping") private String Shipping;
    @Column(name = "observation") private String observation;
}
