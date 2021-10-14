package codecatcher.java_for_duimmies.recursion;

public class RecurCountDown {

    static void countDown(int i){
        // Prüfung verhindert eine Endlosscheife
        if (i > 0){
            System.out.println("Verbleibende Anzahl durchläufe: " + i + "");
            // Selbstaufruf der Methode
            countDown(--i);
        } else{
            System.out.println("i ist auf 0 heruntergelaufen und der Selbstaufruf wurde beendet");
        }
    }

    public static void main(String[] args) {
        countDown(12);
    }
}
