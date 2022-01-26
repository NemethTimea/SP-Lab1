package ro.uvt.sabloane.laboratory.Lab9.services;

public class ImageLoaderFactory {
    public static ImageLoader create(String imagePath){
        if (imagePath.endsWith("jpg") || imagePath.endsWith("jpeg")){
            return new JPGImageLoader();
        } else if (imagePath.endsWith("bmp")){
            return new BMPImageLoader();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}
