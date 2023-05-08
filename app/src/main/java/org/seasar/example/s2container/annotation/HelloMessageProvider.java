package org.seasar.example.s2container.annotation;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.Component;

@Component(name = "messageProvider")
public class HelloMessageProvider implements IMessageProvider {
    @Binding(value = "messageTarget")
    private IMessageTarget messageTarget;

    @Override
    public void setMessageTarget(IMessageTarget messageTarget) {
        this.messageTarget = messageTarget;
    }

    @Override
    public String getMessage() {
        return "Hello, " + messageTarget.getName() + "!";
    }
}