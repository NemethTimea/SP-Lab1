package ro.uvt.sabloane.laboratory.Lab9.command;

import org.json.JSONArray;
import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab9.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCommand implements Command {
    @Override
    public void execute() {
        try{
            String jsonFileData = new String(Files.readAllBytes(Paths.get("nouJSON.json")));
            JSONObject book = new JSONObject(jsonFileData);
            Book newBook = new Book(book.getString("Title"));
            JSONArray authors = book.getJSONArray("Authors");
            for(int i = 0; i < authors.length(); i++){
                JSONObject author = authors.getJSONObject(i);
                newBook.addAuthor(new Author(author.getString("Name")));
            }
            JSONArray elements = book.getJSONArray("Elements");
            for(int i = 0; i < elements.length(); i++){
                JSONObject element = elements.getJSONObject(i);
                if (element.has("Paragraph")){
                    newBook.add(new Paragraph(element.getString("Paragraph")));
                } else if (element.has("ImageProxyURL")) {
                    newBook.add(new ImageProxy(element.getString("ImageProxyURL")));
                }else if (element.has("TOC")){
                    newBook.add(new TOC(element.getString("TOC")));
                } else if (element.has("Image")){
                    newBook.add(new Image(element.getString("Image")));
                } else if (element.has("Table_Name")){
                    String table = element.getString("Table_Name");
                    newBook.add(new Table(table));
                }
            }
            DocumentManager.getDocumentmanager().setBook(newBook);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
