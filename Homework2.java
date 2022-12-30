import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework2 {
    public static void main (String[] args) {
    Equation();    
    }

    public static String GetString(){
    Scanner scan = new Scanner(System.in);
    String equation;
    System.out.println("Введите формулу");
    equation = scan.nextLine();
    scan.close();
    return equation;
    }

    public static void Equation() {
    Map<String, Integer> states = new HashMap<String, Integer>();
    Scanner scan = new Scanner(System.in);
    String equation = GetString();
    equation = equation.replace(" ", "");
    String [] st1 = equation.split("\\+");
    for (int i = 0; i < st1.length; i++){
        int count = 0;
        for (int j = 0; j < i; j++){
                if(st1[i].equals(st1[j])){  
                count++;
                }
            }
        if (count == 0) {
            System.out.println("Введите значение " + st1[i]);
            states.put(st1[i], scan.nextInt());}
    }
    int sum = 0;
    String res = "";
    for (int i = 0; i < st1.length; i++){
        int val = states.get(st1[i]);
        sum += val;
        res += val + " + ";
    } 
    res = res.substring(0, res.length()-1);
    System.out.print(res);
    System.out.print("\b= "+ sum);
    scan.close();
    }
}
