package net.nuconuco.bl.impl;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.nuconuco.bl.model.WebServiceRequest;
import net.nuconuco.pl.service.WebService;

@Service
@Slf4j
public class WebServiceImpl implements WebService {

    @Override
    public void run(WebServiceRequest request) {
        log.info("リクエストID: {}.", request.getId());
    }

}
