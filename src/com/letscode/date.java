package com.letscode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;

public class date {
    public static void main(String[] args){
        LocalDate localDate = LocalDate.parse("2022-06-12");
        System.out.println("Data: "+ localDate);

        LocalDate novaData = localDate.minus(2, ChronoUnit.MONTHS);

        DateTimeFormatter dateFormatterr = DateTimeFormatter.ofPattern("d-MM-uuuu");
        System.out.println("Data: "+ novaData.format(dateFormatterr));
    }
}
