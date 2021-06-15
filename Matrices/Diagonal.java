
public class Diagonal
{
    int num;
    int[][]numeros;
    public void DarTamanio(int num){
        this.num=num;
        numeros=new int[num][num];
    }

    public void Organiza(){
        int cont=0;
        int fila=0;
        int colum=0;
        String Prim="";
        String Seg="";
        for(int i=0;i<num;i++){
            colum=i; 
            numeros[colum][fila]=cont;
            cont++;

            for(int j=0;j<num;j++){
                fila=j;
                numeros[colum][fila]=cont;
                cont++;
                if(numeros[i][j]<10){
                    System.out.print("0"+numeros[i][j]+" ");
                }else{
                    System.out.print(numeros[i][j]+" ");
                }
                if(i==j){
                    Prim+=numeros[i][j]+" ";

                }
                if(i+j==num-1){
                    Seg+=numeros[i][j]+" ";

                } 
            }
            System.out.println(" ");
        }
        System.out.println("Diagonal primaria: " + Prim);
        System.out.println("Diagonal secundaria: " + Seg);

    }
}