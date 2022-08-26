import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

public class CifrarCodigo {

    // Atributos de la clase
    private String palabra = "";
    private String palabraCifrada = "";
    private ArrayList<Integer> pasa = new ArrayList<Integer>();



    // Constructor de la clase
    CifrarCodigo (String palabra, int desplazar){
        this.palabra = palabra;
        encriptarPalabra(desplazar);
    }

    // Los gets de los atributos
    String getPalabra (){
        return (String) palabra;
    }

    String getPalabraCifrada (){
        return (String) palabraCifrada;
    }

    ArrayList<Integer> getPasa(){
        return pasa;
    }

    void encriptarPalabra(int desplazar){

        for (int i = 0; i < palabra.length(); i++){
            int ascii = 0;
            if ((int) palabra.charAt(i) >= 65 && (int) palabra.charAt(i) <= 122){
                while ((int) (palabra.charAt(i) + (desplazar - ascii)) > 122){
                    ascii += 58;
                    while ((int) (palabra.charAt(i) + (desplazar - ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar - ascii)) <= 96){
                        ascii -= 6;
                        pasa.add(i);
                    }
                }

                while ((int) (palabra.charAt(i) + (desplazar + ascii)) < 65){
                    ascii += 58;
                    while ((int) (palabra.charAt(i) + (desplazar - ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar - ascii)) <= 96){
                        ascii -= 6;
                        pasa.add(i);
                    }
                }

                while ((int) (palabra.charAt(i) + (desplazar - ascii)) >= 91 && (int) (palabra.charAt(i) + (desplazar - ascii)) <= 96){
                    ascii -= 6;
                    pasa.add(i);
                }


                palabraCifrada += String.valueOf((char) (palabra.charAt(i) + (desplazar - ascii)));
            }else {
                palabraCifrada += palabra.charAt(i);
            }

        }
    }

    void mostrarPalabraEnc(){
        JOptionPane.showMessageDialog(null, "LA PALARA ENCRIPTADA ES: " + palabraCifrada);
    }
}
