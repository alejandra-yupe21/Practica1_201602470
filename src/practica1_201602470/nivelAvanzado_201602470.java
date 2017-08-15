
package practica1_201602470;


public class nivelAvanzado_201602470 {
        int avanzado[][] = new int[8][8];
    
    public nivelAvanzado_201602470 (){
    for (int x = 0; x<avanzado.length ;x++){
    for (int y = 0; y < avanzado[x].length; y++) {
            avanzado[x][y] = (int) (Math.random() * 2 + 1);
System.out.println(avanzado[x][y]);
if (y!=avanzado[x].length-1) System.out.print("\n");
        }
System.out.println(avanzado);
    }
}

}
