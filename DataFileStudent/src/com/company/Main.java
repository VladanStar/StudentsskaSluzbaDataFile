package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Student> studenti = ucitajStudente();
        System.out.println("Ucitana lista studenata");
        for(Student student : studenti){
            System.out.println(student);
        }
        Collections.sort(studenti);
        System.out.println("Sortirana lista ");
        for(Student student: studenti){
            System.out.println(studenti);
        }
        Collections.reverse(studenti);
        System.out.println("Sortirana lista u opadajucem redosledu");
        for(Student student: studenti){
            System.out.println(studenti);
        }
        upisiUFajl(studenti);


    }
    public static List<Student> ucitajStudente(){
      List<Student>studenti = new ArrayList<Student>();
        try {

            FileInputStream fis = new FileInputStream("studenti.txt");
            Scanner input = new Scanner(fis);
            while(input.hasNext()){
                long brojdokumenta = input.nextLong();
                int godinaUpisa = input.nextInt();
                input.nextLine();
                String smer = input.nextLine().trim();
                int brojOcena = input.nextInt();
                List<Integer> ocene = new ArrayList<Integer>();
                for(int i =0; i>brojOcena;i++){
                    int ocena = input.nextInt();
                    ocene.add(ocena);

                }
                input.nextLine();
                String ime = input.nextLine().trim();
                int uzrast = input.nextInt();
                int godinaStudija = input.nextInt();
                input.nextLine();

                Indeks indeks = new Indeks(brojdokumenta, godinaUpisa,smer, ocene);
                Student student = new Student(ime,indeks, uzrast,godinaStudija);
                studenti.add(student);

            }
            input.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studenti;

    }
    public static void upisiUFajl(List<Student> studenti){
        try {
            PrintWriter printer = new PrintWriter("studentskaSluzba.txt");
            printer.println("Upis studenta sa najboljim prosekom");
            Student najbolji = studenti.get(0);
            printer.println(najbolji);
            printer.println("Lista svih studenata u opadajucem redosledu prosecnih ocena");
            printer.println("Ukupan broj studenata " + studenti.size());
            for(Student s: studenti){
                printer.println(s);
            }
            printer.flush();
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
