package org.seasar.example.s2container.annotation;

public interface IMessageProvider {
    public void setMessageTarget(IMessageTarget messageTarget);

    public String getMessage();
}