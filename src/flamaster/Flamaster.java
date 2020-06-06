
package flamaster;

public class Flamaster {
    
    public static void Kompresja_zapisu_wyrazu(String[] tablica_wyrazów){
        
        for (int i = 0; i < tablica_wyrazów.length; i++) {
        
            char[] tablica_znaków_wyrazu = tablica_wyrazów[i].toCharArray();
        
            int liczba_liter = 1;
            String nowy_wyraz = "";
        
            for (int j = 0; j < tablica_znaków_wyrazu.length; j++) {
                if (j != tablica_znaków_wyrazu.length - 1 && tablica_znaków_wyrazu[j + 1] == tablica_znaków_wyrazu[j]) {
                    liczba_liter++;
                }
                else{
                    if (liczba_liter > 2) {
                        nowy_wyraz += tablica_znaków_wyrazu[j] + String.valueOf(liczba_liter);
                    }
                    else{
                        if (liczba_liter == 1) {
                            nowy_wyraz += tablica_znaków_wyrazu[j];    
                        }
                        else{
                            nowy_wyraz += tablica_znaków_wyrazu[j];
                            nowy_wyraz += tablica_znaków_wyrazu[j];
                        }  
                    }

                    liczba_liter = 1;
                }
            }
        
            System.out.println(nowy_wyraz);
        }    
    }

    public static void main(String[] args) {
        String[] tablica_wyrazow_do_kompresji = new String[4];
        
        tablica_wyrazow_do_kompresji[0] = "OPSS";
        tablica_wyrazow_do_kompresji[1] = "ABCDEF";
        tablica_wyrazow_do_kompresji[2] = "ABBCCCDDDDEEEEEFGGHIIJKKKL";
        tablica_wyrazow_do_kompresji[3] = "AAAAAAAAAABBBBBBBBBBBBBBBB";
        
        Kompresja_zapisu_wyrazu(tablica_wyrazow_do_kompresji);
    }
    
}
