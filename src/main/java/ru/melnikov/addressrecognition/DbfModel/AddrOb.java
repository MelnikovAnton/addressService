package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class AddrOb {

    final BigDecimal actStatus;
    final String aoGUID;
    final String aoID;
    final BigDecimal aoLevel;
    final String areaCode;
    //    AUTOCODE{CHARACTER}  CENTSTATUS{NUMERIC}  CITYCODE{CHARACTER}  CODE{CHARACTER}  CURRSTATUS{NUMERIC}
    final String autoCode;
    final BigDecimal centStatus;
    final String cityCode;
    final String code;
    final BigDecimal currStatus;
    //    ENDDATE{DATE}  FORMALNAME{CHARACTER}  IFNSFL{CHARACTER}  IFNSUL{CHARACTER}  NEXTID{CHARACTER}
    final Date endDate;
    final String formalName;
    final String ifnsFl;
    final String ifnsUl;
    final String nextId;
    //    OFFNAME{CHARACTER}  OKATO{CHARACTER}  OKTMO{CHARACTER}  OPERSTATUS{NUMERIC}  PARENTGUID{CHARACTER}
    final String offName;
    final String okato;
    final String oktmo;
    final BigDecimal operStatus;
    final String parentGUID;
    //    PLACECODE{CHARACTER}  PLAINCODE{CHARACTER}  POSTALCODE{CHARACTER}  PREVID{CHARACTER}  REGIONCODE{CHARACTER}
    final String placeCode;
    final String plainCode;
    final String postalCode;
    final String prevId;
    final String regionCode;
    //    SHORTNAME{CHARACTER}  STARTDATE{DATE}  STREETCODE{CHARACTER}  TERRIFNSFL{CHARACTER}  TERRIFNSUL{CHARACTER}
    final String shortName;
    final Date startDate;
    final String streetCode;
    final String terIfnsFl;
    final String terIfnsUl;
    //    UPDATEDATE{DATE}  CTARCODE{CHARACTER}  EXTRCODE{CHARACTER}  SEXTCODE{CHARACTER}  LIVESTATUS{NUMERIC}
    final Date updateDate;
    final String ctarCode;
    final String extrCode;
    final String sextCode;
    final BigDecimal liveStatus;
    //    NORMDOC{CHARACTER}  PLANCODE{CHARACTER}  CADNUM{CHARACTER}  DIVTYPE{NUMERIC}
    final String normDoc;
    final String planCode;
    final String cadNum;
    final BigDecimal divType;
    //    ACTSTATUS{NUMERIC}  AOGUID{CHARACTER}  AOID{CHARACTER}  AOLEVEL{NUMERIC}  AREACODE{CHARACTER}
    @Id
    String id;


    public AddrOb(List rowData) {
        this.actStatus = (BigDecimal) rowData.get(0);
        this.aoGUID = (String) rowData.get(1);
        this.aoID = (String) rowData.get(2);
        this.aoLevel = (BigDecimal) rowData.get(3);
        this.areaCode = (String) rowData.get(4);
        this.autoCode = (String) rowData.get(5);
        this.centStatus = (BigDecimal) rowData.get(6);
        this.cityCode = (String) rowData.get(7);
        this.code = (String) rowData.get(8);
        this.currStatus = (BigDecimal) rowData.get(9);
        this.endDate = (Date) rowData.get(10);
        this.formalName = (String) rowData.get(11);
        this.ifnsFl = (String) rowData.get(12);
        this.ifnsUl = (String) rowData.get(13);
        this.nextId = (String) rowData.get(14);
        this.offName = (String) rowData.get(15);
        this.okato = (String) rowData.get(16);
        this.oktmo = (String) rowData.get(17);
        this.operStatus = (BigDecimal) rowData.get(18);
        this.parentGUID = (String) rowData.get(19);
        this.placeCode = (String) rowData.get(20);
        this.plainCode = (String) rowData.get(21);
        this.postalCode = (String) rowData.get(22);
        this.prevId = (String) rowData.get(23);
        this.regionCode = (String) rowData.get(24);
        this.shortName = (String) rowData.get(25);
        this.startDate = (Date) rowData.get(26);
        this.streetCode = rowData.get(27).toString();
        this.terIfnsFl = (String) rowData.get(28);
        this.terIfnsUl = (String) rowData.get(29);
        this.updateDate = (Date) rowData.get(30);
        this.ctarCode = rowData.get(31).toString();
        this.extrCode = (String) rowData.get(32);
        this.sextCode = (String) rowData.get(33);
        this.liveStatus = (BigDecimal) rowData.get(34);
        this.normDoc = (String) rowData.get(35);
        this.planCode = (String) rowData.get(36);
        this.cadNum = (String) rowData.get(37);
        this.divType = (BigDecimal) rowData.get(38);
    }
}
