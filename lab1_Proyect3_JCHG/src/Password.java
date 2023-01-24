import java.util.Random;

public class Password {

        int longitud;
        String contrasenna;


        // Constructor Base - Longitud = 8
    public Password() {
        this.longitud = 8;

    }


    // Constructor con la longitud customisada
    public Password(int longitud) {
        this.longitud = longitud;

    }


    // Getters y Setters

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    // Metodos



    public void generarPassword() {

        String caracteres = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random rnd = new Random();

        char[] claveGenerada = new char[longitud];
        for (int i = 0; i < longitud; i++) {
            claveGenerada[i] = caracteres.charAt(rnd.nextInt(caracteres.length()));
        }

        this.contrasenna = new String(claveGenerada);

    }
}
