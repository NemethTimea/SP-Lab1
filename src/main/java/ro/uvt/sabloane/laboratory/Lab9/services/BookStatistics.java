package ro.uvt.sabloane.laboratory.Lab9.services;

import ro.uvt.sabloane.laboratory.Lab9.models.*;

import java.util.HashMap;
import java.util.Map;

public class BookStatistics implements Visitor<Void> {
    Map<String,Integer> statistics_map = new HashMap<>();

    public void printStatistics(){
        for (String key: statistics_map.keySet()){
            System.out.println(key + " - " + statistics_map.get(key));
        }
    }

    @Override
    public Void visitBook(Book book) {
        if (statistics_map.containsKey("book")){
            statistics_map.put("book", statistics_map.get("book") + 1);
        }else{
            statistics_map.put("book",1);
        }
        for (Author a : book.getAuthors()){
            a.accept(this);
        }
        for (Element e : book.getElementList()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitAuthor(Author author) {
        if (statistics_map.containsKey("author")){
            statistics_map.put("author", statistics_map.get("author") + 1);
        }else{
            statistics_map.put("author",1);
        }
        return null;
    }

    @Override
    public Void visitSection(Section section) {
        if (statistics_map.containsKey("section")){
            statistics_map.put("section", statistics_map.get("section") + 1);
        }else{
            statistics_map.put("section",1);
        }
        for (Element e : section.getElementList()){
            ((Visitee)e).accept(this);
        }
        return null;
    }

    @Override
    public Void visitTOC(TOC tableofcontents) {
        if (statistics_map.containsKey("tableofcontents")){
            statistics_map.put("tableofcontents", statistics_map.get("tableofcontents") + 1);
        }else{
            statistics_map.put("tableofcontents",1);
        }
        return null;
    }

    @Override
    public Void visitParagraph(Paragraph paragraph) {
        if (statistics_map.containsKey("paragraph")){
            statistics_map.put("paragraph", statistics_map.get("paragraph") + 1);
        }else{
            statistics_map.put("paragraph",1);
        }
        return null;
    }

    @Override
    public Void visitImageProxy(ImageProxy imageproxy) {
        if (statistics_map.containsKey("imageproxy")){
            statistics_map.put("imageproxy", statistics_map.get("imageproxy") + 1);
        }else{
            statistics_map.put("imageproxy",1);
        }
        return null;
    }

    @Override
    public Void visitImage(Image image) {
        if (statistics_map.containsKey("image")){
            statistics_map.put("image", statistics_map.get("image") + 1);
        }else{
            statistics_map.put("image",1);
        }
        return null;
    }

    @Override
    public Void visitTable(Table table) {
        if (statistics_map.containsKey("table")){
            statistics_map.put("table", statistics_map.get("table") + 1);
        }else{
            statistics_map.put("table",1);
        }
        return null;
    }
}
