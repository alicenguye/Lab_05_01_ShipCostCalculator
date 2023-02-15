public class Main {
    public static void main(String[] args)
    {
        final int PRICE =100;
        int itemPRice =98;
        double shipping =0.02;
        double total;

        if (itemPRice >= PRICE){
            total = itemPRice;
            System.out.println( "you have free shipping, your total is" +" "+ total );
        }
        else{
            total = itemPRice + (shipping * itemPRice);
            System.out.println("you have to pay for shipping, your total is" +" "+total);
        }
    }
}