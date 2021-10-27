package codecatcher.snippets;

public class MathUtils {

    public static <T extends Integer> boolean isPrime(T element){


        int num  = element.intValue() / 2;

        for (int i = 2; i <= num; i++){
            if (element.intValue() % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int i = 1;
        while(i != 17){
            if (isPrime(i)){
                System.out.println(i);
            }
            i++;
        }

        /*
        for (int i = 1; i < 100000; i++)

            if (isPrime(i)){
                System.out.println(i);
            }

         */
    }
}
