package Driver;

import Model.Automotive;
import Util.FileIO;



public class Main 
{
    public static void main(String[] args) 
    {
        FileIO io = new FileIO("FordZTW.txt"); 
        System.out.printf("\nOriginal Object's data before serialization.\n\n");
        Automotive FordZTW = io.readFile(); 
        FordZTW.printModel(); 
        
        
       // Automotive FordZTW = io.readFile(); 
//        Automotive FordZTW = new Automotive();
//        FordZTW.setCarModel("Accord");
//        FordZTW.setBasePrice(9999);
//        FordZTW.setOptionSetSize(3);
//        FordZTW.setOptionsetName(0,"Brake");
//        FordZTW.setOptionsetName(1,"color");
//        //FordZTW.setOptionsetName(2,"moonroof");
//        FordZTW.setOptionsetName(2,"Transmission");
//        //FordZTW.setOptionsetName(4,"window");
//        FordZTW.AutoaddOptionCountToOptionSet(0, 2);
//        FordZTW.AutoaddOptionCountToOptionSet(1, 4);
//        FordZTW.AutoaddOptionCountToOptionSet(2, 2);
//        
//        FordZTW.AutoaddOptionToOptionSet(0, 0, "raj", 10);
//        FordZTW.AutoaddOptionToOptionSet(0, 1, "hari", 30);
//        FordZTW.AutoaddOptionToOptionSet(1, 0, "red", 11);
//        FordZTW.AutoaddOptionToOptionSet(1, 1, "blue", 22);
//        FordZTW.AutoaddOptionToOptionSet(1, 2, "green", 33);
//        FordZTW.AutoaddOptionToOptionSet(1, 3, "yellow", 44);
//        FordZTW.AutoaddOptionToOptionSet(2, 0, "manual", 00);
//        FordZTW.AutoaddOptionToOptionSet(2, 1, "automatic", 500);
//        FordZTW.printModel(); 
        
       // System.out.printf("\nNew Object's data after serialization and deSerialization.\n\n");
       // io.serializeAutomotive(FordZTW); 
       // io.deserializeAutomotive("FordZTW.ser").printModel(); 
    }
}


