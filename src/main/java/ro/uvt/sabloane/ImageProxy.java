package ro.uvt.sabloane;

public class ImageProxy implements Element,Picture {
    private String url;
    private Dimension dim;
    private Image realImage = null;

    public Image loadImage(){
        if (realImage == null){
            realImage = new Image(url);
        }
        return realImage;
    }

    public ImageProxy(String url){
        this.url = url;
        this.dim = new Dimension(10,10);
    }

    @Override
    public void print() {
        loadImage().print();
    }

    @Override
    public void add(Element element) {
        Element.super.add(element);
    }

    @Override
    public void remove(Element element) {
        Element.super.remove(element);
    }

    @Override
    public Element get(Integer index) {
        return Element.super.get(index);
    }

    @Override
    public String url() {
        return Picture.super.url();
    }

    @Override
    public Dimension dim() {
        return Picture.super.dim();
    }

    @Override
    public ImageContent content() {
        return Picture.super.content();
    }
}
