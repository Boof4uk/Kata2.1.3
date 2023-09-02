import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
//        System.out.println(bean.getMessage());

        Cat catOne = (Cat) applicationContext.getBean("cat");
        Cat catTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(bean == bean2);
        System.out.println(catOne == catTwo);
        System.out.println(catOne);
        System.out.println(catTwo);
    }
}