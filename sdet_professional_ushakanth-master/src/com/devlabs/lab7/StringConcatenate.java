package com.devlabs.lab7;

public class StringConcatenate {

	public static void main(String[] args) {
		
		
		System.out.println("----String Concatenate Example using String literals, String Builder and String Buffer------");
		
		String str1 = "String ";
		String str2 = "Literals";
        
		String str1_concat= str1.concat("Literals");
        System.out.println("***********");
        System.out.println("str1_concat after concat:   " +str1_concat);
        
        String str1_concat2= str1.concat(str2);
        System.out.println("str1_concat2 after concat:   " +str1_concat2);
        System.out.println("***********");
        
        
        
        StringBuilder str1_concat_builder = new StringBuilder(str1);
        
        str1_concat_builder.append("Builder");
        System.out.println("***********");
        System.out.println("StringBuilder After Concat:" +str1_concat_builder);
        System.out.println("***********");
        
        StringBuffer str1_concat_buffer = new StringBuffer("String ");
        
        str1_concat_buffer.append("Buffer");
        System.out.println("***********");
        System.out.println("StringBuffer After Concat:" +str1_concat_buffer);
        System.out.println("***********");
        
        
        

	}

}
