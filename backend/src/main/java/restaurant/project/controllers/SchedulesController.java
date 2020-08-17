package restaurant.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SchedulesController {

    @RequestMapping("/schedules")
    public String index() {
        return "schedules";
    }

}
