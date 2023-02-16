package dominio;

public class Ejercicio8 {
    public static int sumas(int lista[],int n){
        if(n==0){
            if(lista[n]%2==0){
                return lista[n];
            }else{
                return 0;
            }
        }
        if(n!=0){
            if(lista[n]%2!=0){
                return sumas(lista,n-1);
            }
        }
        return sumas(lista,n-1)+lista[n];
    }
}
