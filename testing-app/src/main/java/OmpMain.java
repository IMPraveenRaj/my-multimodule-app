import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OmpMain {

//    Audi A4 Blue     10000
//    Audi A4 Red      31000
//    Audi A4 Blue     50000
//    Audi A6 Blue     7000
//    Audi A6 Green    4000
//    Mercedes C220 Blue 10000
//    Mercedes C220 Red   31000
//    Mercedes C320 Blue  50000
//    BMW 520i Blue       7000
//    VW Beetle Green     4000

    public static String[][] cars(){

        String cars[][] = {{"1", "Audi", "A4", "Blue", "10000"},
                {"2", "Audi", "A4", "Silver", "3000"},
                {"3", "Audi", "A4", "Red", "31000"},
                {"4", "Audi", "A4", "Blue", "50000"},
                {"5", "Audi", "A6", "Silver", "4000"},
                {"6", "Audi", "A6", "Blue", "7000"},
                {"7", "Audi", "A6", "Green", "4000"},
                {"8", "Mercedes", "C220", "Blue", "10000"},
                {"9", "Mercedes", "C220", "Silver", "3000"},
                {"10", "Mercedes", "C220", "Red", "31000"},
                {"11", "Mercedes", "C320", "Blue", "50000"},
                {"12", "BMW", "320d", "Silver", "4000"},
                {"13", "BMW", "520i", "Blue", "7000"},
                {"14", "VW", "Beetle", "Green", "4000"}};
        return  cars;

    }



    public static void main(String[] args) {

        String[][] Listofcars = OmpMain.cars();
        System.out.println(Listofcars);
        //let select the car in the List
        int maxMileage=Integer.MAX_VALUE;
        String[] selectedcar={};
        for(String[] car: Listofcars){
            int mileage = Integer.parseInt(car[4]);
            String color= car[3];;
            System.out.println("car color"+color+" and mileage is"+mileage);
            if(color.equalsIgnoreCase("Silver")){
                if(mileage<maxMileage){
                    maxMileage=mileage;
                    selectedcar=car;
                }

            }
        }

        Arrays.stream(selectedcar).forEach(car-> System.out.println("selected car is"+car));

      //  Arrays.stream(Listofcars).flatMap(cars->Arrays.stream(cars)).forEach(car-> System.out.print(car));
    }
}
