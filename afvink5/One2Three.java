/**
 * Translator voor de opdracht One2Three Gebruik deze code ongewijzigd om een
 * vertaler te maken van de eenletterige code voor een aminozuur naar de
 * drieletterige code van een aminozuur.
 *
 * @Author Martijn van der Bruggen
 * @Date 21-November-2008 7-december-2012 Toevoeging extra commentaar ten
 * aanzien van opzet
 *
 */
package afvink5;

public class One2Three {

    /**
     * Declaratie en initialisatie van arrays Met opzet niet de meest effectieve
     * datastructuur gekozen maar wel een inzichtelijke datastructuur
     */
    static final String[] ONE = {"A", "R", "N", "D", "C", "Q", "E", "G", "H", "I", "L", "K", "M", "F", "P", "S", "T", "W", "Y", "V"};
    static final String[] THREE = {"ALA", "ARG", "ASN", "ASP", "CYS", "GLN", "GLU", "GLY",
        "HIS", "ILE", "LEU", "LYS", "MET", "PHE", "PRO", "SER",
        "THR", "TRP", "TYR", "VAL"
    };
    static final String[] FAKE = {"B","J","O","U","X","Z"};

    public static String one2three(String symbol) throws NotAnAA {
        String threeCode = "";
        for (int i = 0; i < ONE.length; i++) {
            if (ONE[i].equals(symbol)) {
                threeCode = THREE[i];
            }
        }
//        System.out.println(threeCode);
//        for (int j = 0; j < THREE.length; j++){
////            if(threeCode.equals("MET")){
//            if(FAKE[j].equals("B")){
//                System.out.println("hoi B" );
//            }
//        }
        
        if (threeCode.equals("")) {
            throw new NotAnAA("Dit is een niet bestaand aminozuur: " + symbol);
        }
        return threeCode;
    }
    
    public static String three2one(String symbol) throws NotAnAA {
        String oneCode = "";
        for (int i = 0; i < THREE.length; i++) {
            if (THREE[i].equals(symbol)) {
                oneCode = ONE[i];
            }
        }
//        for (int j = 0; j < THREE.length/4; j++){
//            if(threeCode.substring(0,3).equals("")){
//                System.out.println("hoi " + symbol);
//            }
//        }
//        System.out.println(oneCode);
        if (oneCode.equals("")) {
            throw new NotAnAA("Dit is een niet bestaand aminozuur: " + symbol);
        }
        return oneCode;
    }
}

/**
 * Class met custom exception
 *
 * @Author Martijn van der Bruggen
 * @Date 21-November-2008 Deze class staat in hetzelfde bestand als translator
 * Merk op dat deze class niet public is, hetgeen voorwaardelijk is om in een
 * bestand met een andere naam te staan. Custom exceptions overerven altijd van
 * Exception
 */
class NotAnAA extends Exception {

    /**
     * Overschrijven van de constructor van Exception
     */
    public NotAnAA() {
        /**
         * call van de constructor van de super class: Exception
         */
        super();
    }

    public NotAnAA(String err) {
        super(err);
    }
}
