package de.oette.course.A02;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.TestContext;

class ApplicationContextTest {

    @Test
    void testInitSpring() {
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        context.registerBean(TestContext.class);

        TestContext bean = context.getBean(TestContext.class);
        System.out.println(bean);
        TestContext bean2 = context.getBean(TestContext.class);
        System.out.println(bean2);
    }
    private  static class TestContext{

    }
}
