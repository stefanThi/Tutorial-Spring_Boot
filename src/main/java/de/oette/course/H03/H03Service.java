package de.oette.course.H03;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class H03Service {

    @EventListener(TaskCompletedEvent.class)
    public void listenToTaskEvent(TaskCompletedEvent taskCompletedEvent) {
        System.out.println(String.format("Task %s has been completed.", taskCompletedEvent.getTaskName()));
    }
}
