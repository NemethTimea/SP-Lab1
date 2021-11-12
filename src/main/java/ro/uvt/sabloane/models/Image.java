package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;
import ro.uvt.sabloane.services.ImageLoaderFactory;

public class Image implements Element, Picture, Visitee{
    private String url;
    private ImageContent content = null;

    public ImageContent content(){
        return content;
    }
    public String getImgUrl(){
        return this.url;
    }

    public Image(String url) {
        this.url = url;
        content = ImageLoaderFactory.create(url).load(url);
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