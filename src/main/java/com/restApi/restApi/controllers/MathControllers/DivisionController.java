package com.restApi.restApi.controllers.MathControllers;

import com.restApi.restApi.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/div")
public class DivisionController {

    @RequestMapping(value="/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double divide(@PathVariable("numberOne") String numberOne,
                         @PathVariable("numberTwo") String numberTwo) throws Exception {
        return SimpleMath.divide(numberOne, numberTwo);
    }
}