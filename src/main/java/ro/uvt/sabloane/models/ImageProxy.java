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
    private Dimension dim;

    @Transient
    private Image realImage = null;

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }
    public String getUrl(){
        return this.url;
    }
    public ImageProxy(String url) {
        this.url = url;
        this.dim = new Dimension(10, 10);
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