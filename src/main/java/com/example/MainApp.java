package com.example;

import java.io.IOException;
import com.example.PropertyValues;


/**
 * Just a main class.
 *
 */
public class MainApp {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello from MainApp");
	PropertyValues properties = new PropertyValues();
	properties.getPropValues();
    }
}
