package com.restApi.restApi.controllers.MathControllers;

import com.restApi.restApi.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/media")
public class AverageController {

    @RequestMapping(value="/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double average(@PathVariable("numberOne") String numberOne,
                          @PathVariable("numberTwo") String numberTwo) throws Exception {
        return MathUtils.average(numberOne, numberTwo);
    }
}