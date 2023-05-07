package org.seasar.example.s2container.helloworld;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.init();
        S2Container container = SingletonS2ContainerFactory.getContainer();
        IMessageProvider messageProvider = (IMessageProvider) container.getComponent(IMessageProvider.class);
        System.out.println(messageProvider.getMessage());
        SingletonS2ContainerFactory.destroy();
    }
}
