package Chapter2;

import Chapter2.DrumKit;

/**
 * Created by hasnake on 4/19/18.
 */
public class DrumKitTestDrive {
    public static void main (String[] args){

        DrumKit d= new DrumKit();
        d.playSnare();
        d.snare=false;
        d.playTopHat();

        if (d.snare==true){
            d.playSnare();
        }
    }
}
