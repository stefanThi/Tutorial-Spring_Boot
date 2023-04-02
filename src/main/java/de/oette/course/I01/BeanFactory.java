package de.oette.course.I01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    //  @Bean(name = "otherName")
    public I01DemoComponent myBean() {
        return new I01DemoComponent();
    }
}
