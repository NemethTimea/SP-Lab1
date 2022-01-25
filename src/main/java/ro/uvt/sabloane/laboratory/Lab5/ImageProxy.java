package ro.uvt.sabloane.laboratory.Lab5;

public class ImageProxy implements Element {
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
    public void print() {
        System.out.println(this.url);
    }
}
