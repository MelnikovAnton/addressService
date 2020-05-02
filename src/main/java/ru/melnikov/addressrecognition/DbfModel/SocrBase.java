package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class SocrBase {
    //    LEVEL{NUMERIC}  SOCRNAME{CHARACTER}  SCNAME{CHARACTER}  KOD_T_ST{CHARACTER}
    private final BigDecimal level;
    private final String socrName;
    private final String scName;
    private final String kodTst;

    public SocrBase(List rowData) {
        this.level = (BigDecimal) rowData.get(0);
        this.socrName = (String) rowData.get(1);
        this.scName = (String) rowData.get(2);
        this.kodTst = (String) rowData.get(3);
    }
}
