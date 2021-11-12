package ro.uvt.sabloane.services;

import org.json.JSONArray;
import org.json.JSONObject;
import ro.uvt.sabloane.models.*;

public class BookSaveVisitor implements Visitor<JSONObject> {

    @Override
    public JSONObject visitBook(Book b) {
        JSONObject book = new JSONObject();
        book.put("Title", b.getTitle());
        JSONArray authors = new JSONArray();
        JSONArray elements = new JSONArray();
        for (Author a: b.getAuthors()){
            authors.put(authors.length(), a.accept(this));
        }
        for (Element e: b.getElements()){
            elements.put(elements.length(), ((Visitee)e).accept(this));
        }
        book.put("Authors",authors);
        book.put("Elements",elements);
        return book;
    }

    @Override
    public JSONObject visitAuthor(Author a) {
        JSONObject author = new JSONObject();
        author.put("Name", a.getName());
        author.put("Surname", a.getSurname());
        return author;
    }

    @Override
    public JSONObject visitSection(Section s) {
        JSONObject section = new JSONObject();
        JSONObject atributes = new JSONObject();
        JSONArray elements = new JSONArray();
        atributes.put("Title",s.getTitle());
        for (Element e: s.getElements()){
            elements.put(elements.length(), ((Visitee)e).accept(this));
        }
        atributes.put("Elements",elements);
        section.put("Section",atributes);
        return section;
    }

    @Override
    public JSONObject visitTableOfContents(TableOfContents tableofcontents) {
        return new JSONObject();
    }

    @Override
    public JSONObject visitParagraph(Paragraph p) {
        JSONObject paragraph = new JSONObject();
        paragraph.put("Paragraph:", p.getText());
        return paragraph;
    }

    @Override
    public JSONObject visitImageProxy(ImageProxy ip) {
        JSONObject imgproxy = new JSONObject();
        imgproxy.put("ImageProxyURL:",ip.getUrl());
        return imgproxy;
    }

    @Override
    public JSONObject visitImage(Image i) {
        JSONObject img = new JSONObject();
        img.put("ImageProxyURL",i.getImgUrl());
        return img;
    }

    @Override
    public JSONObject visitTable(Table t) {
        JSONObject table = new JSONObject();
        table.put("Table_Name",t.getName());
        return table;
    }
}
