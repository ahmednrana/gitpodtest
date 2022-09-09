package com.mkyong.hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Map<String, String> m = new HashMap<>();
        m.put("A", "1");
        m.put("B", "2");
        System.out.print(m);
    }
}
