import java.util.Scanner;

public class hypotenuse {

    public static void main(String[] args){

    
        Scanner scanner = new Scanner(System.in);
        double height, base, hyp;

        System.out.println("Enter height : ");
        height = scanner.nextDouble();
        System.out.println("Enter base : ");
        base = scanner.nextDouble();
        hyp = Math.sqrt((base*base)+(height*height));
        System.out.println("The hypotenuse is :" +hyp);
    }
    
}
