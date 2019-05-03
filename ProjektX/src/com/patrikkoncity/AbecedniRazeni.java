package com.patrikkoncity;


import java.util.Comparator;

public class AbecedniRazeni implements Comparator<Vlastnosti> {

    /**
     * Třída, která porovnává přijmení v arraylistu a podle toho je také seřazuje pomocí Comparatoru
     */



        @Override
        public int compare(Vlastnosti o1, Vlastnosti o2) {

            /**
             * Metoda která přímo tyto přijmení porovnává
             * @param prvniJmeno Objekt, který pomáhá s načítaním  vstupů
             * @param druheJmeno Pomocná proměnná která vytváří ID studenta
             */
            String prvniJmeno = o1.getSurname();
            String druheJmeno = o2.getSurname();

            return prvniJmeno.compareTo(druheJmeno);
        }
    
}
