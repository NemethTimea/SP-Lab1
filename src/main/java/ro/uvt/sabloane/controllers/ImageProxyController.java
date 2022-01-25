package ro.uvt.sabloane.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.uvt.sabloane.models.Author;
import ro.uvt.sabloane.models.ImageProxy;
import ro.uvt.sabloane.repositories.ImageProxyRepository;

import java.util.List;

@RestController
@RequestMapping("/imageproxys")
public class ImageProxyController {

    private final ImageProxyRepository imageproxyrepo;

    @Autowired
    public ImageProxyController(ImageProxyRepository imageproxyrepo) {
        this.imageproxyrepo = imageproxyrepo;
    }

    @GetMapping("/getImageProxy")
    public ResponseEntity<List<ImageProxy>> getImageProxy() {
        List<ImageProxy> imageproxies = null;
        imageproxies = imageproxyrepo.findAll();
        return new ResponseEntity<List<ImageProxy>>(imageproxies, HttpStatus.OK);
    }

    @PostMapping("/addImageProxy")
    public ResponseEntity<ImageProxy> addImageProxy(@RequestBody ImageProxy imageProxy) {
        ImageProxy imageProxy1 = null;

        try {
            imageProxy1 = imageproxyrepo.save(imageProxy);
        } catch (Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<ImageProxy>(imageProxy1, HttpStatus.OK);
    }
    @GetMapping("/error")
    public String error(){
        return "Error from ImageProxyController!";
    }
}
