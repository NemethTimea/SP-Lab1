package ro.uvt.sabloane.services;

import lombok.Value;
import org.json.JSONObject;
import ro.uvt.sabloane.models.Visitee;
import ro.uvt.sabloane.models.Visitor;

import java.io.FileWriter;
import java.io.IOException;

public class JSONFileExporter{
    String fileName;
    BookSaveVisitor visitor;

    public JSONFileExporter(String fn, BookSaveVisitor v){
        fileName = fn;
        visitor = v;
    }

    public void exportToJSON(Visitee v){
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(v.accept(visitor).toString(4));
            fileWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
