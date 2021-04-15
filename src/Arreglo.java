
public class Arreglo {
    
    public static void sumarLista(int[]a){
        double promedio = 0;        
        
        for (int i = 0; i < a.length; i++) {
            promedio+=a[i];
        }                   
            System.out.println("La suma total es: "+promedio);
            System.out.println("Promedio: "+promedio/a.length);
    }


    public static int buscarMayor(int[][]b){
        int mayor=0;
        
        for (int i = 0; i < b.length; i++) {
            
            for (int j = 0; j < b[i].length; j++) {
                if (b[i][j]>mayor) {
                    mayor=b[i][j];
                }
            }
        }
        System.out.println("El numero mas grande es: "+mayor);
        return mayor;  
    }
            
    public static int cuentaVocales(String h){
        String c = h.toLowerCase();
        int vocales=0;
        for (int i = 0; i < c.length(); i++) {            
            vocales = (c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'
                      ||c.charAt(i)=='u')?vocales+1:vocales+0;            
        }
        System.out.println("Numero de vocales: "+vocales);
        return vocales;
    }
    
    public static int cuentaCaracter(String cadena,char o){
        int rep=0;
        String g = cadena.toLowerCase();
        char v = Character.toLowerCase(o);
        
        for (int i = 0; i < g.length(); i++) {
            rep = (g.charAt(i)==v)?rep+1:rep+0;
        }
        System.out.println("El caracter "+v+" se repite: "+rep);
        return rep;
    }
}