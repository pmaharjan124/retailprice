import java.util.Scanner;
public class RetailPrice {

    
    static void print(String line) {
        System.out.println(line);
    }

    static int findFinalPrice(int price, int addup) {
        return (price * addup) / 100;
    }

    public static void main(String[] args) {
        int price;
        int addup;
        Scanner sc = new Scanner(System.in);
        print("Enter price of the product :");
        price = sc.nextInt();
        print("Enter add percent of the product :");
        addup = sc.nextInt();
        print("Final price is " + findFinalPrice(price, addup));
    }
}
