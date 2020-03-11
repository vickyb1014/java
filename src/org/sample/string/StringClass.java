package org.sample.string;

public class StringClass {
public static void main(String[] args) {
String s = "Vignesh";
String s1 = "Vignesh B";
char charAt = s.charAt(3);
System.out.println(charAt);

int length = s.length();
System.out.println(length);

boolean contains = s.contains("Vig");
System.out.println(contains);

String upperCase = s.toUpperCase();
System.out.println(upperCase);

String replace = s.replace("e", "E");
System.out.println(replace);

int lastIndexOf = s.lastIndexOf("h");
System.out.println(lastIndexOf);

boolean equals = s.equals(upperCase);
System.out.println(equals);

boolean equalsIgnoreCase = s.equalsIgnoreCase(upperCase);
System.out.println(equalsIgnoreCase);

boolean empty = s.isEmpty();
System.out.println(empty);

String concat = s.concat(upperCase);
System.out.println(concat);

String trim = s1.trim();
System.out.println(trim);

String start = s.substring(5);
System.out.println(start);

String starts = s1.substring(2,7);
System.out.println(starts);

}
}
