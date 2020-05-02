package ru.melnikov.addressrecognition.services;

import ru.melnikov.addressrecognition.DbfModel.DBFType;

import java.io.InputStream;
import java.util.List;

public interface DBFService<T> {
    List<T> readFromFile(InputStream path);

    DBFType getFileType(InputStream path);
}
