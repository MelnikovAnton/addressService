package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class FlatType {
//    FLTYPEID{NUMERIC}  NAME{CHARACTER}  SHORTNAME{CHARACTER}

    @Id
    String id;
    BigDecimal flTypeId;
    String name;
    String shortName;

    public FlatType(List rowData) {
        this.flTypeId = (BigDecimal) rowData.get(0);
        this.name = (String) rowData.get(1);
        this.shortName = (String) rowData.get(2);
    }

}
