package com.restApi.restApi.requestconverters;

import com.restApi.restApi.exception.UnsupportedMathOperationException;

public class NumberConverter {

    // Método que valida e converte uma string para Double
    public static Double validateAndConvert(String strNumber) {
        if (strNumber == null || strNumber.isEmpty()) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        String number = strNumber.replace(",", "."); // Converte vírgula para ponto
        if (!number.matches("[-+]?[0-9]*\\.?[0-9]+")) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Double.parseDouble(number);
    }
}