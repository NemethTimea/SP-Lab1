package ro.uvt.sabloane;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BMPImageLoader implements ImageLoader{
    public ImageContent load(String url){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(url));
            System.out.println("BMP image loading succeeded!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ImageContent(image);
    }
}
