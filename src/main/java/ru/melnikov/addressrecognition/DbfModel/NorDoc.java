package ru.melnikov.addressrecognition.DbfModel;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class NorDoc {
    //    NORMDOCID{CHARACTER}  DOCNAME{CHARACTER}  DOCDATE{DATE}  DOCNUM{CHARACTER}  DOCTYPE{LONG}  DOCIMGID{CHARACTER}
    private final String normDocId;
    private final String docName;
    private final Date docDate;
    private final String docNum;
    private final long dockType;
    private final String docImgID;

    public NorDoc(List rowData) {
        this.normDocId = (String) rowData.get(0);
        this.docName = (String) rowData.get(1);
        this.docDate = (Date) rowData.get(2);
        this.docNum = (String) rowData.get(3);
        this.dockType = (int) rowData.get(4);
        this.docImgID = (String) rowData.get(5);
    }
}

