package de.oette.course.F03;

import java.lang.reflect.Constructor;

public class F03Component {

    private final F03ConfigurableService configurableService;

    public F03Component(F03ConfigurableService configurableService) {
        this.configurableService = configurableService;
    }
}
