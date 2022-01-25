package ro.uvt.sabloane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.sabloane.models.*;
import ro.uvt.sabloane.services.ClientComponent;
import ro.uvt.sabloane.services.SingletonComponent;
import ro.uvt.sabloane.services.TransientComponent;

@SpringBootApplication
public class MAIN {
        public static void main(String[] args) throws Exception {

                ApplicationContext context = SpringApplication.run(MAIN.class, args);

//                TransientComponent transientBean = context.getBean(TransientComponent.class);
//                transientBean.operation();
//
//                transientBean = context.getBean(TransientComponent.class);
//                transientBean.operation();
//
//                SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
//                singletonBean.operation();
//
//                singletonBean = context.getBean(SingletonComponent.class);
//                singletonBean.operation();
//
//                ClientComponent clientBean = context.getBean(ClientComponent.class);
//                clientBean.operation();
//
//                clientBean = (ClientComponent) context.getBean("clientComponent");
//                clientBean.operation();
        }
}