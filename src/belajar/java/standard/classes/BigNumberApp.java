package belajar.java.standard.classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger value = new BigInteger("1234567890123456789012345678901234567890");
        BigDecimal decimalValue = new BigDecimal("1234567890123456789012345678901234567890");

        BigInteger add = value.add(value);
        System.out.println(add);

        BigDecimal addDecimal = decimalValue.add(decimalValue);
        System.out.println(addDecimal);
    }
}
