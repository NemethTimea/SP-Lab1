package ro.uvt.sabloane.laboratory.Lab6_7.models;

import org.json.JSONObject;
import ro.uvt.sabloane.laboratory.Lab6_7.services.BookSaveVisitor;

public class ImageProxy implements Element,Picture,Visitee {
    private String url;

    private Image realImage = null;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String newUrl){ this.url = newUrl; }

    @Override
    public void accept(Visitor visitor){
        visitor.visitImageProxy(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitImageProxy(this);
    }
}
