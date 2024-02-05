// Напишите программу, которая проверяет, является ли введенная текстовая строка числом с плавающей точкой (float).
// Программа пытается преобразовать введенную строку в число float, и если это успешно, она выводит полученное число.
// Если преобразование не удалось, программа выдаёт сообщение об ошибке
// Your input is not a float number. Please, try again.
// и возвращает специальное значение Float.NaN, чтобы обозначить ошибку.


public class Homework {

    public static void main(String[] args) {
        String input;


        if (args.length == 0) {
           // input = "3.14"; // По умолчанию используем "3.14", если аргумент не передан
            input = "text";
        } 
        else {
            input = args[0];
        }

        float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
    
}
class IsFloat {
    public static float isFloat(String input) {

        //Scanner scanner=new Scanner(System.in);
        float number = Float.NaN;

            try{
                number =Float.parseFloat(input);
            }
            catch(NumberFormatException e){
                System.err.println("Your input is not a float number. Please, try again.");
               //throw new RuntimeException("Your input is not a float number. Please, try again.");
               //System.out.println(Float.NaN);
               return number;
            }


            // if(scanner.hasNextInt()) number = scanner.nextFloat();
            // else System.err.println("Your input is not a float number. Please, try again");

            return number;

    }
}




//-----------------------------
// // Напишите программу, которая вычисляет значение выражения intArray[8] / d, гдеintArray- массив целых чисел, а d - делитель.
// // Программа проверяет, имеется ли в массиве intArray элемент с индексом 8, и если нет, выводит сообщение о невозможности выполнения операции.
// // Также программа проверяет, равен ли делитель d нулю, и если да, выводит соответствующее сообщение.

// import java.util.Arrays;

// class Expr {

//     public static double expr(int[] intArray, int d){
//  // Введите свое решение ниже
//         double result=0;
//         try{
//             int arrNumber = intArray[8];
//             result = Double.valueOf(arrNumber/d);

//         }
//         catch (IndexOutOfBoundsException e) {
//         //System.err.println("Указан индекс за пределами массива");
//             if(intArray.length<9){
//                 // throw new RuntimeException("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//                 System.err.println("It's not possible to evaluate the expression - intArray[8] / d as there is no 8th element in the given array.");
//             }
//         }
//         catch(ArithmeticException e){
//             //throw new RuntimeException("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
//             System.err.println("It's not possible to evaluate the expression - intArray[8] / d as d = 0");
//         }
//         return result;
        
//     }
// }
// public class Homework {
//     public static void main(String[] args) {
//         int[] intArray;
//         int d;

//         if (args.length == 0) {
//             intArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//             d = 0; // По умолчанию используем 0, если аргумент не передан
//         } else {
//             intArray = Arrays.stream(args[0].split(" ")).mapToInt(Integer::parseInt).toArray();
//             d = Integer.parseInt(args[1]); // Можно использовать значение по умолчанию или передать его как аргумент.
//         }

//         double result = Expr.expr(intArray, d);
//         System.out.println(result);
//     }
// }







// //---------------------------
// // Напишите программу для выполнения арифметической операции деления двух целых чисел a и b.
// // При этом программа должна проверить, что делитель b не равен нулю, и выполнить деление только в этом случае.
// // Если b равен нулю, программа должна вывести сообщение о невозможности выполнения операции и вернуть результат равный нулю.
// // После выполнения операции деления, программа также должна вывести сумму чисел a и b с помощью метода printSum.
// // Если аргументы не переданы через командную строку, используйте значения по умолчанию.

// class Expr {

//     public static double expr(int a, int b) {

//         double result;
//         if(b!=0){
//             result = Double.valueOf(a/b);
//         }
//         else{
//             throw new RuntimeException("It's not possible to evaluate division by zero");
//         }
//         printSum(a, b);
//         return result;
// }

//     public static void printSum(int a, int b) {

//         if(a!=0 && b!=0){
//             System.out.println(a+b);
//         }
//     }
// }
// public class Homework {
//     public static void main(String[] args) {
//         int a;
//         int b;

//         if (args.length == 0) {
//             a = 90;
//             b = 3; // Default values if no arguments are provided
//         } else {
//             a = Integer.parseInt(args[0]);
//             b = Integer.parseInt(args[1]);
//         } 

//         double result = Expr.expr(a, b);
//         System.out.println(result);
//     }
// }








// //---------------------------------------------------------
// // Напишите программу, которая принимает символ a в качестве аргумента и выполняет следующую проверку:
// // если символ a равен пробелу '', программа должна выбрасывать исключение с сообщением
// // "Пустая строка введена.".
// // В противном случае программа должна возвращать сообщение
// // "Ваш ввод - [символ]", где [символ] заменяется на введенный символ a.



// class Expr {
//     public static String expr(char a) throws Exception {

//         if(Character.isWhitespace(a)){
//            throw new RuntimeException("Empty string has been input.");
//         }
//         return String.format("Your input was - %s",a);
// }
// }
// public class Homework {
//     public static void main(String[] args) {
//         char a;

//         if (args.length == 0) {
//             a = ' '; // Значение по умолчанию, если аргументы не были предоставлены
//         } else {
//             a = args[0].charAt(0); // Преобразуйте первый аргумент командной строки в символ
//         }

//         try {
//             String result = Expr.expr(a);
//             System.out.println("Result: " + result);
//         } catch (Exception e) {
//             System.err.println("Error: " + e.getMessage());
//         }
//     }
// }