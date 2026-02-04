package edu.tuApellidoTuNombre.endes;

public class ValidadorPassword {
    public static boolean esPasswordValida(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;
        boolean tieneCaracterEspecial = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            } else if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            } else if (Character.isDigit(c)) {
                tieneDigito = true;
            } else if ("!@#$%^&*()-+".indexOf(c) >= 0) {
                tieneCaracterEspecial = true;
            }
        }

        return tieneMayuscula && tieneMinuscula && tieneDigito && tieneCaracterEspecial;
    }
}

