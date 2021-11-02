package ro.uvt.sabloane;

import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture{
    private String url;
    private ImageContent content = null;

    public ImageContent content(){
        if (content == null){
            content = ImageLoaderFactory.create(url).load(url);
        }
        return content;
    }
    Image(String url) {
        this.url = url;
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
    public void print(){
        content().print();
    }
}