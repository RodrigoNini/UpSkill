package TrabalhoAutonomo;

import java.util.Arrays;
import java.util.Random;

public class aula4 {

    //exercise1
    public static void sumTo100While(){
        int i = 0;
        while(i<=100){
            System.out.println(i);
            i++;
        }
    }
    //exercise2
    public static void sumTo100For(){
        for(int i=0;i<=100;i++){
            System.out.println(i);
        }
    }

    //exercise3
    public static int diviserCount(int n){
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    //exercise4
    public static int sumDivisers(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    //exercise5
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    //exercise6
    public static boolean hasPrimeNumber(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            if (isPrime(i)) {
                return true;
            }
        }
        return false;
    }

    //exercise7
    public static int[] generateNaturalNumbers(int n) {
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i;
        }
        return numbers;
    }


    //exercise8
    public static int[] generateRandomDigits(int length) {
        int[] digits = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            digits[i] = random.nextInt(10);
        }
        return digits;
    }

    //exercise9
    public static void storeinArray() {
        int[] numbers = new int[50];

        for (int i = 0; i < 50; i++) {
            numbers[i] = 101 + i;
        }
        // Imprime os números do vetor
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    //exercise10
    public static int[] copyIntArray(int[] array, int newSize) {
        int[] newArray = Arrays.copyOf(array, newSize);
        return newArray;
    }

    //exercise11
    public static int countOccurrences(char target, char[] array) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

    //exercise12
    public static char[] getSubArray(char[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Índices inválidos");
        }
        int subArrayLength = endIndex - startIndex + 1;
        char[] subArray = new char[subArrayLength];
        for (int i = 0; i < subArrayLength; i++) {
            subArray[i] = array[startIndex + i];
        }
        return subArray;
    }

    public static void main(String[] args) {
        //sumTo100While();
        //sumTo100For();
        //System.out.println(diviserCount(5));
        //System.out.println(sumDivisers(5));
    }

}
