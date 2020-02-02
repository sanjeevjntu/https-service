package com.sanjeev.rest.httpsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsRestController {

    @GetMapping("/get")
    public String getProduct() {
        return "samsing tv with id 1";
    }
}
