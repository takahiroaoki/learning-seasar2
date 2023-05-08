package org.seasar.example.s2container.annotation;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.setConfigPath("org/seasar/example/s2container/annotation/app.dicon");
        SingletonS2ContainerFactory.init();
        S2Container container = SingletonS2ContainerFactory.getContainer();

        IMessageProvider messageProvider = (IMessageProvider) container.getComponent("messageProvider");
        System.out.println(messageProvider.getMessage());

        SingletonS2ContainerFactory.destroy();
    }
}
