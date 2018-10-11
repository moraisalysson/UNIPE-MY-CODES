package br.com.unipe.cc.aula0309;

public class ArrayCopyOfDemo {
public static void main(String[] args) {
	char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
	
	char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 1, 10);
	
	System.out.println(new String(copyTo));
}
}
