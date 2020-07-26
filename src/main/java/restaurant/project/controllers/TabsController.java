package restaurant.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TabsController {

    @RequestMapping("/tabs")
    public String index() { return "tabs"; }

}
