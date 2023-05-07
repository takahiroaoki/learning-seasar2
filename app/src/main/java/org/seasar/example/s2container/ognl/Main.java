package org.seasar.example.s2container.ognl;

import java.util.Date;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.setConfigPath("org/seasar/example/s2container/ognl/app.dicon");
        SingletonS2ContainerFactory.init();
        S2Container container = SingletonS2ContainerFactory.getContainer();
        DateFormatter formatter = (DateFormatter) container.getComponent(DateFormatter.class);
        System.out.println(formatter.format(new Date(88888888)));
        SingletonS2ContainerFactory.destroy();
    }
}