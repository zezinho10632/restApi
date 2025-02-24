package com.restApi.restApi.math;

import com.restApi.restApi.exception.UnsupportedMathOperationException;
import com.restApi.restApi.requestconverters.NumberConverter;

public class SimpleMath {

    public static Double add(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.validateAndConvert(numberOne) + NumberConverter.validateAndConvert(numberTwo);
    }

    public static Double subtract(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.validateAndConvert(numberOne) - NumberConverter.validateAndConvert(numberTwo);
    }

    public static Double multiply(String numberOne, String numberTwo) throws Exception {
        return NumberConverter.validateAndConvert(numberOne) * NumberConverter.validateAndConvert(numberTwo);
    }

    public static Double divide(String numberOne, String numberTwo) throws Exception {
        Double numTwo = NumberConverter.validateAndConvert(numberTwo);
        if (numTwo == 0) {
            throw new UnsupportedMathOperationException("Division by zero is not allowed!");
        }
        return NumberConverter.validateAndConvert(numberOne) / numTwo;
    }

    public static Double average(String numberOne, String numberTwo) throws Exception {
        return (NumberConverter.validateAndConvert(numberOne) + NumberConverter.validateAndConvert(numberTwo)) / 2;
    }

    public static Double sqrt(String number) throws Exception {
        Double num = NumberConverter.validateAndConvert(number);
        if (num < 0) {
            throw new UnsupportedMathOperationException("Cannot calculate the square root of a negative number!");
        }
        return Math.sqrt(num);
    }
}