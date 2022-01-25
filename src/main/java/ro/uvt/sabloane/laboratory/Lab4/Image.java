package ro.uvt.sabloane.laboratory.Lab4;

public class Image implements Element, Picture {
    private String url;
    private ImageContent content = null;

    public Image(String url) {
        this.url = url;
    }
    @Override
    public ImageContent content(){
        return content;
    }
    public String getImgUrl(){
        return this.url;
    }
    @Override
    public void print() {
        System.out.println(this.url);
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String newImgName){
        this.url = newImgName;
    }
}
