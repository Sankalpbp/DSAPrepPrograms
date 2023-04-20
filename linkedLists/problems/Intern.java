public class Intern {

    public static void printString ( boolean condition ) {
        System.out.println ( condition );
    }

    public static void main ( String [] args ) {
        String s = new String ( "durga" );
        String sIntern = s.intern ();

        String sScp = "durga";

        printString ( s == sIntern );
        printString ( s == sScp );
        printString ( sIntern == sScp );
    }
}
