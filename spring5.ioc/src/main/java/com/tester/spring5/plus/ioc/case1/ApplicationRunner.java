package com.tester.spring5.plus.ioc.case1;

import com.tester.spring5.plus.ioc.IOCConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(IOCConfig.class);


        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = Boolean.logicalXor(b1, b2);
        System.out.println(b3);


        for (int i = 1; i <= 10; i++) {
            System.out.println("Item :" + i + "\n\n");
            System.out.println("===========================================");
            Vehicle jeep = applicationContext.getBean("jeep", Vehicle.class);
            System.out.println("I have " + jeep.getWhiles() + " Wheeler (" + jeep.getWhilesManufactures() + ") " + jeep.getModel() + " Which is " + jeep.getColor() + " Color." + " That have the " + jeep.getEngineName() + ".");
            System.out.println("===========================================");

            Vehicle vehicle = applicationContext.getBean("mustang", Vehicle.class);
            System.out.println("I have " + vehicle.getWhiles() + " Wheeler (" + vehicle.getWhilesManufactures() + ") " + vehicle.getModel() + " Which is " + vehicle.getColor() + " Color." + " That have the " + vehicle.getEngineName() + ".");
            System.out.println("===========================================");
        }

    }

}
