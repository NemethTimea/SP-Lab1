package ro.uvt.sabloane;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String imageName;
    private String url;
    private ImageContent content;

    public ImageContent content(){
        return content;
    }
    Image(String name) {
        imageName = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void print(){
        System.out.println("Image with name: " + this.imageName);
    }
}