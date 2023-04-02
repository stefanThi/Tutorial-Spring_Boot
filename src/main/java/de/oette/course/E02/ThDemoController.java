package de.oette.course.E02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThDemoController {

    @GetMapping(value = {"/", "index.html"})
    public ModelAndView index(@RequestParam(defaultValue = "P1") Page page) {
        List<CardData> data = new ArrayList<CardData>();
        if (page.equals(Page.P1)) {
            data.add(createCardData("Title", "Text"));
            data.add(createCardData("Welcome", "to my page"));
            data.add(createCardData("Hello", "World"));
        }
        if (page.equals(Page.P2)) {
            data.add(createCardData("Chapter2", "chapter2"));
            data.add(createCardData("Chapter2", "chapter2"));
            data.add(createCardData("Chapter2", "chapter2"));
        }

        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("cardData", data);
        return modelAndView;
    }

    @GetMapping(value = {"/contact", "contact.html"})
    public ModelAndView contact() {

        return new ModelAndView("contact");
    }

    private CardData createCardData(String title, String text) {
        CardData cardData = new CardData();
        cardData.setTitle(title);
        cardData.setText(text);
        return cardData;
    }

    private static enum Page {
        P1,
        P2
    }
}
