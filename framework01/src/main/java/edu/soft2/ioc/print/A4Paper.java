package edu.soft2.ioc.print;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("a4Paper")
@Component
public class A4Paper extends Paper{
    @Override
    @Value("A4规格")
    public void setSize(String size) {
        super.setSize(size);
    }
}
