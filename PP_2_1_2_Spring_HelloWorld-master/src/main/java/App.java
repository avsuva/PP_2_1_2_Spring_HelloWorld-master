import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);


        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("HelloWorld" + " — " + bean1.equals(bean2));

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        Cat bean4 =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Cat" + " — " + bean3.equals(bean4));







    }
}