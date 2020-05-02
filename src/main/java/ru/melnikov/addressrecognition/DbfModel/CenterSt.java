package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class CenterSt {
    @Id
    String id;
    BigDecimal centerStId;
    String name;

    public CenterSt(List rowData) {
        this.centerStId = (BigDecimal) rowData.get(0);
        this.name = (String) rowData.get(1);
    }
}
