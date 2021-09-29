package codewars.kata.kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Kata_TripleTroubleTest {

    @Test
    void tripleTrouble() {
        assertEquals("ttlheoiscstk", Kata_TripleTrouble.tripleTrouble("this", "test", "lock"));
        assertEquals("abcabc", Kata_TripleTrouble.tripleTrouble("aa","bb","cc"));
        assertEquals("Batman", Kata_TripleTrouble.tripleTrouble("Bm", "aa", "tn"));
        assertEquals("LexLuthor", Kata_TripleTrouble.tripleTrouble("LLh","euo","xtr"));
    }
}