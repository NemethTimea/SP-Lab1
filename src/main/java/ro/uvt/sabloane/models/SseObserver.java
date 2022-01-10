package ro.uvt.sabloane.models;

import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.io.IOException;

public class SseObserver implements Observer{

    private final SseEmitter emitter;

    public SseObserver(SseEmitter emitter) {
        this.emitter = emitter;
    }

    @Override
    public void update(Book book)  {
        try {
            emitter.send(book, MediaType.APPLICATION_JSON);
        }catch (Exception ex) {
            System.out.println(ex);
        }
    }
}