package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;

@Data
public class ActStat {

    BigDecimal ActStatId;
    String name;

    public ActStat(List rowData) {
        this.ActStatId = (BigDecimal) rowData.get(0);
        this.name = (String) rowData.get(1);
    }
}
