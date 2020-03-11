package design_mode.structure.adapter;


import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 */
public class Main {

    public static void main(String[] args) {

        Reader reader = new InputStreamReader(new ByteArrayInputStream("asdfasdf".getBytes()));

    }
}
