package com.borovyksv.mongo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DocumentAdapter {
    public DocumentAdapter() {
    }

    public static Document getDocumentFromMap(String fileName, Map<Integer, String> textPages) {
        Document document = new Document();
        List<Page> pageList = new ArrayList<>();


        String cuttedFileName = fileName.substring(0, fileName.lastIndexOf('.'));
        document.setName(cuttedFileName);

        for (Map.Entry<Integer, String> entry : textPages.entrySet()) {
            Page page = new Page();
            page.setId(entry.getKey());
            page.setText(entry.getValue());
            pageList.add(page);
        }

        document.setPages(pageList);
        return document;
    }

}