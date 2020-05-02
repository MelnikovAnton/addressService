package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class Room {
    //    ROOMID{CHARACTER}  ROOMGUID{CHARACTER}  HOUSEGUID{CHARACTER}  REGIONCODE{CHARACTER}  FLATNUMBER{CHARACTER}  FLATTYPE{NUMERIC}
    private final String roomId;
    private final String roomGuid;
    private final String houseGuid;
    private final String regionCode;
    private final String flatNumber;
    private final BigDecimal flatType;
    //    ROOMNUMBER{CHARACTER}  ROOMTYPE{CHARACTER}  CADNUM{CHARACTER}  ROOMCADNUM{CHARACTER}  POSTALCODE{CHARACTER}  UPDATEDATE{DATE}
    private final String roomNumber;
    private final String roomType;
    private final String cadNum;
    private final String roomCadNum;
    private final String postalCode;
    private final Date updateDate;
    //    PREVID{CHARACTER}  NEXTID{CHARACTER}  OPERSTATUS{NUMERIC}  STARTDATE{DATE}  ENDDATE{DATE}  LIVESTATUS{NUMERIC}  NORMDOC{CHARACTER}
    private final String prevId;
    private final String nextId;
    private final BigDecimal operStatus;
    private final Date startDate;
    private final Date endDate;
    private final BigDecimal liveStatus;
    private final String normDoc;

    public Room(List rowData) {
        this.roomId = (String) rowData.get(0);
        this.roomGuid = (String) rowData.get(1);
        this.houseGuid = (String) rowData.get(2);
        this.regionCode = (String) rowData.get(3);
        this.flatNumber = (String) rowData.get(4);
        this.flatType = (BigDecimal) rowData.get(5);
        this.roomNumber = (String) rowData.get(6);
        this.roomType = (String) rowData.get(7);
        this.cadNum = (String) rowData.get(8);
        this.roomCadNum = (String) rowData.get(9);
        this.postalCode = (String) rowData.get(10);
        this.updateDate = (Date) rowData.get(11);
        this.prevId = (String) rowData.get(12);
        this.nextId = (String) rowData.get(13);
        this.operStatus = (BigDecimal) rowData.get(14);
        this.startDate = (Date) rowData.get(15);
        this.endDate = (Date) rowData.get(16);
        this.liveStatus = (BigDecimal) rowData.get(17);
        this.normDoc = (String) rowData.get(18);
    }
}
