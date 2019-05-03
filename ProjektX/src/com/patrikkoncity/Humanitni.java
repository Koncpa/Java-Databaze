package com.patrikkoncity;

public class Humanitni extends Vlastnosti {


    /**
     *Třída, která vychází z abstrakntí třídy Vlastonosti akorát s tím rozdílem, že tady je nastaven na setteru obor Humanitni. A podle toho studenty rozpoznáme.
     *Nejsou tady žádne speciální metody, jenom gettery a settery a když jo, tak jejich funkčnost je popsána v abstraktní trídě Vlastnosti
     *
     */


    public void setObor() {

        String obor = "Humanitni";
        super.setObor(obor);
    }

    @Override
    public void setMarks(int i) {
        super.setMarks(i);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public int getDay() {
        return super.getDay();
    }

    @Override
    public void setDay(int day) {
        super.setDay(day);
    }

    @Override
    public int getMonth() {
        return super.getMonth();
    }

    @Override
    public void setMonth(int month) {
        super.setMonth(month);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public double getStudijniPrumer() {
        return super.getStudijniPrumer();
    }

    @Override
    public void setStudijniPrumer(double studijniPrumer) {
        super.setStudijniPrumer(studijniPrumer);
    }

    @Override
    public String getObor() {
        return super.getObor();
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void addMarks() {
        super.addMarks();
    }

    @Override
    public void printMarks() {
        super.printMarks();
    }

    @Override
    public String zodiac() {
       return super.zodiac();
    }

    @Override
    public String prestupnyRok() {

        System.out.println("Nejsi schopen toto umět!");
        return "Nejsi schopen toto umět!";
    }
}
