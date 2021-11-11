package ro.uvt.sabloane.models;

public class ImageProxy implements Element,Picture,Visitee {
    private String url;
    private Dimension dim;
    private Image realImage = null;

    public Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    public ImageProxy(String url) {
        this.url = url;
        this.dim = new Dimension(10, 10);
    }

    public void accept(Visitor visitor){
        visitor.visitImageProxy(this);
    }
}