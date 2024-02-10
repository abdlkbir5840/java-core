package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1. Write a Java program to implement a lambda expression to find the sum of two integers.
        System.out.println("1: Write a Java program to implement a lambda expression to find the sum of two integers.");
        int i = 5;
        int j = 4;
        Sum sum = (a, b)-> a + b;
        int res = sum.sum(i, j);
        System.out.println(res);
        //2. Write a Java program to implement a lambda expression to check if a given string is empty.
        System.out.println("2: Write a Java program to implement a lambda expression to check if a given string is empty.");
        IsEmpty isEmpty = (s)->s.isEmpty();
        String s1 = "Abdelkabir";
        String s2 = "";
        boolean b1 = isEmpty.isEmpty(s1);
        boolean b2 = isEmpty.isEmpty(s2);
        System.out.println(b1);
        System.out.println(b2);
        //3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.
        System.out.println("3: Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.");
        List<String> colors = Arrays.asList("Red", "Green", "Blue", "Black");
        colors.replaceAll(str -> str.toLowerCase());
        System.out.println("-----------To Lower-------------");
        colors.forEach(System.out::println);
        colors.replaceAll(str -> str.toUpperCase());
        System.out.println("-----------To Upper-------------");
        colors.forEach(System.out::println);
        //4. Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.
        System.out.println("4: Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.");
        List<Integer> numbers = Arrays.asList(12, 13, 14, 14, 15,7);
        System.out.println(numbers);
        List<Integer> even = numbers.stream()
                .filter((nbr) -> nbr % 2 == 0)
                .toList();
        System.out.println(even);
        List<Integer> odd = numbers.stream()
                .filter((nbr) -> nbr % 2 != 0)
                .toList();
        System.out.println(odd);
        //5. Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.
        System.out.println("5: Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.");
        System.out.println(colors);
        colors.sort(((c1, c2) -> c1.compareToIgnoreCase(c2)));
        System.out.println(colors);
        //6. Write a Java program to implement a lambda expression to find the average of a list of doubles.
        System.out.println("Write a Java program to implement a lambda expression to find the average of a list");
        List<Integer> integers = Arrays.asList(12, 13, 14, 14, 12, 15,7);
        System.out.println(integers);
        double average = integers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println(String.format("Average %.2f",average));
        //7. Write a Java program to implement a lambda expression to remove duplicates from a list of integers.
        System.out.println("7: Write a Java program to implement a lambda expression to remove duplicates from a list of integers.");
        System.out.println(integers);
        List<Integer> distinct = integers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinct);
        //8. Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.
        System.out.println("8: Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.");
        IntUnaryOperator factorial = n->{
            int fact = 1;
            for (int k = 1; k <= n; k++) {
                fact*=k;
            }
            return fact;
        };
        int n = 4;
        int fact = factorial.applyAsInt(n);
        System.out.println(n);
        System.out.println(fact);
        //9. Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.
        System.out.println("9: Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.");
        Predicate<Integer> is_prime = nbr -> {
            if (nbr <= 1) {
                return false;
            }
            for (int h = 2; h <= Math.sqrt(nbr); h++) {
                if (nbr % h == 0) {
                    return false;
                }
            }
            return true;
        };
        int nombre = 17;
        boolean pr = is_prime.test(nombre);
        System.out.println(nombre);
        System.out.println(pr);
        //10. Write a Java program to implement a lambda expression to concatenate two strings.
        System.out.println("10: Write a Java program to implement a lambda expression to concatenate two strings.");
        Concatenate concatenate = (ch1, ch2) -> {return ch1 + ch2;};
        BiFunction<String, String, String> concatenatePre = (ch1, ch2) -> ch1+ch2;
        String ch1 = "Abdel";
        String ch2 = "kabir";
        String conc = concatenate.concatenate(ch1, ch2);
        String con2 = concatenatePre.apply(ch1, ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(conc);
        System.out.println(con2);
        //11. Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.
        System.out.println("11: Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.");
        System.out.println(numbers);
        Integer integer = numbers
                .stream()
                .max((x, y) -> x.compareTo(y))
                .get();
        System.out.println(integer);
        //12. Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.
        System.out.println("12: Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.");
        System.out.println(numbers);
        int summe = numbers.stream()
                .reduce(0, (x, y) -> x + y)
                .intValue();
        int multiple = numbers.stream()
                .reduce(1, (x, y) -> x * y)
                .intValue();
        System.out.println(String.format("Summe: %d", summe));
        System.out.println(String.format("Muliple: %d", multiple));
        //13. Write a Java program to implement a lambda expression to count words in a sentence.
        System.out.println("13: Write a Java program to implement a lambda expression to count words in a sentence.");
        String text = "Hello, i'am abdelkabir el bahmadi, Java Developer";
        WordCounter wordCounter = (s) -> s.split(" ").length;
        int count = wordCounter.countWords(text);
        System.out.println(String.format("Text: %s", text));
        System.out.println(String.format("Count Words: %d", count));
        //14. Write a Java program to implement a lambda expression to check if a given string is a palindrome.
        System.out.println("14: Write a Java program to implement a lambda expression to check if a given string is a palindrome.");
        Predicate<String> isPalindrome = (s)->{
            String revrese = new StringBuilder(s)
                    .reverse()
                    .toString();
            return s.equals(revrese);
        };
        String java = "Java";
        String php = "PHP";
        boolean test = isPalindrome.test(java);
        boolean test2 = isPalindrome.test(php);
        System.out.println(String.format("Is %s palindrome: %b", java, test));
        System.out.println(String.format("Is %s palindrome: %b", php, test2));
        //15. Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.
        System.out.println("15: Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.");
        System.out.println(numbers);
        int sumSquareEven = numbers
                .stream()
                .filter((x) -> x % 2 == 0)
                .mapToInt(x->x*x)
                .sum();
        int sumSquareOdd = numbers
                .stream()
                .filter((x) -> x % 2 != 0)
                .mapToInt(x -> x * x)
                .sum();
        System.out.println(String.format("Sum Square even %d", sumSquareEven));
        System.out.println(String.format("Sum Square odd %d", sumSquareOdd));
        //16. Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.
        System.out.println("16: Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.");
        System.out.println(colors);
        String word = "RED";
        String existingWord = colors
                .stream()
                .filter((s) -> s.equals(word))
                .findFirst()
                .orElse("Not Found");
        System.out.println(word);
        System.out.println(existingWord);

        String word1 = "Yellow";
        String existingWord1 = colors
                .stream()
                .filter((s) -> s.equals(word1))
                .findFirst()
                .orElse("Not Found");
        System.out.println(word1);
        System.out.println(existingWord1);
        //17. Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.
        System.out.println("17: Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.");
        String longest = colors.stream()
                .max(Comparator.comparing(String::length)).get();
        String smallest = colors.stream()
                .min(Comparator.comparing(String::length)).get();
        System.out.println(colors);
        System.out.println(String.format("longest: %s", longest));
        System.out.println(String.format("smallest: %s", smallest));

    }
}