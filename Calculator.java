package calculator;
import java.util.Scanner;

public class Calculator{

    public static void main(String[] args) {
        // TODO code application logic here
        double x , y;

        Scanner input = new Scanner(System.in);

        x = input.nextDouble();
        y = input.nextDouble();

        ADD sum = new ADD(x,y);
        System.out.println(sum.getSum());
        SUB sub = new SUB(x,y);
        System.out.println(sub.getSub());
        Mul mul = new Mul(x ,y);
        System.out.println(mul.getMul());
        Div div = new Div(x , y);
        System.out.println(div.getDiv());
    }
}
