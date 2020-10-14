import java.util.Scanner;

public class UserDisplay {
    public UserDisplay(){
        Scanner uInput = new Scanner(System.in);
        Calculator calc= new Calculator();
        Item item;

        String region;

        System.out.println("Welcome to the Tax calculator, designed by Mauro Ponte & Ridwaan Toure");
        System.out.println("This calculator uses tax information from October 14, 2020 to calculate the total price/n" +
                "GST and PST are not separated in this program tax is calculated as HST for all regions even those without");
        System.out.println("Please type the name of the province:");
        region = uInput.nextLine();
        calc.setRegion(region);
        System.out.println("Please type the name of the Item");
        String itemName = uInput.next();
        System.out.println("Please type in the price in xx.xx format no $");
        Double itemPrice= uInput.nextDouble();
        item = new Item(itemPrice, itemName);
        Double finalPrice = calc.Total(item.getPrice());
        System.out.println(finalPrice);


    }
}
