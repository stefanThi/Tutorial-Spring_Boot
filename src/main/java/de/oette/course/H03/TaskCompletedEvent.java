package de.oette.course.H03;

import org.springframework.context.ApplicationEvent;

public class TaskCompletedEvent extends ApplicationEvent {
    private String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public TaskCompletedEvent(Object source, String taskname) {
        super(source);
        this.taskName = taskname;
    }

}
