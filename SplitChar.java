import java.util.*;
public class SplitChar {
	public static String split(String word){
		return(word.substring(0) + word.charAt(0));
	}
	public static void main(String[] args){
		System.out.println(split("Hey"));
		
	}

}
