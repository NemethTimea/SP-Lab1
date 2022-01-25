package ro.uvt.sabloane.laboratory.Lab3;

public class Image implements Element {
    String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println(this.url);
    }
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String newUrl){
        this.url = newUrl;
    }
}
