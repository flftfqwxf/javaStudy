package com.example;
import com.order.OrderCheck;
import com.order.OrderOfInitialization;
import com.InitialValues;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

class OrderExpand extends OrderOfInitialization {
    public static void main(String[] args) {
        InitialValues initialValues=new InitialValues();
      //  initialValues.friendPack();
//        OrderExpand orderExpand = new OrderExpand();
//        orderExpand.orderOut();

    }

//   protected void orderOut() {
//        System.out.println("extend orderOut");
//        super.orderOut();
//    }
}

@SpringBootApplication
public class DemoApplication {

    void outString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        OrderOfInitialization order = new OrderOfInitialization();
        System.out.println("run");
        DemoApplication demoApplication = new DemoApplication();
        demoApplication.outString("outString");
        OrderExpand orderExpand=new OrderExpand();
        //orderExpand.orderOut();
        OrderCheck orderCheck=new OrderCheck();

    }
}
