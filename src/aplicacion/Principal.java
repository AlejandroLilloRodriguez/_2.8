package aplicacion;
import dominio.*;

import static dominio.Ejercicio8.sumas;

public class Principal {
    public static void main(String[] args){
        int[]lista ={1,2,4,3,56,4,24,2,8,43};
        System.out.print(" "+sumas(lista, lista.length-1));
    }
}
