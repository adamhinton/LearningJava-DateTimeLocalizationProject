package dev.lpa;

import java.time.ZoneId;
import java.util.Locale;

public class Main {

    private record Employee(String name, Locale locale, ZoneId zone){

        public Employee(String name, Locale locale, String zone) {
            this(name, locale, ZoneId.of(zone));
        }
    }

    public static void main(String[] args) {

    }
}