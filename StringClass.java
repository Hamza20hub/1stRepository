package javaLearning;



public class StringClass {
	

	public static void main(String[] args) {

		String name = "Pamila Harris";
		String position = "Manager";
		String company = "Detroit Donut";
		
		//1.toUpperCase
		System.out.println(name.toUpperCase());
		System.out.println(position.toUpperCase());
		System.out.println(company.toUpperCase());
		
		//2.toLowercCase
		System.out.println(name.toLowerCase());
		System.out.println(position.toLowerCase());
		System.out.println(company.toLowerCase());
		
		//3.charAt
		System.out.println(name.charAt(1));
		System.out.println(position.charAt(3));
		System.out.println(company.charAt(8));
		
		//4.length
		System.out.println(name.length());
		System.out.println(position.length());
		System.out.println(company.length());
		
		//5.subString 
		System.out.println(name.substring(3));
		System.out.println(position.substring(2));
		System.out.println(company.substring(5));
		
		//6.subsString(II)
		System.out.println(name.substring(3, 10));
		System.out.println(position.substring(2, 4));
		System.out.println(company.substring(1,12));
		
		//7.charAt+leangth = last index
		System.out.println(name.charAt(name.length()-1));
		System.out.println(position.charAt(position.length()-1));
		System.out.println(company.charAt(company.length()-1));
		
		//8.codePointAt: to get the unicode value of a character
		System.out.println(	name.codePointAt(2));
		System.out.println(position.codePointAt(1));
		System.out.println(company.codePointAt(5));
		
		//9.return the character unicode before the specified index
		System.out.println(name.codePointBefore(2));
		System.out.println(position.codePointBefore(4));
		System.out.println(company.codePointBefore(6));
		
		//10. CompareTo: compares unicode value first letter of the string and returns the +,-,0 value
		System.out.println(name.compareTo(position));
		System.out.println(position.compareTo(name));
		System.out.println(name.compareTo(company));
		System.out.println("jahfwerhgouerg");
		
		//11.true if this String represents the same sequence of char values as the specified sequence.otherwise false.
		System.out.println(name.contentEquals(company));
		System.out.println(name.contentEquals(position));
		System.out.println(position.contentEquals(company));
		
		//12. concat: which joints 2 string or part of 2 string.
		System.out.println(name.concat(position));
		System.out.println(position.concat(company));
		System.out.println(company.concat("Michigan"));
		
		//13. returns true if the and if only this string contines the specified sequence of char
		System.out.println(name.contains("Pamila"));
		System.out.println(position.contains("nager"));
		System.out.println(company.contains("Detr"));
		
		//14.endsWith: returns true if the end char is  same as specified suffix (char)
		System.out.println(name.endsWith("s"));
		System.out.println(position.endsWith("r"));
		System.out.println(company.endsWith("T"));
		
		//15.startsWith: returns true if the first char is  same as specified suffix (char)
		System.out.println(name.startsWith("p"));
		System.out.println(name.startsWith("P"));
		System.out.println(position.startsWith("M"));
		
		//16.indexOf: returns the index of the char 
		System.out.println(name.indexOf("i"));
		System.out.println(position.indexOf("r"));
		System.out.println(company.indexOf("D"));
		
		
		//17.equals: returns true if the string object is same as sequenced char
		System.out.println(name.equals("Pamila Harris"));
		System.out.println(position.equals("Managers"));
		System.out.println(company.equals("Detroit Donut"));
		
		
	    //18.equalsIgnoreCase: return true value if the string is same as the sequence of char ignores the Case 
		System.out.println(name.equalsIgnoreCase("Pamila Harris"));
		System.out.println(position.equalsIgnoreCase("Managar"));
		System.out.println(company.equalsIgnoreCase("Detroit donut"));
		
		
		//19.returns true if the string is same as the sequence of char
		System.out.println(name.contentEquals("Pamila"));
		System.out.println(name.contentEquals("Pamila Harris"));
		System.out.println(position.contentEquals("Manager"));
		
		//20.matches if the string is matching with the sequence of char
		System.out.println(position.matches("Managr"));
		System.out.println(name.matches("Pamila Harris"));
		System.out.println(company.matches("Detroit Dot"));
		
		//21. toString: this object (which already a string) return itself 
		System.out.println(name.toString());
		System.out.println(position.toString());
		System.out.println(company.toString());
		
		//22. trim:   Confused 
		System.out.println(name.trim());
		System.out.println(company.trim());
		System.out.println(position.trim()); //Leading and trailing space removed
		
		//23. isEmpty: returns true if the string is empty
		System.out.println(name.isEmpty());
		System.out.println(position.isEmpty());
		System.out.println(company.isEmpty());
		
		//24.repeat: repeats the string -- times	
		System.out.println(name.repeat(2));
		System.out.println(position.repeat(3));
		System.out.println(company.repeat(4));
		
		//25.replace: replace the old string to a new string
		System.out.println(name.replace("Pamila Harris", "Jordan"));
		System.out.println(position.replace("Manager", "Professor"));
		System.out.println(company.replace("Detroit Donut", "Wayne University"));
		
		//26.replaceAll: replace all occurance of a single char
		System.out.println(name.replaceAll("a", "E"));
		System.out.println(position.replaceAll("a", "F"));
		System.out.println(company.replaceAll("D", "B"));
		
		//27.replaceFirst: replaces the first SubsString of a String that matches the given regular expression with the given replacement 
		System.out.println(name.replaceFirst("a", "C"));
		System.out.println(position.replaceFirst("M", "Z"));
		System.out.println(company.replaceFirst("D", "W"));
		
		//28. 
		System.out.println(name.regionMatches(7, name, 0, 3));	//confused 
		
		//29.
		System.out.println(name.chars());//confused 
		
		
		System.out.println("----");
		//30.
		System.out.println(name.codePointCount(3,5));//confused 
		System.out.println(position.codePointCount(1, 4));
		System.out.println(company.codePointCount(0, 4));
		
 
		
		
	}

}
