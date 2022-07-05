package DSA_Interview_Questions.Recursion;


import java.util.*;
public class printSubsequences {
    public static void main(String[] args) {
        function("312", "");
    }

    static void function(String in, String out){
        if(in.length()==0) {
        	System.out.println(out);
        	return;
        }
        
        function(in.substring(1), out);
        function(in.substring(1), out + in.charAt(0));
    }
}