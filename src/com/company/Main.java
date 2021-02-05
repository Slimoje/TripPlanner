package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    ArrayList<Trip> trips = new ArrayList<Trip>();
        Boolean continueProgram = true;
        while(continueProgram){
            System.out.println("Menu:" + "\n(1) Create trip." + "\n(2) List trips." + "\n(3) Exit program.");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    createTrip(scan, trips);
                    break;
                case 2:
                    System.out.println(trips);
                    break;
                case 3:
                    System.out.println("System closing down, goodbye");
                    continueProgram = false;
                    break;
                default:
                    System.out.println("Not an option.");
                    break;
            }
        }
    }
    private static void createTrip(Scanner scan, ArrayList<Trip> trips){
        System.out.println("Type triptype, ski or beach:");
        String tripType = scan.next();
        if(tripType.equalsIgnoreCase("ski")){
            System.out.println("Type destination (country): ");
            String co = scan.next();
            System.out.println("Type duration (days): ");
            Integer du = scan.nextInt();
            System.out.println("Type number of participants: ");
            Integer pa = scan.nextInt();
            System.out.println("Type means of transportation, bus or plane");
            String ans = scan.next();
            Boolean tr;
            if(ans.equalsIgnoreCase("bus")){
                tr = true;
            }
            tr = false;
            System.out.println("Type if ski rent is needed, yes or no: ");
            String rent = scan.next();
            Boolean sk;
            if(rent.equalsIgnoreCase("yes")){
                sk = true;
            }else{
                sk = false;
            }
            System.out.println("Type hotelname: ");
            String ho = scan.next();
            SkiTrip newSkiTrip = new SkiTrip(co, du, pa, tr, sk, ho);
            trips.add(newSkiTrip);
        }else{
            System.out.println("Type destination (country): ");
            String co = scan.next();
            System.out.println("Type duration (days): ");
            Integer du = scan.nextInt();
            System.out.println("Type number of participants: ");
            Integer pa = scan.nextInt();
            System.out.println("Type means of transportation, bus or plane");
            String ans = scan.next();
            Boolean tr;
            if(ans.equalsIgnoreCase("bus")){
                tr = true;
            }
            tr = false;
            System.out.println("Do you want sightseeing? yes or no");
            String sightSeeing = scan.next();
            Boolean ss;
            if(sightSeeing.equalsIgnoreCase("yes")){
                ss = true;
            }else {
                ss = false;
            }
            System.out.println("Do you want sunbed(s)? yes or no");
            String sunbed = scan.next();
            Boolean sb;
            if(sunbed.equalsIgnoreCase("yes")){
                sb = true;
            }else {
                sb = false;
            }
            BeachTrip newBeachTrip = new BeachTrip(co, du, pa, tr, ss, sb);
            trips.add(newBeachTrip);

        }


    }




    }
    /*private Trip declareBasicTripInfo(Scanner scan){
        System.out.println("Type destination (country): ");
        String co = scan.next();
        System.out.println("Type duration (days): ");
        Integer du = scan.nextInt();
        System.out.println("Type number of participants: ");
        Integer pa = scan.nextInt();
        System.out.println("Type means of transportation, bus or plane");
        String ans = scan.next();
        Boolean tr;
        if(ans.equalsIgnoreCase("bus")){
            tr = true;
        }
        tr = false;
        return new Trip(co, du, pa, tr);

    }*/

