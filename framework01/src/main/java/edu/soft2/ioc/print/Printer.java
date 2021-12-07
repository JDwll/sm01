package edu.soft2.ioc.print;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Data
public class Printer {
    private Ink ink;
    private Paper paper;
    public Ink getInk() {
        return ink;
    }
//    @Autowired
//    @Qualifier("colorInk")
    @Resource(name = "colorInk")
    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }
//    @Autowired
//    @Qualifier("b5Paper")
    @Resource(name = "b5Paper")
    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("用"+ink.getType()+"墨盒打印一张"+paper.getSize()+"纸上面！");
    }
}
