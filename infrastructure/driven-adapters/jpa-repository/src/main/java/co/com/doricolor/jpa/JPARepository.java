package co.com.doricolor.jpa;

import co.com.doricolor.jpa.entity.ShippingReportEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface JPARepository extends CrudRepository<ShippingReportEntity, String>, QueryByExampleExecutor<ShippingReportEntity> {
    @Query(value = "select parametro.ValActual as trackingNumber, Destino.city as city, Destino.name as customer, Concat(Destino.Address1,' ',Destino.Address2) as address, Destino.PhoneNum as phoneNumber," +
            "HeadAdi.Number01 as unit, HeadAdi.Number02 as ActualWeight, HeadAdi.Number02 as WeightVolume, Head.DeclaredAmt as DeclaredValue," +
            "Head.PackNum as shipping, concat('ORDEN: ', Head.OTSOrderNum) as observation " +
            "from ShipHead as Head " +
            "inner join ShipTo AS Destino on Head.ShipToCustNum = Destino.CustNum And Head.ShipToNum = Destino.ShipToNum " +
            "inner join ShipHead_UD As HeadAdi on Head.SysRowID = HeadAdi.ForeignSysRowID " +
            "left join parameter as parametro on cast(parametro.parameter as int) = Head.PackNum " +
            "where Head.TrackingNumber = ''", nativeQuery = true)
    List<ShippingReportEntity> findAllByShip();
}
