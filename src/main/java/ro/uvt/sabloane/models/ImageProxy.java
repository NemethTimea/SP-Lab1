package ro.uvt.sabloane.models;

import org.json.JSONObject;
import ro.uvt.sabloane.services.BookSaveVisitor;

import javax.persistence.*;

@Entity
public class ImageProxy implements Element,Picture,Visitee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String url;

    @Transient
    private Image realImage = null;

    public ImageProxy(int id, String url) {
        this.id = id;
        this.url = url;
    }

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }
    public int getID(){ return this.id; }

    public String getUrl(){
        return this.url;
    }

    public void setUrl(String newUrl){ this.url = newUrl; }

    public ImageProxy(String url) {
        this.url = url;
    }
    @Override
    public void accept(Visitor visitor){
        visitor.visitImageProxy(this);
    }
    @Override
    public JSONObject accept(BookSaveVisitor visitor){
        return visitor.visitImageProxy(this);
    }
}