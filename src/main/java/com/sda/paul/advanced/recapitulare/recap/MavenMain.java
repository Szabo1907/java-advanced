package com.sda.paul.advanced.recapitulare.recap;

public class MavenMain {

    public static void main(String[] args) {

        // facem o pers Person care are
        //age = 22,name didi , gender = f

        Person person = new Person(22,"didi", Gender.FEMALE);
        System.out.println(person);

        Person person1 = new Person();
        person1.setAge(22);
        person1.setName("didi");
        person1.setGender(Gender.FEMALE);
        System.out.println(person1);

        if(person.equals(person1)){

            System.out.println("are equal");

        }else {
            System.out.println("not equal");
        }

        String name = "  ";

   //    System.out.println(name.isEmpty());
   //    boolean isBlank = StringUtils.isBlank(name);
  //      System.out.println(isBlank);
    }
}
