package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Stead {
    //    STEADGUID{CHARACTER}  NUMBER{CHARACTER}  REGIONCODE{CHARACTER}  POSTALCODE{CHARACTER}  IFNSFL{CHARACTER}
    private final String steadGuid;
    private final String number;
    private final String regionCode;
    private final String postalCode;
    private final String ifnsFl;
    //    TERRIFNSFL{CHARACTER}  IFNSUL{CHARACTER}  TERRIFNSUL{CHARACTER}  OKATO{CHARACTER}  UPDATEDATE{DATE}
    private final String terIfnsFl;
    private final String ifnsUl;
    private final String terIfnsUl;
    private final String okato;
    private final Date updateDate;
    //    PARENTGUID{CHARACTER}  STEADID{CHARACTER}  PREVID{CHARACTER}  OPERSTATUS{NUMERIC}  STARTDATE{DATE}
    private final String parentGuid;
    private final String steadId;
    private final String prevId;
    private final BigDecimal operStatus;
    private final Date startDate;
    //    ENDDATE{DATE}  NEXTID{CHARACTER}  OKTMO{CHARACTER}  LIVESTATUS{NUMERIC}  CADNUM{CHARACTER}
    private final Date endDate;
    private final String nextId;
    private final String oktmo;
    private final BigDecimal liveStatus;
    private final String cadNum;
    //    DIVTYPE{NUMERIC}  COUNTER{NUMERIC}  NORMDOC{CHARACTER}
    private final BigDecimal divType;
    private final BigDecimal counter;
    private final String normDoc;


    public Stead(List rowData) {
        this.steadGuid = (String) rowData.get(0);
        this.number = (String) rowData.get(1);
        this.regionCode = (String) rowData.get(2);
        this.postalCode = (String) rowData.get(3);
        this.ifnsFl = (String) rowData.get(4);
        this.terIfnsFl = (String) rowData.get(5);
        this.ifnsUl = (String) rowData.get(6);
        this.terIfnsUl = (String) rowData.get(7);
        this.okato = (String) rowData.get(8);
        this.updateDate = (Date) rowData.get(9);
        this.parentGuid = (String) rowData.get(10);
        this.steadId = (String) rowData.get(11);
        this.prevId = (String) rowData.get(12);
        this.operStatus = (BigDecimal) rowData.get(13);
        this.startDate = (Date) rowData.get(14);
        this.endDate = (Date) rowData.get(15);
        this.nextId = (String) rowData.get(16);
        this.oktmo = (String) rowData.get(17);
        this.liveStatus = (BigDecimal) rowData.get(18);
        this.cadNum = (String) rowData.get(19);
        this.divType = (BigDecimal) rowData.get(20);
        this.counter = (BigDecimal) rowData.get(21);
        this.normDoc = (String) rowData.get(22);
    }
}
