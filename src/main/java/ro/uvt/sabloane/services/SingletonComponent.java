package ro.uvt.sabloane.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {
    public SingletonComponent(){
        System.out.println("SingletonComponent::SingletonComponent = " + this);
    }

    public void operation() {
        System.out.println("Invoked SingletonComponent::operation() om " + this);
    }
}
