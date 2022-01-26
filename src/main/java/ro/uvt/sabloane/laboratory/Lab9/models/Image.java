package ro.uvt.sabloane.laboratory.Lab9.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab9.services.BookSaveVisitor;

public class Image implements Element, Picture, Visitee {
    private String url;
    private ImageContent content = null;

    public Image(String url) {
        this.url = url;
    }
    @Override
    public ImageContent content(){
        return content;
    }
    public String getImgUrl(){
        return this.url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String newImgName){
        this.url = newImgName;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitImage(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitImage(this);
    }
}
