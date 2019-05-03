package com.patrikkoncity;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Vlastnosti {


    /**
     * Abstraktní třída, která je takový vzor pro ty tři oborové třídy, tato třída má několik atributů, které slouží k různým poznávácím studenta.
     * Máme tu jeden arraylist typu integer, do kterého ukládáme známky studenta.
     * A spoustu dalších atributů například name,surname,id,day,month,obor,studijníPrumer.
     * Pak tu máme gettery a settery pro tyto atributy.
     * A pak taky nějáké metody, které jsme neomohli dát do třídy databáze a musely být tady.
     */

    ArrayList<Integer> marks = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;
    private String obor;
    private double studijniPrumer = 0.0;


    public void setMarks(int i) {
        marks.add(i);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getStudijniPrumer() {
        return studijniPrumer;
    }

    public void setStudijniPrumer(double studijniPrumer) {
        this.studijniPrumer = studijniPrumer;
    }

    public String getObor() {
        return obor;
    }

    public void setObor(String obor) {
        this.obor = obor;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + marks +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", obor='" + obor + '\'' +
                ", studijniPrumer=" + studijniPrumer +
                '}';
    }

    public String toStringDatabaze() {
        return id +
                ";" + name +
                ";" + surname +
                ";" + marks +
                ";" + day +
                ";" + month +
                ";" + year +
                ";" + obor +
                ";" + studijniPrumer;
    }


    public void addMarks() {
        /**
         * Metoda, která slouží k přidávání známek do Arraylistu marks a zároveň auromaticky spočítá studijní průměr objektu(studenta).
         * @param i int do kterého se ze scanneru nahraje známka, kterou chceme zadat
         * @param k double, který slouží k sečtení včech známek ve foru
         * @param count double který slouží k určení celkového počtu známek v Arraylistu marks.
         * @param j proměnná ve foru, která pomáhá ve foru projít celý Arraylist známek.
         */

        System.out.println("Zadej znamku:");
        int i = sc.nextInt();
        if( (i>0) && (i<6) ) {
            marks.add(i);
        }
        else if((i>5)|| (i<1)){
            System.err.println("Zadej známku v rozsahu 1-5");
        }
        double k = 0;
        double count = 0;
        for (int j = 0; j < marks.size(); j++) {
            k += marks.get(j);
            count++;

        }

        studijniPrumer = (k / count);

    }

    public void printMarks() {
        /**
         * Metoda která se nepoužívá, ale nechal jsem ji tady.Je to jenom for který prochází Arraylistu studenta a vypisuje známky na obrazovku.
         * @param i proměnná, která prochazí for.
         */


        for (int i = 0; i < marks.size(); i++) {

            System.out.println(marks.get(i));


        }
    }

    public String prestupnyRok() {

        /**
         * Metoda, lterá zjištuje, jestli se student narodil v přestupném roce.Slouží převážne jen k jednotkovým testům.
         *
         */

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Narodil ses v prestupnem roce!");
            return "Narodil ses v prestupnem roce!";
        } else if ((year % 100 == 0 && year % 400 == 0)) {
            System.out.println("Narodil ses v prestupnem roce!");
            return "Narodil ses v prestupnem roce!";
        } else {
            System.out.println("Nenarodil ses v prestupnem roce!");

        }
        return "Nenarodil ses v prestupnem roce!";
    }

    public String zodiac() {
        /**
         * Metoda která zjištuje znamení studenta, pomocí měsíce a dne, slouží především ke jednotkovým testům.Funguje pomocí switche, kde procházíme měsíce a pak if, else procházíme dny.
         */

        switch (month) {
            case 1:
                if (day < 21) {
                    System.out.println("Capricornus");
                    return "Capricornus";
                } else if (day > 20) {
                    System.out.println("Aquarius");
                    return "Aquarius";
                }
                break;
            case 2:
                if (day < 21) {
                    System.out.println("Aquarius");
                    return "Aquarius";
                } else if (day > 20) {
                    System.out.println("Pisces");
                    return "Pisces";
                }
                break;
            case 3:
                if (day < 21) {
                    System.out.println("Pisces");
                    return "Pisces";
                } else if (day > 20) {
                    System.out.println("Aries");
                    return "Aries";
                }

                break;
            case 4:
                if (day < 21) {
                    System.out.println("Arie");
                    return "Arie";
                } else if (day > 20) {
                    System.out.println("Taurus");
                    return "Tarus";
                }
                break;
            case 5:
                if (day < 22) {
                    System.out.println("Taurus");
                    return "Taurus";
                } else if (day > 21) {
                    System.out.println("Gemini");
                    return "Gemini";
                }
                break;
            case 6:
                if (day < 22) {
                    System.out.println("Gemini");
                    return "Gemini";
                } else if (day > 21) {
                    System.out.println("Cancer");
                    return "Cancer";
                }
                break;
            case 7:
                if (day < 23) {
                    System.out.println("Cancer");
                    return "Cancer";
                } else if (day > 22) {
                    System.out.println("Lion");
                    return "Lion";
                }
                break;
            case 8:
                if (day < 23) {
                    System.out.println("Lion");
                    return "Lion";
                } else if (day > 22) {
                    System.out.println("Virgo");
                    return "Virgo";
                }
                break;
            case 9:
                if (day < 23) {
                    System.out.println("Virgo");
                    return "Virgo";
                } else if (day > 22) {
                    System.out.println("Libra");
                    return "Libra";
                }
                break;
            case 10:
                if (day < 24) {
                    System.out.println("Libra");
                    return "Libra";
                } else if (day > 23) {
                    System.out.println("Scorpio");
                    return "Scorpio";
                }

                break;
            case 11:
                if (day < 23) {
                    System.out.println("Scorpio");
                    return "Scorpio";
                } else if (day > 22) {
                    System.out.println("Sagittarius");
                    return "Sagittarius";

                }
                break;
            case 12:
                if (day < 22) {
                    System.out.println("Sagittarius");
                    return "Sagittarius";
                } else if (day > 21) {
                    System.out.println("Capricornus");
                    return "Capriconus";
                }
                break;
            default:
                System.out.println("Nejaka chybicka se vloudila");
                break;

        }
        return "False";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vlastnosti)) return false;
        Vlastnosti that = (Vlastnosti) o;
        return id == that.id &&
                day == that.day &&
                month == that.month &&
                year == that.year &&
                Objects.equals(name, that.name) &&
                Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, surname, marks, day, month, year, obor, studijniPrumer, sc);
    }


}
