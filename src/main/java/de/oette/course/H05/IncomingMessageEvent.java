package de.oette.course.H05;

import org.springframework.context.ApplicationEvent;

public class IncomingMessageEvent extends ApplicationEvent {
    private String receiver;
    private String text;

    public IncomingMessageEvent(Object source, String receiver, String text) {
        super(source);
        this.receiver = receiver;
        this.text = text;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }
}
