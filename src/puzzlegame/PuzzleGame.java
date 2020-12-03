
package puzzlegame;

import java.util.Scanner;

public class PuzzleGame {

            public static char room = 'm';
            public static int key = 0;
            public static int s = 0;

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        for( s = 0; s < 1; s--){
            if(room == 'n'){
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |  you  |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
            System.out.println("---------  ---------  ---------");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("---------  ---------  ---------");
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
                north();
            } else if(room == 's') {
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
            System.out.println("---------  ---------  ---------");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("---------  ---------  ---------");
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |  you  |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
                south();
            } else if(room == 'e'){
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
            System.out.println("---------  ---------  ---------");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |       |  |  you  |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("---------  ---------  ---------");
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
                east();
            } else if(room == 'w'){
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
            System.out.println("---------  ---------  ---------");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|  you  |  |       |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("---------  ---------  ---------");
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
                west();
            } else if(room == 'm'){
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
            System.out.println("---------  ---------  ---------");
            System.out.println("|       |  |       |  |       |");
            System.out.println("|       |  |  you  |  |       |");
            System.out.println("|       |  |       |  |       |");
            System.out.println("---------  ---------  ---------");
            System.out.println("           ---------   ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           |       |     ");
            System.out.println("           ---------   ");
                middle();
            }
        }

        
        }
    public static void north(){
                Scanner input = new Scanner (System.in);
                
    System.out.println("In the room are three keys, which one will you pick? (1 - 3)");
    key = input.nextInt();
    if((key > 3)||(key < 1)){
        for(int i = 0; i < 1 ; i--){
            System.out.println("There's no key " + key + ", choose another one");
            key = input.nextInt();
            if((key > 3)||(key < 1)){
                
            } else {
                i = 3;
            }
                }
    }
    System.out.println("Do you want to go back? (y/n)");
    char ans = input.next().charAt(0);
    if(ans == 'y'){
        room = 'm';
    } else {
        north();
    }
    }
    public static void south(){
        Scanner input = new Scanner (System.in);
        System.out.print("In the room is a box with a single lock");
        if(key < 1){
            System.out.println(" but you don't have a key to use");
        } else {
            System.out.println(", will you use your key?(y/n)");
            char ans = input.next().charAt(0);
            if(ans == 'y'){
                if(key == 2){
                    System.out.println("The box has opened, inside is a 6");
                } else {
                    System.out.println("The key didn't fit");
                }
            }
        }
        System.out.println("Do you want to go back?(y/n)");
        char ans = input.next().charAt(0);
        if(ans == 'y'){
            room = 'm';
        } else {
            south();
        }
    }
    public static void east(){
        Scanner input = new Scanner (System.in);
        System.out.println("In the room are countless items and a riddle");
        System.out.println("What has to be broken before you use it?");
        String ans = input.next();
        if(ans.equals("egg")){
        System.out.println("You break open the egg and inside is a piece of paper with the number 4 on it");
    } else {
            System.out.println("Wrong item");
        }
        System.out.println("Do you want to go back?(y/n)");
        char x = input.next().charAt(0);
        if(x == 'y'){
            room = 'm';
        } else{
            east();
        }
    }
    public static void west(){
     Scanner input = new Scanner (System.in);
     System.out.println("In the room is a type writer, it says:");
     System.out.println("50 men drive down a road, 10 of them turn right down one road, a quarter of the rest turn left down another road");
     System.out.println("How many don't go down either of the roads?");
     int x = input.nextInt();
     if(x == 30){
         System.out.println("You type it in and the paper moves upwards revealing a 7");
     } else {
         System.out.println("You type it in but nothing happens");
     }
     System.out.println("Do you want to go back?(y/n)");
     char ans = input.next().charAt(0);
     if(ans == 'y'){
         room = 'm';
     } else {
         west();
     }
    }
    public static void middle(){
        Scanner input = new Scanner (System.in);
        System.out.println("There's a door locked by a pin, there's a keypad with the 5 worn out, what's the pin to escape?");
        int pin = input.nextInt();
        if(pin == 5476){
            System.out.println("The door opens and you escape");
            s = 4;
        } else {
            System.out.println("The door remains closed");
            System.out.println("Do you want to leave the room?(y/n)");
            char ans = input.next().charAt(0);
            if(ans == 'y'){
            System.out.println("Which direction do you want to go?(n,s,e,w)");
            room = input.next().charAt(0);
            if((room != 'n')&&(room != 's')&&(room != 'e')&&(room != 'w')){
                for(int v = 0; v < 1; v--){
                    System.out.println("Incorrect direction, try again");
                    if((room != 'n')&&(room != 's')&&(room != 'e')&&(room != 'w')){
                        System.out.println("Incorrect direction, try again");
                    } else {
                        v = 3;
                    }
                }
            }
        } else {
                middle();
            }
    }
}
}