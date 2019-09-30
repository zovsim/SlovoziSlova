package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String word;
		Scanner inputDevise = new Scanner(System.in);
		System.out.print("Введіть слово>> ");
		word = inputDevise.next();
		char j = word.charAt(0);
		char a = word.charAt(1);
		char v = word.charAt(2);
		char e = word.charAt(3);
		System.out.println("     "+j+"     "+a+"   "+v+"       "+v+"   "+e);
		System.out.println("     "+j+"    "+a+" "+a+"   "+v+"     "+v+"   "+e+" "+e);
		System.out.println("     "+j+"   "+a+"   "+a+"   "+v+"   "+v+"   "+e+"   "+e);
		System.out.println(j+"    "+j+"  "+a+a+a+a+a+a+a+"   "+v+" "+v+"   "+e+e+e+e+e+e+e);
		System.out.println(j+""+j+j+j+j+j+" "+a+"       "+a+"   "+v+"   "+e+"       "+e);

	}
}