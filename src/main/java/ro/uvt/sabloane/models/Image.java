package ro.uvt.sabloane.models;

import ro.uvt.sabloane.services.ImageLoaderFactory;

public class Image implements Element, Picture, Visitee{
    private String url;
    private ImageContent content = null;

    public ImageContent content(){
        return content;
    }
    public Image(String url) {
        this.url = url;
        content = ImageLoaderFactory.create(url).load(url);
    }

    public void accept(Visitor visitor){
        visitor.visitImage(this);
    }
}