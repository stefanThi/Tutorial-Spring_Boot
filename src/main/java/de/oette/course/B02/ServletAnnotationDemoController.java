package de.oette.course.B02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class ServletAnnotationDemoController {
    @GetMapping
    @ResponseBody
    public String demo(@RequestParam(value="user") String userName,
                         HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws IOException, InterruptedException {
        servletResponse.setStatus(404);
        return "the username is " + userName;
    }
}
