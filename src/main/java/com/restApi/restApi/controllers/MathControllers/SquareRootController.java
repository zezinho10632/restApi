package com.restApi.restApi.controllers.MathControllers;

import com.restApi.restApi.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/raiz")
public class SquareRootController {

    @RequestMapping(value="/{number}", method= RequestMethod.GET)
    public Double sqrt(@PathVariable("number") String number) throws Exception {
        return SimpleMath.sqrt(number);
    }
}