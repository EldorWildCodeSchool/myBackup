package wildcodeschool;

class CandyCount {

    public static void main(String[] args) {
        double money = 0;
        double price = 1.2;
        int candie = 0;
        if (money > 0 && price > 0) {
            while ((money - price) >=0){
                candie = candie + 1;
                money = money - price;
            }
            System.out.println(candie);
        }
    }
}