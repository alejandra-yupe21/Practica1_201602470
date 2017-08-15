package practica1_201602470;

import java.util.*;

public class nivelPrincipiante_201602470 {

    int principiante[][] = new int[4][4];
  
    public nivelPrincipiante_201602470 (){
    for (int x = 0; x<principiante.length ;x++){
    for (int y = 0; y < principiante[x].length; y++) {
            principiante[x][y] = (int) (Math.random() * 2 + 1);
System.out.println(principiante[x][y]);
if (y!=principiante[x].length-1) System.out.print("\n");
        }
System.out.println(principiante);
    }
}

    
}
