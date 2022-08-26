import java.util.ArrayList;
import java.util.Vector;

public class DescifrarCodigo {

    private String newWord;
    private String palabra;

    private ArrayList<Integer> pasa = new ArrayList<Integer>();

    DescifrarCodigo(String palabra){
        this.palabra = palabra;
        newWord = "";
    }

    void setPasa(ArrayList<Integer> pasa){
        this.pasa = pasa;
    }

    String descifrandoCodigo(int desplazar){
        newWord = "";
        for (int i = 0; i < palabra.length(); i++){
            int ascii = 0;
            if ((int) palabra.charAt(i) >= 65 && (int) palabra.charAt(i) <= 122){
                while ((int) (palabra.charAt(i) + (desplazar + ascii)) > 122){
                    ascii += 58;
                    while ((int) (palabra.charAt(i) + (desplazar + ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar + ascii)) <= 96){
                        ascii -= 6;
                    }
                }

                while ((int) (palabra.charAt(i) + (desplazar + ascii)) < 65){
                    ascii += 58;
                    while ((int) (palabra.charAt(i) + (desplazar + ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar + ascii)) <= 96){
                        ascii -= 6;
                    }
                }
                if (!pasa.isEmpty() && pasa.get(0) == i){
                    ascii -= 6;
                    pasa.remove(0);
                }

                while ((int) (palabra.charAt(i) + (desplazar + ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar + ascii)) <= 96){
                    ascii -= 6;
                }

                newWord += String.valueOf((char) (palabra.charAt(i) + (desplazar + ascii)));
            }else {
                newWord += palabra.charAt(i);
            }

        }

        return  newWord;
    }
}
