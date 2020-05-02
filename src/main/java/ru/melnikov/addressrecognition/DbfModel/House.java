package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class House {
    //    AOGUID{CHARACTER}  BUILDNUM{CHARACTER}  ENDDATE{DATE}  ESTSTATUS{NUMERIC}  HOUSEGUID{CHARACTER}
    private final String aoGuid;
    private final String buidNum;
    private final Date endDate;
    private final BigDecimal estStatus;
    private final String houseGuid;
    //    HOUSEID{CHARACTER}  HOUSENUM{CHARACTER}  STATSTATUS{NUMERIC}  IFNSFL{CHARACTER}  IFNSUL{CHARACTER}  OKATO{CHARACTER}
    private final String houseId;
    private final String houseNum;
    private final BigDecimal staStatus;
    private final String ifnsFl;
    private final String ifnsUl;
    private final String okato;
    //    OKTMO{CHARACTER}  POSTALCODE{CHARACTER}  STARTDATE{DATE}  STRUCNUM{CHARACTER}  STRSTATUS{NUMERIC}
    private final String oktmo;
    private final String postalCode;
    private final Date startDate;
    private final String strUcNum;
    private final BigDecimal strStatus;
    //    TERRIFNSFL{CHARACTER}  TERRIFNSUL{CHARACTER}  UPDATEDATE{DATE}  NORMDOC{CHARACTER}  COUNTER{NUMERIC}  C
    private final String terIfnsFl;
    private final String terIfnsUl;
    private final Date updateDate;
    private final String normDoc;
    private final BigDecimal counter;
    //    ADNUM{CHARACTER}  DIVTYPE{NUMERIC}
    private final String cadNum;
    private final BigDecimal divType;

    public House(List rowData) {
        this.aoGuid = (String) rowData.get(0);
        this.buidNum = (String) rowData.get(1);
        this.endDate = (Date) rowData.get(2);
        this.estStatus = (BigDecimal) rowData.get(3);
        this.houseGuid = (String) rowData.get(4);
        this.houseId = (String) rowData.get(5);
        this.houseNum = (String) rowData.get(6);
        this.staStatus = (BigDecimal) rowData.get(7);
        this.ifnsFl = (String) rowData.get(8);
        this.ifnsUl = (String) rowData.get(9);
        this.okato = (String) rowData.get(10);
        this.oktmo = (String) rowData.get(11);
        this.postalCode = (String) rowData.get(12);
        this.startDate = (Date) rowData.get(13);
        this.strUcNum = (String) rowData.get(14);
        this.strStatus = (BigDecimal) rowData.get(15);
        this.terIfnsFl = (String) rowData.get(16);
        this.terIfnsUl = (String) rowData.get(17);
        this.updateDate = (Date) rowData.get(18);
        this.normDoc = (String) rowData.get(19);
        this.counter = (BigDecimal) rowData.get(20);
        this.cadNum = (String) rowData.get(21);
        this.divType = (BigDecimal) rowData.get(22);
    }
}
