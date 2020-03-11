package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("fatorial: " + fatorialRecursivo(6));
        System.out.println("soma: " + somatorio(4));
        System.out.println("fibonacci: " + fibonacci(9));
        System.out.println("soma de 2 num: " + somatorioDois(2,7));
        System.out.println("é palindromo: " + isPalindromo("vaca"));
    }

    public static int fatorialRecursivo(int n) throws Exception {
        if(n<0) throw new Exception("Número inválido!");
        if(n == 0 || n==1) return 1;
        return n*fatorialRecursivo(n-1);
    }

    public static int somatorio(int n) throws Exception {
        if(n<0) throw new Exception("Número inválido!");
        if(n == 0) return 0;
        return n + somatorio(n-1);
    }

    public static int fibonacci(int n) throws Exception {
        if(n<0) {
            throw new Exception("Número inválido!");
        }
        if(n == 1) return 1;
        if(n == 2) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int somatorioDois(int k, int j){
        if(k == j) return j;
        if(k > j) return j + somatorioDois(k,j+1);
        if(k < j) return k + somatorioDois(j,k+1);
        return 0;
    }

    public static boolean isPalindromo(String content) throws Exception {
        if(content.isEmpty()) throw new Exception("String nula");
        if(content.length() == 1) return true;
        if(content.equals(" ")) return true;
        int length = content.length()-1;
        char primeiro = content.charAt(0);
        char ultimo = content.charAt(length);
        if(content.charAt(0) == content.charAt(length)){
            content = content.replaceFirst(primeiro+"", "");
            content = content.substring(length-1);
            return isPalindromo(content);
        }

        return false;
    }
}
