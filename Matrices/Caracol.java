
public class Caracol 
{
    int num;
    int[][]numeros;
    public void DarTamanio(int num){
        this.num = num;
        numeros = new int[num][num];
    }

    public void Ordenar(){
        int cont = 1;
        int fila = 0;
        int colum = 0;
        for(int i=0; i<num; i++){
            colum = i;
            for(fila=i; fila<=(num-1-i); fila++){
                numeros[colum][fila] = cont;
                cont++;
            }
            fila = num-1-i;
            for(colum=i+1;colum<=(num-1-i);colum++){
                numeros[colum][fila] = cont;
                cont++;
            }
            colum = num-1-i;
            for(fila = (num-2-i); fila>=i; fila--){
                numeros[colum][fila] = cont;
                cont++;
            }
            fila = i;
            for(colum = (num-2-i); colum>=i+1; colum--){
                numeros[colum][fila] = cont;
                cont++;
            }

        }
    }

    public void MostrarMatriz(){
        System.out.println("Matriz de tamaño: "+ num + " x " + num);
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(numeros[i][j]<10){
                    System.out.print("0"+numeros[i][j]+" ");
                }else{
                    System.out.print(numeros[i][j]+" ");
                }

            }
            System.out.println("");
        }

    }
}
