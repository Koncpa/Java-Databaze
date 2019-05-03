package com.patrikkoncity;

import com.sun.corba.se.impl.orbutil.ObjectWriter;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

/**
 * Třída databáze, kde jsme si vytvořili Arraylist seznamStudenti, do kterého ukladáme třídu Vlastnosti a pracujeme s ruznými atrubuty jak třídy Vlastnosti, tak i arraylistu seznamStudent.
 *
 * @sc Objekt, který pomáhá s načítaním  vstupů
 * @idx Pomocná proměnná která vytváří ID studenta
 */


public class Databaze {


    Scanner sc = new Scanner(System.in);
    ArrayList<Vlastnosti> seznamStudenti = new ArrayList<Vlastnosti>();


    public int id() {
        int count = 0;
        for (int i = 0; i < seznamStudenti.size(); i++) {
            count++;
        }
        return count + 1;

    }


    public void addStudent() {
        /**
         * Metoda, která pomocí switche volá metody na příadní studentů do Arraylistu
         * @param i Proměnná ze vsupu která ukládá int
         */

        try {


            System.out.println("Vypis oboru:\n1.Technika\n2.Humanitni\n3.Kombinovane\nZadejte cislo oboru:");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    addTechnicky();
                    break;
                case 2:
                    addHumanitni();
                    break;
                case 3:
                    addKombinovany();
                    break;
                default:
                    System.out.println("Bud si nezadal číslo nebo si zadal číslo ve špátném rozsahu! Prosím zadej číslo v rozsahu 1-3.");
                    break;


            }
        }
        catch (Exception e){
            System.out.println("Nastala vyjimka typu "+e.toString());
            sc.nextLine();

        }


    }


    public void addTechnicky() throws InputMismatchException {

        /**
         * Metoda, která přídá  studenta Techniky do Arraylistu
         * @param i Proměnná ze vstupu která, ukládá datum narození
         * @param first Proměnná, která uloží jméno ze vstupu
         * @param second Proměnná, která uloží přijmení ze vstupu
         */

        Technika student = new Technika();
        System.out.println("Zadej jmeno studenta:");
        String first = sc.next();
        student.setName(first);
        String second = sc.next();
        student.setSurname(second);
        System.out.println("Zadej datum narozeni:");
        int i = sc.nextInt();
        if ((i < 32) && (i > 0)) {
            student.setDay(i);
        } else if ((i > 31) || (i < 1)) {
            System.err.println("Nezadal si dny v rozsahu v jakém mají být!");

        }
        i = sc.nextInt();
        if ((i < 13) && (i > 0)) {
            student.setMonth(i);
        } else if ((i > 12) || (i < 1)) {
            System.err.println("Nezadal si mesic v rozsahu v jakem má být!");

        }
        i = sc.nextInt();
        if ((i < 2010) && (i > 1915)) {
            student.setYear(i);
        } else if ((i > 2009) || (i < 1916)) {
            System.err.println("Nezadal si rok v rozsahu v jakém má být!");

        }
        student.setObor();
        student.setId(id());
        seznamStudenti.add(student);


    }

    public void addHumanitni() throws InputMismatchException {


        /**
         * Metoda, která přídá  studenta Humanitního oboru do Arraylistu
         * @i Proměnná ze vstupu, která ukládá datum narození
         * @first Proměnná, která uloží jméno ze vstupu
         * @second Proměnná, která uloží přijmení ze vstupu
         */

        Humanitni student = new Humanitni();
        System.out.println("Zadej jmeno studenta:");
        System.out.println("Zadej jmeno studenta:");
        String first = sc.next();
        student.setName(first);
        String second = sc.next();
        student.setSurname(second);
        System.out.println("Zadej datum narozeni:");
        int i = sc.nextInt();
        if ((i < 32) && (i > 0)) {
            student.setDay(i);
        } else if ((i > 31) || (i < 1)) {
            System.err.println("Nezadal si dny v rozsahu v jakém mají být!");

        }
        i = sc.nextInt();
        if ((i < 13) && (i > 0)) {
            student.setMonth(i);
        } else if ((i > 12) || (i < 1)) {
            System.err.println("Nezadal si mesic v rozsahu v jakem má být!");

        }
        i = sc.nextInt();
        if ((i < 2010) && (i > 1915)) {
            student.setYear(i);
        } else if ((i > 2009) || (i < 1916)) {
            System.err.println("Nezadal si rok v rozsahu v jakém má být!");

        }
        student.setObor();
        student.setId(id());
        seznamStudenti.add(student);


    }

    public void addKombinovany() throws InputMismatchException {
        /**
         * Metoda, která přídá  studenta Kombinovaného oboru do Arraylistu
         * @i Proměnná ze vstupu, která ukládá datum narození
         * @first Proměnná, která uloží jméno ze vstupu
         * @second Proměnná, která uloží přijmení ze vstupu
         */

        Kombinovane student = new Kombinovane();
        System.out.println("Zadej jmeno studenta:");
        String first = sc.next();
        student.setName(first);
        String second = sc.next();
        student.setSurname(second);
        System.out.println("Zadej datum narozeni:");
        int i = sc.nextInt();
        if ((i < 32) && (i > 0)) {
            student.setDay(i);
        } else if ((i > 31) || (i < 1)) {
            System.err.println("Nezadal si dny v rozsahu v jakém mají být!");

        }
        i = sc.nextInt();
        if ((i < 13) && (i > 0)) {
            student.setMonth(i);
        } else if ((i > 12) || (i < 1)) {
            System.err.println("Nezadal si mesic v rozsahu v jakem má být!");

        }
        i = sc.nextInt();
        if ((i < 2010) && (i > 1915)) {
            student.setYear(i);
        } else if ((i > 2009) || (i < 1916)) {
            System.err.println("Nezadal si rok v rozsahu v jakém má být!");

        }
        student.setObor();
        student.setId(id());
        seznamStudenti.add(student);


    }

    public void addMark() throws InputMismatchException {
        /**
         * Metoda, která přídá  studenotvi známku podle ID
         * @param id Proměnná ze vstupu, která ukládá ID studenta, kterému, chceme dát známku
         * @param i Proměnná na procházení Arraylistu a a následné hledání ID a zavolání metody addMark z třídy Vlastnosti
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student
         */

        System.out.println("Zadej ID studenta, kteremu chcete zadat znamku:");
        int id = sc.nextInt();
        int count = 0;
        for (Vlastnosti i : seznamStudenti) {
            if (i.getId() == id) {
                i.addMarks();
                count++;
                break;
            }

        }
        if (count != 1) {
            System.out.println("Zadáno špatné ID nebo student není v databázi!");
        }

    }

    public void removeStudent() {

        /**
         * Metoda, která odebere studenta podle ID
         * @param id Proměnná ze vstupu, která ukládá ID studenta, kterého chceme odebrat
         * @param i Proměnná na procházení Arraylistu a a následné hledání ID a odebrání studenta podle ID
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student
         */
        System.out.println("Zadej ID studenta, ktereho chcete odstranit:");
        int id = sc.nextInt();
        int count = 0;
        for (Vlastnosti i : seznamStudenti) {
            if (i.getId() == id) {
                seznamStudenti.remove(i);
                System.out.println("Student úspešně odebrán!");
                count++;
                break;
            }

        }

        if (count != 1) {
            System.out.println("Zadáno špatné ID nebo student není v databázi.");
        }
    }

    public void vypisStudent() {
        /**
         * Metoda, která vyhledá a vypíše studenta podle ID
         * @param id Proměnná ze vstupu, která ukládá ID studenta, kterého chceme vyhledat a vypsat
         * @param i Proměnná na procházení Arraylistu a a následné hledání ID a vypsáni studenta podle ID
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student
         */

        System.out.println("Zadej ID studenta, ktereho chcete zobrazit:");
        int id = sc.nextInt();
        int count = 0;
        for (Vlastnosti i : seznamStudenti) {
            if (i.getId() == id) {
                System.out.println(i.toString());
                count++;
                break;
            }

        }
        if (count != 1) {
            System.out.println("Zadáno špatné ID nebo student není v databázi!");
        }

    }

    public void abecedniVypis() {
        /**
         * Metoda, která volá metody na abecední výpis podle jednotlivých oborů
         */


        abecedniVypisTechnici();
        abecedniVypisHumanitni();
        abecedniVypisKombinovani();
    }


    private void abecedniVypisTechnici() {
        /**
         * Metoda, která zavolá třídu na třídění studentu Technického oboru podle abecedy a následně je vypíše
         * @param s Proměnná, která udává obor, který chceme procházet v kolekci
         * @param j Proměnná, která slouží na procházení Arraylisu a operace s ním jako například hledání oboru a pak výpis
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student v tom daném oboru nebo ne!
         */


        System.out.println("Vypis studentu technickeho oboru:");
        Collections.sort(seznamStudenti, new AbecedniRazeni());
        String s = "Technika";
        int count = 0;
        for (Vlastnosti j : seznamStudenti) {

            if (j.getObor() == s) {
                System.out.println(j);
                count++;
            }

        }
        if (count == 0) {
            System.out.println("Není žádný student technického oboru v databázi!");

        }

    }


    private void abecedniVypisHumanitni() {
        /**
         * Metoda, která zavolá třídu na třídění studentu Humanitního oboru podle abecedy a následně je vypíše
         * @param s Proměnná, která udává obor, který chceme procházet v kolekci
         * @param j Proměnná, která slouží na procházení Arraylisu a operace s ním jako například hledání oboru a pak výpis
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student v tom daném oboru nebo ne!
         */
        System.out.println("Vypis studentu humanitniho oboru:");
        Collections.sort(seznamStudenti, new AbecedniRazeni());
        String s = "Humanitni";
        int count = 0;
        for (Vlastnosti j : seznamStudenti) {

            if (j.getObor() == s) {
                System.out.println(j);
                count++;

            }
        }
        if (count == 0) {
            System.out.println("Není žádný student humanitního oboru v databázi!");

        }
    }

    private void abecedniVypisKombinovani() {
        /**
         * Metoda, která zavolá třídu na třídění studentu Kombinovaného oboru podle abecedy a následně je vypíše
         * @param s Proměnná, která udává obor, který chceme procházet v kolekci
         * @param j Proměnná, která slouží na procházení Arraylisu a operace s ním jako například hledání oboru a pak výpis
         * @param count Pomocná proměnná pro určení, jestli se tam nachází student v tom daném oboru nebo ne!
         */

        System.out.println("Vypis studentu kombinovaneho oboru:");
        Collections.sort(seznamStudenti, new AbecedniRazeni());
        String s = "Kombinovane";
        int count = 0;
        for (Vlastnosti j : seznamStudenti) {

            if (j.getObor() == s) {
                System.out.println(j);
                count++;

            }
        }
        if (count == 0) {
            System.out.println("Není žádný student kombinovaného oboru v databázi!");

        }
    }

    public void studijniPrumerOboru() {
        /**
         * Metoda, která zavolá metody na průměr oborů
         * @param c Proměnná, která zapíše návratovou hodnotu z metody prumerTechniku a následný výpis na obrazovku
         * @param k Proměnná, která zapíše návratovou hodnotu z metody prumerHumanitnich a následný výpis na obrazovku
         */

        double c = prumerTechniku();
        if (!Double.isNaN(c)) {
            System.out.println("Prumer studentu techniky:" + c);
        } else if (Double.isNaN(c)) {
            System.out.println("Neni zadny student technickeho oboru!");
        }
        double k = prumerHumanitnich();
        if (!Double.isNaN(k)) {
            System.out.println("Prumer studentu humanitniho oboru:" + k);
        } else if (Double.isNaN(k)) {
            System.out.println("Neni zadny student humanitniho oboru!");
        }
        // double d = prumerKombinovanych();
        //System.out.println("Prumer studentu kombinovaneho oboru:" + d);


    }

    private double prumerTechniku() {
        /**
         * Metoda, která počítá průměr techniků pomoci procházení kolekce
         * @param count Proměnná, která počítá počet studentů a pomáhá pak pří výpočtu aritmetického průměru
         * @param k Proměnná, která dělá ukládá součet známek
         * @param s Proměnná, která má definovaný obor, který budeme hledat v Arraylistu
         * @param i Proměnná, která prochazí atributy Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */
        double count = 0;
        double k = 0;
        String s = "Technika";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    for (int c = 0; c < i.marks.size(); c++) {
                        k += i.marks.get(c);
                        count++;
                    }

                }


            }

        }

        return (k / count);

    }

    private double prumerHumanitnich() {
        /**
         * Metoda, která počítá průměr humanitních pomoci procházení kolekce
         * @param count Proměnná, která počítá počet studentů a pomáhá pak pří výpočtu aritmetického průměru
         * @param k Proměnná, která dělá ukládá součet známek
         * @param s Proměnná, která má definovaný obor, který budeme hledat v Arraylistu
         * @param i Proměnná, která prochazí atributy Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */

        double count = 0;
        double k = 0;
        String s = "Humanitni";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    for (int c = 0; c < i.marks.size(); c++) {
                        k += i.marks.get(c);
                        count++;
                    }

                }


            }

        }
        return (k / count);


    }

    private double prumerKombinovanych() {
        /**
         * Metoda, která počítá průměr kombinovaných pomoci procházení kolekce, ale tuto metodu nepoužíváme.
         * @param count Proměnná, která počítá počet studentů a pomáhá pak pří výpočtu aritmetického průměru
         * @param k Proměnná, která dělá ukládá součet známek
         * @param s Proměnná, která má definovaný obor, který budeme hledat v Arraylistu
         * @param i Proměnná, která prochazí atributy Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */

        double count = 0;
        double k = 0;
        String s = "Kombinovane";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    for (int c = 0; c < i.marks.size(); c++) {
                        k += i.marks.get(c);
                        count++;
                    }

                }


            }

        }
        return (k / count);


    }

    public void pocetStudentu() {

        /**
         * Metoda, která volá metody na počítaní studentů jednotlivých oborů
         * @param c Proměnná, která uloží návratovou hodnotu z metody pocetTechniku a nasledné vypsaní na obrazovku
         * @param k Proměnná, která uloží návratovou hodnotu z metody pocetHumanitnich a nasledné vypsaní na obrazovku
         * @param d Proměnná, která uloží návratovou hodnotu z metody pocetKombinovanych a nasledné vypsaní na obrazovku
         */

        int c = pocetTechniku();
        if (c != 0) {
            System.out.println("Pocet studentu technickeho oboru:" + c);
        } else if (c == 0) {
            System.out.println("Neni zadny student technickeho oboru!");
        }
        int k = pocetHumanitnich();
        if (k != 0) {
            System.out.println("Pocet studentu humanitniho oboru:" + k);
        } else if (k == 0) {
            System.out.println("Neni zadny student humanitniho oboru!");
        }

        int d = pocetKombinovanych();
        if (d != 0) {
            System.out.println("Pocet studentu kombinovaneho oboru:" + d);
        } else if (k == 0) {
            System.out.println("Neni zadny student kombinovaneho oboru!");
        }


    }


    private int pocetTechniku() {

        /**
         * Metoda, která vypočítá počet studentů Technického oboru
         * @param count Proměnná, která obsahuje počet studentů a následně je použita jako návratová proměnná
         * @param s Proměnná ve které je uložený obor, ketý hledáme při prochazení kolekce
         * @param i Proměnná, která slouží k prochazení Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */

        int count = 0;
        String s = "Technika";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    count++;
                    break;
                }
            }
        }
        return count;

    }

    private int pocetHumanitnich() {

        /**
         * Metoda, která vypočítá počet studentů Humanitního oboru
         * @param count Proměnná, která obsahuje počet studentů a následně je použita jako návratová proměnná
         * @param s Proměnná ve které je uložený obor, ketý hledáme při prochazení kolekce
         * @param i Proměnná, která slouží k prochazení Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */

        int count = 0;
        String s = "Humanitni";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    count++;
                    break;
                }
            }
        }
        return count;


    }

    private int pocetKombinovanych() {

        /**
         * Metoda, která vypočítá počet studentů Kombinovaného oboru
         * @param count Proměnná, která obsahuje počet studentů a následně je použita jako návratová proměnná
         * @param s Proměnná ve které je uložený obor, ketý hledáme při prochazení kolekce
         * @param i Proměnná, která slouží k prochazení Arraylistu
         * @param j Proměnná v cyklu for, která pomáhá projít velikost Arraylistu
         */

        int count = 0;
        String s = "Kombinovane";
        for (Vlastnosti i : seznamStudenti) {

            for (int j = 0; j < seznamStudenti.size(); j++) {
                if (i.getObor() == s) {
                    count++;
                    break;
                }
            }
        }
        return count;


    }

    public void ulozeniSoubor() throws IOException {
        /**
         * Metoda, která výpíše Arraylist do textového souboru pomocí FileWriteru
         * @param i Proměnná, která slouží na pro cyklus for  pro zápis studentů z Arraylistu do textového souboru

         */
        //System.out.println("Aktuální adresář: " + System.getProperty("user.dir"));
        FileWriter fw = new FileWriter("D:\\ProjektX\\Databaze.txt");


        for (int i = 0; i < seznamStudenti.size(); i++) {

            fw.write(String.valueOf(seznamStudenti.get(i).toStringDatabaze()));
            fw.write("\n");

        }
        fw.close();
        if (seznamStudenti.size() == 0) {
            System.out.println("Neni zadny student v databazi, takze nebylo co ulozit do souboru!");
        }
        if (seznamStudenti.size() != 0) {
            if (seznamStudenti.size() > 1) {
                System.out.println("Studenti uspesne nacteni do databaze!");

            } else if (seznamStudenti.size() < 2) {
                System.out.println("Student uspesne nacten!");

            }
        }
    }


    public void nacteniSoubor() throws FileNotFoundException {

        /**
         * Metoda, která načte pomocí BufferReaderu dtabázi z textového souboru do Arraylistu pomocí line splitu
         * @param line Proměnná, která nám pomáhá při whilu přečíst celý řádek a následně ho zpracovat
         * @param svsSplitBy Proměnná která pomáhá rozdělovat údaje do atributu marks z třídy Vlastnosti pomocí čárky
         * @param split Proměnná, která rozděluje text pomocí středníku do různých atributů Arraylistu
         * @param parts Pole do kterého se ukládá rozkouskovaný text
         * @param i int do kterého parsujume Stringy z pole parts
         * @param marks pole do kterého ukládáme parts[3] a rozkouskujeme to na jednotliv0 známky
         * @param d pomocná proměnná do cyklu for, který prochazí atribut marks ze třídý vlastnosti
         * @param k int do kterého přeparsujeme formát String z pole marks[]
         * @param u double do kterého přeparsujeme údaje, které mají desetinnou čárku
         * @param count Pomocná proměnná, která nám zjištuje kolik studentu z databáze se načetlo.
         */
        //System.out.println("Aktuální adresář: " + System.getProperty("user.dir"));


        String File = "D:\\ProjektX\\Databaze.txt";
        String line = "";
        String cvsSplitBy = ",";
        String split = ";";
        int count = 0;


        try (BufferedReader br = new BufferedReader(new FileReader(File))) {

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(split);


                if (parts[7].equals("Humanitni")) {
                    Humanitni student = new Humanitni();
                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);

                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }
                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    double u = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(u);
                    student.setObor();
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;


                } else if (parts[7].equals("Kombinovane")) {
                    Kombinovane student = new Kombinovane();
                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);

                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }
                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    double u = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(u);
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;


                } else if (parts[7].equals("Technika")) {
                    Technika student = new Technika();

                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);
                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }

                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    double u = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(u);
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;

                }


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (count == 0) {
            System.out.println("Nebyl nacten zadny student!");
        }
        if (count != 0) {
            System.out.println("Počet načtených studentů:" + count);
        }

    }

    public void vymazaniZeSouboru() throws FileNotFoundException, IOException {

        /**
         * Metoda, která vymaže studenta z textového souboru pmocí jeho ID
         * @param currentLine Proměnná, která nám pomáhá při whilu přečíst celý řádek a následně ho zpracovat
         * @param a Proměnná do které zadáme studenta, kterého chceme vymazat
         * @param split Proměnná, která rozděluje text pomocí středníku do různých atributů Arraylistu
         * @param parts Pole do kterého se ukládá rozkouskovaný text s kterým následně pracujem
         * @param count Pomocná proměnná, která nám zjištuje jestli se student smazal nebo ne.
         */

        int count = 0;

        try {

            File databaze = new File("D:\\ProjektX\\Databaze.txt");
            File tempFile = new File("D:\\ProjektX\\Temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader("Databaze.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("Temp.txt"));

            System.out.println("Zadejte ID studenta, kterého chcete vymazat ze souboru:");


            String currentLine;
            String split = ";";

            String a = sc.next();


            while ((currentLine = reader.readLine()) != null) {


                String[] parts = currentLine.split(split);


                if (!(parts[0].equals(a))) {
                    writer.write(currentLine + System.getProperty("line.separator"));

                } else if (parts[0].equals(a)) {
                    System.out.println("Student byl uspesne smazan!");
                    count++;
                }

            }

            writer.close();
            reader.close();
            databaze.delete();
            tempFile.renameTo(databaze);

        } catch (IOException e) {
            e.printStackTrace();
        }

        if (count == 0) {
            System.out.println("Student se v souboru nenachazi, nebo nastala nějáká chyba!");
        }


    }


    public void vyhledaniStudentaAZapis() throws FileNotFoundException, IOException {
        /**
         * Metoda, která načte pomocí BufferReaderu vybraného studenta, kterého vyhledáme v textovém souboru
         * @param CurrentLine Proměnná, která nám pomáhá při whilu přečíst celý řádek a následně ho zpracovat
         * @param jmeno Tato proměnná slouží k uložení jména ze scanneru
         * @param prijmeni Tato proměnná slouží k uložení přijmení ze scanneru
         * @param svsSplitBy Proměnná která pomáhá rozdělovat údaje do atributu marks z třídy Vlastnosti pomocí čárky
         * @param split Proměnná, která rozděluje text pomocí středníku do různých atributů Arraylistu
         * @param parts Pole do kterého se ukládá rozkouskovaný text
         * @param i int do kterého parsujume Stringy z pole parts
         * @param marks pole do kterého ukládáme parts[3] a rozkouskujeme to na jednotliv0 známky
         * @param d pomocná proměnná do cyklu for, který prochazí atribut marks ze třídý vlastnosti
         * @param k int do kterého přeparsujeme formát String z pole marks[]
         * @param p double do kterého přeparsujeme údaje, které mají desetinnou čárku
         */


        try {

            BufferedReader reader = new BufferedReader(new FileReader("Databaze.txt"));

            System.out.println("Zadejte jméno a příjmení studenta, kterého chcete vypsat ze souboru:");


            int count = 0;

            String currentLine;
            String cvsSplitBy = ",";
            String split = ";";

            String jmeno = sc.next();
            String prijmeni = sc.next();

            while ((currentLine = reader.readLine()) != null) {


                String[] parts = currentLine.split(split);

                if (parts[1].equals(jmeno) && parts[2].equals(prijmeni) && parts[7].equals("Technika")) {
                    Technika student = new Technika();
                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);

                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }

                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    student.setObor();
                    double p = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(p);
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;
                    System.out.println("Výpis informací o studentovi: \n" + student.toString());
                } else if (parts[1].equals(jmeno) && parts[2].equals(prijmeni) && parts[7].equals("Humanitni")) {

                    Humanitni student = new Humanitni();
                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);

                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }


                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    student.setObor();
                    double p = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(p);
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;
                    System.out.println("Výpis informací o studentovi: \n" + student.toString());
                } else if (parts[1].equals(jmeno) && parts[2].equals(prijmeni) && parts[7].equals("Kombinovane")) {
                    Kombinovane student = new Kombinovane();
                    student.setId(id());
                    student.setName(parts[1]);
                    student.setSurname(parts[2]);
                    parts[3] = parts[3].replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(" ", "");
                    String[] marks = parts[3].split(cvsSplitBy);

                    for (int d = 0; d < marks.length; d++) {
                        if (!marks[d].equals("")) {
                            int k = Integer.parseInt(marks[d]);
                            student.setMarks(k);
                        }
                    }
                    int i = Integer.parseInt(parts[4]);
                    student.setDay(i);
                    i = Integer.parseInt(parts[5]);
                    student.setMonth(i);
                    i = Integer.parseInt(parts[6]);
                    student.setYear(i);
                    student.setObor();
                    double p = Double.parseDouble(parts[8]);
                    student.setStudijniPrumer(p);
                    student.setObor();
                    seznamStudenti.add(student);
                    count++;
                    System.out.println("Výpis informací o studentovi: \n" + student.toString());
                }


            }

            if (count == 0) {
                System.err.println("Zadali jste chybné, nebo neplatné jméno, nebo příjmení studenta. ");
            } else {

            }


        } catch (Exception e) {
            System.err.println("Chyba při čtení ze souboru.");
        }
    }


}





