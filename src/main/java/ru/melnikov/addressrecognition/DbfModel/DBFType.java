package ru.melnikov.addressrecognition.DbfModel;

import lombok.Getter;

import java.util.List;

@Getter
public enum DBFType {
    ActStatType(ActStat.class), AddrObType(AddrOb.class), CenterStType(CenterSt.class),
    CurrentStType(CurentSt.class), EstStatType(EstStat.class), FlatTypeType(FlatType.class),
    HouseType(House.class), NorDocType(NorDoc.class), RoomType(Room.class),
    SocrBaseType(SocrBase.class), SteadType(Stead.class), StrStatType(StrStat.class);


    private static final List<String> ACT_STAT_FIELDS = List.of("ACTSTATID", "NAME");
    private static final List<String> ADDR_OB_FIELDS = List.of("ACTSTATUS", "AOGUID", "AOID", "AOLEVEL", "AREACODE", "AUTOCODE", "CENTSTATUS", "CITYCODE", "CODE", "CURRSTATUS", "ENDDATE", "FORMALNAME", "IFNSFL", "IFNSUL", "NEXTID", "OFFNAME", "OKATO", "OKTMO", "OPERSTATUS", "PARENTGUID", "PLACECODE", "PLAINCODE", "POSTALCODE", "PREVID", "REGIONCODE", "SHORTNAME", "STARTDATE", "STREETCODE", "TERRIFNSFL", "TERRIFNSUL", "UPDATEDATE", "CTARCODE", "EXTRCODE", "SEXTCODE", "LIVESTATUS", "NORMDOC", "PLANCODE", "CADNUM", "DIVTYPE");
    private static final List<String> CENTER_ST_FIELDS = List.of("CENTERSTID", "NAME");
    private static final List<String> CURRENT_ST_FIELDS = List.of("CURENTSTID", "NAME");
    private static final List<String> EST_STAT_FIELDS = List.of("ESTSTATID", "NAME", "SHORTNAME");
    private static final List<String> FLAT_TYPE_FIELDS = List.of("FLTYPEID", "NAME", "SHORTNAME");
    private static final List<String> HOUSE_FIELDS = List.of("AOGUID", "BUILDNUM", "ENDDATE", "ESTSTATUS", "HOUSEGUID", "HOUSEID", "HOUSENUM", "STATSTATUS", "IFNSFL", "IFNSUL", "OKATO", "OKTMO", "POSTALCODE", "STARTDATE", "STRUCNUM", "STRSTATUS", "TERRIFNSFL", "TERRIFNSUL", "UPDATEDATE", "NORMDOC", "COUNTER", "CADNUM", "DIVTYPE");
    private static final List<String> NOR_DOC_FIELDS = List.of("NORMDOCID", "DOCNAME", "DOCDATE", "DOCNUM", "DOCTYPE", "DOCIMGID");
    private static final List<String> ROOM_FIELDS = List.of("ROOMID", "ROOMGUID", "HOUSEGUID", "REGIONCODE", "FLATNUMBER", "FLATTYPE", "ROOMNUMBER", "ROOMTYPE", "CADNUM", "ROOMCADNUM", "POSTALCODE", "UPDATEDATE", "PREVID", "NEXTID", "OPERSTATUS", "STARTDATE", "ENDDATE", "LIVESTATUS", "NORMDOC");
    private static final List<String> SOCR_BASE_FIELDS = List.of("LEVEL", "SOCRNAME", "SCNAME", "KOD_T_ST");
    private static final List<String> STEAD_FIELDS = List.of("STEADGUID", "NUMBER", "REGIONCODE", "POSTALCODE", "IFNSFL", "TERRIFNSFL", "IFNSUL", "TERRIFNSUL", "OKATO", "UPDATEDATE", "PARENTGUID", "STEADID", "PREVID", "OPERSTATUS", "STARTDATE", "ENDDATE", "NEXTID", "OKTMO", "LIVESTATUS", "CADNUM", "DIVTYPE", "COUNTER", "NORMDOC");
    private static final List<String> STR_STAT_FIELDS = List.of("STRSTATID", "NAME", "SHORTNAME");

    private final Class clazz;


    DBFType(Class clazz) {
        this.clazz = clazz;
    }

    public static DBFType findByFields(List<String> fields) {
        if (fields.containsAll(ACT_STAT_FIELDS)) return ActStatType;
        if (fields.containsAll(ADDR_OB_FIELDS)) return AddrObType;
        if (fields.containsAll(CENTER_ST_FIELDS)) return CenterStType;
        if (fields.containsAll(CURRENT_ST_FIELDS)) return CurrentStType;
        if (fields.containsAll(EST_STAT_FIELDS)) return EstStatType;
        if (fields.containsAll(FLAT_TYPE_FIELDS)) return FlatTypeType;
        if (fields.containsAll(HOUSE_FIELDS)) return HouseType;
        if (fields.containsAll(NOR_DOC_FIELDS)) return NorDocType;
        if (fields.containsAll(ROOM_FIELDS)) return RoomType;
        if (fields.containsAll(SOCR_BASE_FIELDS)) return SocrBaseType;
        if (fields.containsAll(STEAD_FIELDS)) return SteadType;
        if (fields.containsAll(STR_STAT_FIELDS)) return StrStatType;

        throw new RuntimeException("Unknown DBF Types");
    }

}
