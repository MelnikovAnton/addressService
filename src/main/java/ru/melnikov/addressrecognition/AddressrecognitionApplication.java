package ru.melnikov.addressrecognition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.melnikov.addressrecognition.DbfModel.*;
import ru.melnikov.addressrecognition.services.impl.DBFServiceImpl;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class AddressrecognitionApplication {

    public static void main(String[] args) throws NoSuchMethodException {
        SpringApplication.run(AddressrecognitionApplication.class, args);

        DBFServiceImpl<ActStat> service = new DBFServiceImpl<ActStat>(ActStat.class);

        System.out.println("ACTSTAT.dbf");
        InputStream path = AddressrecognitionApplication.class.getClassLoader()
                .getResourceAsStream("base/ACTSTAT.DBF");
        List<ActStat> actStats = service.readFromFile(path);
        DBFType type = service.getFileType(path);
        System.out.println(type.getClazz());
        System.out.println(actStats);
        actStats.clear();

        System.out.println("ADDROB77.DBF");
        DBFServiceImpl<AddrOb> addrObDBFService = new DBFServiceImpl<AddrOb>(AddrOb.class);
        List<AddrOb> addrOb = addrObDBFService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/ADDROB77.DBF"));

        System.out.println(addrOb.size());
        addrOb.clear();

        System.out.println("CENTERST.DBF");
        DBFServiceImpl<CenterSt> centerStService = new DBFServiceImpl<CenterSt>(CenterSt.class);
        List<CenterSt> centrSt = centerStService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/CENTERST.DBF"));

        System.out.println(centrSt);
        centrSt.clear();

        System.out.println("CURENTST.DBF");
        DBFServiceImpl<CenterSt> curentStService = new DBFServiceImpl<CenterSt>(CenterSt.class);
        List<CenterSt> curentSt = curentStService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/CURENTST.DBF"));

        System.out.println(curentSt.size());
        curentSt.clear();

        System.out.println("ESTSTAT.DBF");
        DBFServiceImpl<EstStat> estStatService = new DBFServiceImpl<EstStat>(EstStat.class);
        List<EstStat> estStat = estStatService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/ESTSTAT.DBF"));

        System.out.println(estStat);
        estStat.clear();

        System.out.println("FLATTYPE.DBF");
        DBFServiceImpl<FlatType> flatTypeService = new DBFServiceImpl<FlatType>(FlatType.class);
        List<FlatType> flatTypes = flatTypeService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/FLATTYPE.DBF"));

        System.out.println(flatTypes);
        flatTypes.clear();

        System.out.println("HOUSE77.DBF");
        DBFServiceImpl<House> houseService = new DBFServiceImpl<House>(House.class);
        List<House> houses = houseService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/HOUSE77.DBF"));

        System.out.println(houses.size());
        houses.clear();

        System.out.println("NORDOC77.DBF");
        DBFServiceImpl<NorDoc> norDocService = new DBFServiceImpl<NorDoc>(NorDoc.class);
        List<NorDoc> norDoc = norDocService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/NORDOC77.DBF"));

        System.out.println(norDoc.size());
        norDoc.clear();

        System.out.println("ROOM77.DBF");
        DBFServiceImpl<Room> roomService = new DBFServiceImpl<Room>(Room.class);
        List<Room> rooms = roomService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/ROOM77.DBF"));

        System.out.println(rooms.size());
        rooms.clear();

        System.out.println("SOCRBASE.DBF");
        DBFServiceImpl<SocrBase> socrBaseService = new DBFServiceImpl<SocrBase>(SocrBase.class);
        List<SocrBase> socrBase = socrBaseService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/SOCRBASE.DBF"));

        System.out.println(socrBase);
        socrBase.clear();

        System.out.println("STEAD77.DBF");
        DBFServiceImpl<Stead> steadService = new DBFServiceImpl<Stead>(Stead.class);
        List<Stead> steads = steadService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/STEAD77.DBF"));

        System.out.println(steads.size());
        steads.clear();


        System.out.println("STRSTAT.DBF");
        DBFServiceImpl<StrStat> strStatService = new DBFServiceImpl<StrStat>(StrStat.class);
        List<StrStat> strStats = strStatService.readFromFile(
                AddressrecognitionApplication.class.getClassLoader()
                        .getResourceAsStream("base/STRSTAT.DBF"));

        System.out.println(strStats);


    }

}
