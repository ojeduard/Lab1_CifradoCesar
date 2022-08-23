import javax.swing.*;

public class CifrarCodigo {

    // Atributos de la clase
    private String palabra = "";
    private String palabraCifrada = "";

    // Constructor de la clase
    CifrarCodigo (String palabra){
        this.palabra = palabra;
        encriptarPalabra();
    }

    // Los gets de los atributos
    String getPalabra (){
        return (String) palabra;
    }

    String getPalabraCifrada (){
        return (String) palabraCifrada;
    }

    void encriptarPalabra(){
        for (int i = 0; i < palabra.length(); i++){
            palabraCifrada += String.valueOf((char) (palabra.charAt(i) + 2));
        }
    }

    void mostrarPalabraEnc(){
        JOptionPane.showMessageDialog(null, "LA PALARA ENCRIPTADA ES: " + palabraCifrada);
    }
}
