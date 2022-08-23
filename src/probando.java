import javax.swing.*;

public class probando {

    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Indique la palabra que desea encriptar");

        CifrarCodigo palabraCifrada = new CifrarCodigo(palabra);
        DescifrarCodigo descifrarCodigo = new DescifrarCodigo();

        palabraCifrada.mostrarPalabraEnc();

        while (palabraCifrada.getPalabraCifrada() != (String) palabraCifrada.getPalabra()){
            int desplaamiento = Integer.parseInt(JOptionPane.showInputDialog("Indique cuanto espacio se quiere desplazar"));

            if ( descifrarCodigo.descifrandoCodigo(palabraCifrada.getPalabraCifrada(), desplaamiento) ==  palabraCifrada.getPalabra()){

                JOptionPane.showMessageDialog(null, "CONGRATS!!!!");
            }else {
                JOptionPane.showMessageDialog(null, "ERROR","Title", JOptionPane.ERROR_MESSAGE);
                System.out.printf(descifrarCodigo.descifrandoCodigo(palabraCifrada.getPalabraCifrada(), desplaamiento) + "\n");
            }

        }
        JOptionPane.showMessageDialog(null, "PALABRA CORRECTA: " + palabra);
        //Aqui 
    }
}
