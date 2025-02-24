package com.restApi.restApi.controllers.MathControllers;

import com.restApi.restApi.exception.UnsupportedMathOperationException;

public class MathUtils {

    // Método que valida e converte uma string para Double
    private static Double validateAndConvert(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        String number = strNumber.replace(",", "."); // Converte vírgula para ponto
        if (!number.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Double.parseDouble(number);
    }

    public static Double add(String numberOne, String numberTwo) throws Exception {
        return validateAndConvert(numberOne) + validateAndConvert(numberTwo);
    }

    public static Double subtract(String numberOne, String numberTwo) throws Exception {
        return validateAndConvert(numberOne) - validateAndConvert(numberTwo);
    }

    public static Double multiply(String numberOne, String numberTwo) throws Exception {
        return validateAndConvert(numberOne) * validateAndConvert(numberTwo);
    }

    public static Double divide(String numberOne, String numberTwo) throws Exception {
        Double numTwo = validateAndConvert(numberTwo);
        if (numTwo == 0) {
            throw new UnsupportedMathOperationException("Division by zero is not allowed!");
        }
        return validateAndConvert(numberOne) / numTwo;
    }

    public static Double average(String numberOne, String numberTwo) throws Exception {
        return (validateAndConvert(numberOne) + validateAndConvert(numberTwo)) / 2;
    }

    public static Double sqrt(String number) throws Exception {
        Double num = validateAndConvert(number);
        if (num < 0) {
            throw new UnsupportedMathOperationException("Cannot calculate the square root of a negative number!");
        }
        return Math.sqrt(num);
    }
}