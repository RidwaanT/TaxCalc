public class Calculator {


    private String region;

    public Calculator(){
    }

    public double Total(double price){
        double tax = getTax();
        double total = price*(1.000+ tax/100.000);

        return total;
    }

    public void setRegion(String location){
        this.region=location;
    }

    private double regionalTax(){

        if(region.equals("Ontario")){
            return 13;
        } else if(region.equals("Quebec")){
            return 14.975;
        } else if(region.equals("British Columbia")){
            return 12;
        } else if(region.equals("Alberta")){
            return 5;
        } else if(region.equals("Saskatchewan")){
            return 11;
        } else if(region.equals("Manitoba")){
            return 12;
        } else if(region.equals("New Brunswick")){
            return 15;
        } else if(region.equals("Nova Scotia")){
            return 15;
        } else if(region.equals("Nunavut")){
            return 5;
        } else if(region.equals("Newfoundland and Labrador")){
            return 15;
        } else if(region.equals("Northwest Territories")){
            return 5;
        } else if(region.equals("Prince Edward Island")){
            return 15;
        } else if(region.equals("Yukon")){
            return 5;
        }

        return 0;
    }

    private double getTax(){
        double tax = regionalTax();
        return tax;
    }



}
