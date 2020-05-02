package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class StrStat {
    //    STRSTATID{NUMERIC}  NAME{CHARACTER}  SHORTNAME{CHARACTER}
    private final BigDecimal strStatId;
    private final String name;
    private final String shortName;

    public StrStat(List rowData) {
        this.strStatId = (BigDecimal) rowData.get(0);
        this.name = (String) rowData.get(1);
        this.shortName = (String) rowData.get(2);
    }
}
