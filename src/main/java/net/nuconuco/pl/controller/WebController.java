package net.nuconuco.pl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import lombok.extern.slf4j.Slf4j;
import net.nuconuco.bl.model.WebServiceRequest;
import net.nuconuco.pl.service.WebService;

@Controller
@Slf4j
public class WebController {

    @Autowired
    private WebService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model mav) {
        mav.addAttribute("name", "ここ");
        WebServiceRequest request = new WebServiceRequest();
        service.run(request);
        log.info(Thread.currentThread().getStackTrace()[1].getClassName());
        return "index";
    }
}
