
public class nivelIntermedio_201602470 {
    
    
    int intermedio[][] = new int[4][4];
    
    
public nivelIntermedio_201602470 (){
    
   
    for (int x = 0; x<intermedio.length ;x++){
    for (int y = 0; y < intermedio[x].length; y++) {
            intermedio[x][y] = (int) (Math.random() * 2 + 1);
System.out.println(intermedio[x][y]);
if (y!=intermedio[x].length-1) System.out.print("\n");
        }
System.out.println(intermedio);
    }
}

    
}
