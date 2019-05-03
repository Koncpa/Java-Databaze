package com.patrikkoncity;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


/**
 * JavaDoc
 **/

/**
 * @author Patrik Koncity <xkonci03@vutbr.cz>
 * @version 1.8
 * @since 2018-03-20
 * <p>
 * Jedná se o databázový program, který jsem vytvořil, jedná se o databázi studentů a různé operace s nimi.
 * Tento program jsem vytvořil skoro svépomocí, ale u některých algoritmů jsem se musel inspirovat na <stackoverflow.com>.
 * <p>

 */

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

/**
 * Vytvořili jsme zde objekty do tříd Databáze a také objekt scanner pro vstup.
 * Vytvořili jsme while do kterého je zacyklený switch který nám nabízí různé možnosti, podle toho jakou metodu chceme z třídy Databáze použít.
 * @param  konec Boolean, který pomáha projížted while dokud má hodnotu true.
 * @param   i Promena do ktere zadáváme nějáký vstup od uživatele.
 */


        Databaze db = new Databaze();
        Scanner sc = new Scanner(System.in);

        System.out.println("Volby:\n0.Vypis operaci\n1.Pridani studenta\n2.Zadani znamky\n3.Propusteni studenta\n4.Hledani studenta podle ID\n5.Abecedni vypis studentu\n6.Vypis studijniho prumeru skupiny\n7.Vypis poctu studentu\n8.Ulozeni databaze do soubory\n9.Nacteni databaze ze souboru\n10.Vymazani studenta ze souboru\n11.Nacteni a vyhledani studenta ze souboru\n12.Konec");
        boolean konec = true;
        while (konec == true) {
            System.out.println("Zadejte operaci:");
            int i = sc.nextInt();
            switch (i) {
                case 0:
                    System.out.println("Volby:\n0.Vypis operaci\n1.Pridani studenta\n2.Zadani znamky\n3.Propusteni studenta\n4.Hledani studenta podle ID\n5.Abecedni vypis studentu\n6.Vypis studijniho prumeru skupiny\n7.Vypis poctu studentu\n8.Ulozeni databaze do soubory\n9.Nacteni databaze ze souboru\n10.Vymazani studenta ze souboru\n11.Nacteni a vyhledani studenta ze souboru\n12.Konec");
                    break;
                case 1:
                    db.addStudent();
                    break;
                case 2:
                    try {
                        db.addMark();
                    }
                    catch(InputMismatchException e){
                        System.out.println("Nastala vyjimka typu" + e.toString());
                    }
                    break;
                case 3:
                    db.removeStudent();
                    break;
                case 4:
                    db.vypisStudent();
                    break;
                case 5:
                    db.abecedniVypis();
                    break;
                case 6:
                    db.studijniPrumerOboru();
                    break;
                case 7:
                    db.pocetStudentu();
                    break;
                case 8:
                    try {
                        db.ulozeniSoubor();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 9:
                    try {
                        db.nacteniSoubor();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;
                case 10:
                    try {
                        db.vymazaniZeSouboru();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 11:
                    try {
                        db.vyhledaniStudentaAZapis();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                case 12:
                    System.out.println("Konec!");
                    konec = false;
                    break;
                default:
                    System.out.println("Bud si nezadal číslo nebo si zadal číslo ve špátném rozsahu! Prosím zadej číslo v rozsahu 0-13.");
                    break;

            }
        }

    }


}
