
package pkg99bottles;


public class BeerSong {


    public static void main(String[] args) {
        Ninety_Nine_Bottles_Of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_Of_Beer() {
        
        int bottles = 99;
        while (bottles>0){
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer");
            bottles--;
            if (bottles ==0){
            System.out.println("Take one down, pass it around, no more bottles of beer on the wall");
            } else{
            System.out.println("Take one down, pass it around, " + bottles + " bottles of beer on the wall");    
            }
            
        }
    
    }
    
}