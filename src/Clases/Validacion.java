package Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    static String email;

    public static boolean get_Valaida_Correo() {

        Pattern p = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");

        Matcher m = p.matcher(email);

        return m.matches();
        
    }
}
