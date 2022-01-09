package ro.uvt.sabloane.commands;

import org.json.JSONArray;
import org.json.JSONObject;
import ro.uvt.sabloane.models.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OpenCommand implements Command{
    @Override
    public void execute() {
        try{
            String jsonFileData = new String(Files.readAllBytes(Paths.get("test.json")));
            JSONObject book = new JSONObject(jsonFileData);
            Book newBook = new Book(book.getString("title"));
            JSONArray authors = book.getJSONArray("authors");
            for(int i = 0; i < authors.length(); i++){
                JSONObject author = authors.getJSONObject(i).getJSONObject("author");
                newBook.addAuthor(new Author(author.getString("firstname"), author.getString("lastname")));
            }
            JSONArray elements = book.getJSONArray("elements");
            for(int i = 0; i < elements.length(); i++){
                JSONObject element = elements.getJSONObject(i);
                if (element.has("paragraph")){
                    newBook.add(new Paragraph(element.getString("paragraph")));
                } else if (element.has("image-proxy")){
                    newBook.add(new ImageProxy(element.getJSONObject("image-proxy").getString("url")));
                } else if (element.has("image")){
                    newBook.add(new Image(element.getJSONObject("image").getString("url")));
                } else if (element.has("table")){
                    JSONObject table = element.getJSONObject("table");
                    newBook.add(new Table("Tabloul fenomenal"));
                }
            }
            DocumentManager.setBook(newBook);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
