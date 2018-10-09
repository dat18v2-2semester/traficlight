package dk.clbo.controller;

import dk.clbo.Model.TrafficLight;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TrafficlightController {

    TrafficLight tl = new TrafficLight();

    @GetMapping("/")
    public String index(Model model){
        tl.shift();
        model.addAttribute("state", tl.getState());
        return "index";
    }

    @PostMapping("/")
    public String shift(Model model){
        tl.shift();
        model.addAttribute("state", tl.getState());
        return "index";
    }
}
