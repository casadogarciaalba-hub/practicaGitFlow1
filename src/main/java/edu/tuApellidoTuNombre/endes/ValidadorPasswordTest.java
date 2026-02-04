package edu.tuApellidoTuNombre.endes;

public class ValidadorPasswordTest {
    public static void main(String[] args) {
        // Casos de prueba
        String[] passwords = {
                "Password1!",    // Válida
                "password1!",    // No válida (sin mayúscula)
                "PASSWORD1!",    // No válida (sin minúscula)
                "Password!",     // No válida (sin dígito)
                "Password1",     // No válida (sin carácter especial)
                "Pass1!",        // No válida (menos de 8 caracteres)
                null             // No válida (null)
        };

        for (String pwd : passwords) {
            Object ValidadorPassword;
            boolean esValida = ValidadorPassword.esPasswordValida(pwd);
            System.out.println("Password: " + pwd + " | Válida: " + esValida);
        }
    }
}
