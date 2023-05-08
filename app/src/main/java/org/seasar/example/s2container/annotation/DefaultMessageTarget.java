package org.seasar.example.s2container.annotation;

import org.seasar.framework.container.annotation.tiger.Component;

@Component(name = "messageTarget")
public class DefaultMessageTarget implements IMessageTarget {
    @Override
    public String getName() {
        return "World";
    }
}
