import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

public class probando {

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Indique la palabra que desea encriptar");
        int desplazar = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto desea desplazar"));


        CifrarCodigo palabraCifrada = new CifrarCodigo(palabra, desplazar);
        DescifrarCodigo descifrarCodigo = new DescifrarCodigo(palabraCifrada.getPalabraCifrada());


        palabraCifrada.mostrarPalabraEnc();
        palabra = palabraCifrada.getPalabraCifrada();
        ArrayList<Integer> pasa = new ArrayList<Integer>();
        pasa = palabraCifrada.getPasa();
        descifrarCodigo.setPasa(pasa);

        while (!palabra.equals(palabraCifrada.getPalabra()) ){
            int desplaamiento = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto espacio se quiere desplazar para encriptar"));
            palabra = descifrarCodigo.descifrandoCodigo(desplaamiento);
            if ( palabra.equals(palabraCifrada.getPalabra()) ){

                JOptionPane.showMessageDialog(null, "CONGRATS!!!!");
            }else {
                JOptionPane.showMessageDialog(null, "ERROR","Title", JOptionPane.ERROR_MESSAGE);
                System.out.printf(palabra + "\n");System.out.printf(palabraCifrada.getPalabra());

            }

        }
        JOptionPane.showMessageDialog(null, "PALABRA CORRECTA: " + palabra);


    }
}
