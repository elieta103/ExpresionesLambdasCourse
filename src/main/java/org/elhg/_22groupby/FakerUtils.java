package org.elhg._22groupby;

import com.github.javafaker.Faker;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class FakerUtils {

    private static final Faker faker = new Faker(new Locale("es", "MX"));

    public static  String generarNombre(){
        return faker.name().firstName();
    }

    public static  String generarApellido(){
        return faker.name().lastName();
    }

    public static  String generarFecha(){
        return new SimpleDateFormat("yyyy-MM-dd").format(faker.date().birthday());
    }

}
