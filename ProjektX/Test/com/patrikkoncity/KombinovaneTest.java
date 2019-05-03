package com.patrikkoncity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KombinovaneTest {

    /**
     *Třída, která jednotkové testy jUNIT, to jsou testy celé metody , jestli vrací metody, které chceme aby ty metody vracely.
     *
     */

    @Test
    public void Zodiac() throws Exception {
        Kombinovane tester=new Kombinovane();
        tester.setDay(9);
        tester.setMonth(9);
        assertEquals("Virgo", tester.zodiac(),"Nefunguje to!");


    }



    @Test
    public void prestupnyRok() throws Exception {
        Kombinovane tester= new Kombinovane();
        tester.setYear(1000);
        assertEquals("Nenarodil ses v prestupnem roce!", tester.prestupnyRok(), "Nefunguje to!");


    }
}