package ru.stqa.sigma.moesk;

public class FirstProgram {

  public static void main(String[] args) {
   hello("world");
   hello("user");

   double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + are(len));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b  + " = " + area(a,b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
  public static double are (double l) {
    return l * l;
  }
  public static double area(double a, double b) {
    return a * b;
  }

}