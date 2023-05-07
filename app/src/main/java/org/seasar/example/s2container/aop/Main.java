package org.seasar.example.s2container.aop;

import org.seasar.framework.container.S2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {
    public static void main(String[] args) {
        SingletonS2ContainerFactory.setConfigPath("org/seasar/example/s2container/aop/app.dicon");
        SingletonS2ContainerFactory.init();
        S2Container container = SingletonS2ContainerFactory.getContainer();
        SampleService service = (SampleService) container.getComponent(SampleService.class);
        service.add(1, 2);
        SingletonS2ContainerFactory.destroy();
    }
}
