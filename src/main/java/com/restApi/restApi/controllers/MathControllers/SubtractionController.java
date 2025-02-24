package com.restApi.restApi.controllers.MathControllers;

import com.restApi.restApi.exception.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math/sub")
public class SubtractionController {

    @RequestMapping(value="/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double subtract(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception {
        return MathUtils.subtract(numberOne, numberTwo);
    }
}