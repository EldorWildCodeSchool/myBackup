package codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata_CodeChallenge18Test {

    public static char randomChar() {
        char[] chars =  "qwertyuiopa".toCharArray();
        int randomInt = (int)(10*Math.random());
        return chars[randomInt];
    }


    @Test
    public void testSomething() {
        assertEquals(1, Kata_CodeChallenge18.strCount("Hello", 'o'));
        assertEquals(2, Kata_CodeChallenge18.strCount("Hello", 'l'));
        assertEquals(0, Kata_CodeChallenge18.strCount("",'z'));
        assertEquals(1, Kata_CodeChallenge18.strCount2("Hello", 'o'));
        assertEquals(2, Kata_CodeChallenge18.strCount2("Hello", 'l'));
        assertEquals(0, Kata_CodeChallenge18.strCount2("",'z'));
    }

    @Test
    public void level2Test() {
        assertEquals(0, Kata_CodeChallenge18.strCount("Library", 'f'));
        assertEquals(6, Kata_CodeChallenge18.strCount("Caaataaas", 'a'));
        assertEquals(0, Kata_CodeChallenge18.strCount("",'z'));
        assertEquals(0, Kata_CodeChallenge18.strCount2("Library", 'f'));
        assertEquals(6, Kata_CodeChallenge18.strCount2("Caaataaas", 'a'));
        assertEquals(0, Kata_CodeChallenge18.strCount2("",'z'));
    }

    @Test
    public void randowTest() {
        for (int j=0; j<10; j++ ) {
            int count = 0;
            StringBuilder str = new StringBuilder();
            char check = randomChar();
            for (int i = 0; i < 30; i++) {
                char randChar = randomChar();
                str.append(randChar);
                if (check == randChar) {count++;}
            }
            assertEquals(count, Kata_CodeChallenge18.strCount(str.toString(), check));
            assertEquals(count, Kata_CodeChallenge18.strCount2(str.toString(), check));
        }
    }
}