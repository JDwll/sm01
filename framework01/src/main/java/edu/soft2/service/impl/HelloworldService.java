package edu.soft2.service.impl;

import edu.soft2.service.IHelloworldService;
import org.springframework.stereotype.Component;

@Component
public class HelloworldService implements IHelloworldService {
    @Override
    public void sayHello(){
        System.out.println("你好！hello");
    }
    public void sayHi(){System.out.println("Hi");}
}
