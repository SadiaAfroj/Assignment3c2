package Stringreplace.java;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringReplaceRunner {
    public static void main(String[] args) {
        StringReplace stringReplace = new StringReplace();
        int newlegth = stringReplace.replace1();
        int newlength2= stringReplace.replace2();
        System.out.println(newlegth);
        System.out.println(newlength2);
    }


}
