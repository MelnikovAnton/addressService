package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class CurentSt {
//    CURENTSTID{NUMERIC}  NAME{CHARACTER}

    @Id
    String id;
    BigDecimal curentStId;
    String name;

    public CurentSt(List rowData) {
        this.curentStId = (BigDecimal) rowData.get(0);
        this.name = (String) rowData.get(1);
    }
}
