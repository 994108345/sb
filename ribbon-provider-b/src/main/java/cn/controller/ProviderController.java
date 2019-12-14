
package cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
@RequestMapping(value = "/provider")
public class ProviderController {

    @RequestMapping("get-hello")
    public String getHello(){
        return "hello-provider-b";
    }

}