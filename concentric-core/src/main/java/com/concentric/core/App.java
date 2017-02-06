package com.concentric.core;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String [][] s= {{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"},
		        		{"1231","466","12313","414"}};
        
        for (int i = 0; i < s.length; i++) {
			String[] strings = s[i];
			for (int j = 0; j < strings.length; j++) {
				String string = strings[j];
				System.out.println(string);
			}
		}
       
       
    }
}
