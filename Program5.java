
//Your code here
public class Program5{
    public static void main(String[] args) {
        int royalemiles = 286;
        int koopakingmiles = 412;
        int pipeframemiles = 361;
        int badwagonmiles = 161;
        
        int royalegallon = 9;
        int koopakinggallon = 40;
        int pipeframegallon = 18;
        int badwagongalllon = 11;
        
        double royaleMPG = (double) royalemiles/royalegallon;
        royaleMPG = (int)(royaleMPG * 10 + .5)/10.0;
        double koopakingMPG = (double) koopakingmiles/koopakinggallon;
        koopakingMPG = (int)(koopakingMPG * 10 + .5)/10.0;
        double pipeframeMPG = (double) pipeframemiles/pipeframegallon;
        pipeframeMPG = (int)(pipeframeMPG * 10 + .5)/10.0;
        double badwagonMPG = (double) badwagonmiles/badwagongalllon;
        badwagonMPG = (int)(badwagonMPG * 10 + .5)/10.0;
        
        System.out.println("Mushroom Cup Prix Racer Average Miles/Per Gallon:");
        System.out.println();
        System.out.println("Royale averaged " + royaleMPG + " m/g");
        System.out.println();
        System.out.println("Koopa King averaged " + koopakingMPG + " m/g");
        System.out.println();
        System.out.println("Pipe Frame averaged " + pipeframeMPG + " m/g");
        System.out.println();
        System.out.println("Badwagon averaged " + badwagonMPG + " m/g");
        
        
        
        
        
        
        
        
        
    }
}
//Paste console output below:
/*
Mushroom Cup Prix Racer Average Miles/Per Gallon:

Royale averaged 31.8 m/g

Koopa King averaged 10.3 m/g

Pipe Frame averaged 20.1 m/g

Badwagon averaged 14.6 m/g

*/
