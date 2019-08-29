package com.sda.paul.advanced.recapitulare.recap;

import java.util.*;

public class CollectionMain {

    public static void main(String[] args) {
        //(int age, String name, Gender gender, double salary, String subject
        Professor professor1= new Professor(4000,"latina");
        Professor professor2= new Professor(2000,"fizica");
        Professor professor3= new Professor(3000, "matematica");

        List<Professor> professors =new ArrayList<Professor>();
        professors.add(professor1);
        professors.add(professor2);
        professors.add(professor3);

        System.out.println(professors.get(professors.size()-1));

        /// SET ///

        Set<Professor>professorSet= new HashSet<Professor>();

        professorSet.add(professor1);
        professorSet.add(professor2);
        professorSet.add(professor3);

        System.out.println(professorSet);


        ////MAP///



        Map<String, Professor> professorMap = new HashMap<String, Professor>();
        professorMap.put("Cluj Napoca",new Professor(22,"ppppp"));
        professorMap.put("Bucuresti",new Professor(1000,"jjjjj"));
        professorMap.put("Timisoara",new Professor(234,"gggg"));

        System.out.println(professorMap);

        Map<Professor, String> cityMap = new HashMap<Professor, String>();
//        professorMap.put(prof1, "Cluj");

        professorMap.get("Zalau"); // citeste element cand stii cheia

        //  cand vreau sa parcurg elementele si nu stiu ce element vreau (nu stiu cheia)
        // Entry = un element din map de forma cheie si valoare
        // De exemplu pentru elementul: "Buc", professor1
        //    entry.getKey() = "Buc"
        //    entry.getValue() = professor1;
        for (Map.Entry<String,Professor> entry : professorMap.entrySet() ) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        // System.out.println(professorMap);














    }
}
