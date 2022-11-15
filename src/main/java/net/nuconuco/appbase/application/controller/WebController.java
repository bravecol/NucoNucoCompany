package net.nuconuco.appbase.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WebController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model mav) {
        mav.addAttribute("name", "ここ");
        log.info(Thread.currentThread().getStackTrace()[1].getClassName());
        return "index";
    }
}
