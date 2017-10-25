/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afinkopdracht6;

import static afinkopdracht6.ProteineAnalysator.Polair;
import static afinkopdracht6.ProteineAnalysator.APolair;

/**
 *
 * @author BramWeenink
 */
public class analysator extends Exception {
    
    public static void percentageCalculator(){
        
    try {
            int PolairCount = 0;
            String input1 = jTextArea1.getText().toUpperCase();
            for (int i = 0; i < input1.length(); i++) {
                for (int j = 0; j < Polair.length; j++) {
                    char Aminozuur = input1.charAt(i);
                    String a = String.valueOf(Aminozuur);
                    String b = String.valueOf(Polair[j]);
                    if(a.equals(b)){
                        PolairCount++;
                    }
                }
            }
            System.out.println(PolairCount);
            float Polairpercentage = ((float)PolairCount/input1.length()*100);
            jProgressBar1.setValue((int)Polairpercentage);
            jProgressBar2.setValue(100-(int)Polairpercentage);

            int APolairCount = 0;
            String input2 = jTextArea1.getText().toUpperCase();
            for (int k = 0; k < input2.length(); k++) {
                for (int l = 0; l < APolair.length; l++) {
                    char Aminozuur = input2.charAt(k);
                    String c = String.valueOf(Aminozuur);
                    String d = String.valueOf(APolair[l]);
                    if(c.equals(d)){
                        APolairCount++;
                    }

                }
            }
            System.out.println(APolairCount);
            
            String Totaal = String.valueOf(input1.length());
            jTextField1.setText(Totaal);
            
            
//            jPanel1

        } catch (NonAminoException) {
            System.out.println("De Sequentie bevat een niet bestaand Aminozuur!");
        }
    }
}
