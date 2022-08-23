public class DescifrarCodigo {

    private String newWord;
    DescifrarCodigo(){
        newWord = "";
    }

    String descifrandoCodigo(String palabra, int desplazar){
        newWord = "";
        for (int i = 0; i < palabra.length(); i++){
            newWord += String.valueOf((char) (palabra.charAt(i) + desplazar));
        }

        return  newWord;
    }
}
