package ru.melnikov.addressrecognition.services.impl;

import com.linuxense.javadbf.DBFException;
import com.linuxense.javadbf.DBFField;
import com.linuxense.javadbf.DBFReader;
import com.linuxense.javadbf.DBFUtils;
import lombok.extern.slf4j.Slf4j;
import ru.melnikov.addressrecognition.DbfModel.DBFType;
import ru.melnikov.addressrecognition.services.DBFService;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class DBFServiceImpl<T> implements DBFService<T> {

    private final List<T> result = new ArrayList<>();
    private final Class<T> clazz;
    private final Constructor<T> constructor;

    public DBFServiceImpl(Class<T> clazz) throws NoSuchMethodException {
        this.clazz = clazz;
        this.constructor = clazz.getConstructor(List.class);
        log.info("find constructor {} for class {}", constructor.getName(), clazz.getCanonicalName());
    }

    @Override
    public List<T> readFromFile(InputStream path) {
        DBFReader reader = null;
        List<T> result = new ArrayList<>();
        try {

            // create a DBFReader object
            reader = new DBFReader(path);

//            reader.setCharactersetName("CP866");


            // get the field count if you want for some reasons like the following

            int numberOfFields = reader.getFieldCount();

            // use this count to fetch all field information
            // if required

            for (int i = 0; i < numberOfFields; i++) {

                DBFField field = reader.getField(i);

                // do something with it if you want
                // refer the JavaDoc API reference for more details
                //
                System.out.print(" \"" + field.getName() + "\",");
            }
            System.out.println();
            // Now, lets us start reading the rows

            Object[] rowObjects;
            int limit = 0;
            while ((rowObjects = reader.nextRecord()) != null) {
                T obj = constructor.newInstance(Arrays.asList(rowObjects));
                result.add(obj);

//                result.add(clazz.getConstructor(Object[].class).newInstance(rowObjects));
//                    for (int i = 0; i < rowObjects.length; i++) {
//                        System.out.print(" |" + rowObjects[i] + "| ");
//                    }
//                limit++;
//                System.out.println();
            }

            // By now, we have iterated through all of the rows

        } catch (DBFException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            DBFUtils.close(reader);
        }
        return result;
    }

    @Override
    public DBFType getFileType(InputStream path) {

        List<String> fields = new ArrayList<>();


            // create a DBFReader object
            DBFReader reader = new DBFReader(path);

//            reader.setCharactersetName("CP866");


            // get the field count if you want for some reasons like the following

            int numberOfFields = reader.getFieldCount();




            for (int i = 0; i < numberOfFields; i++) {

                DBFField field = reader.getField(i);

                // do something with it if you want
                // refer the JavaDoc API reference for more details
                //
               fields.add(field.getName());
            }



        return DBFType.findByFields(fields);
    }


}
