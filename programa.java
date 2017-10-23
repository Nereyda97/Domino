import java.lang.Math;
import java.util.List;
public class programa{
  static ficha Lista[]=new ficha[28];
  public programa(){
    int cont=0;
    for(int i=0;i<7;i++){
      for(int j=0;j<7;j++){
        ficha A=new ficha(i,j);
        if(!comprobar(A)){
          Lista[cont]=A;
          cont++;
        }
      }
    }
  }

  public boolean comprobar(ficha A){
      for(int i=0;i<Lista.length;i++){
        if(Lista[i]==null){
          break;
        }
        else if(Lista[i].marca==A.valor && Lista[i].valor==A.marca ){
          return true;
        }
      }
      return false;
  }

  public static void main(String[] args){
    programa juego=new programa();
      List Lista2=new ArrayList();

      for(int i=0;i<28;i++){
        Lista[i].imprimir();
      }
      System.out.println("");
      ficha[] OtraLista=juego.revolver();
      for(int i=0;i<28;i++){
      System.out.println(OtraLista[i].ToString());
      Lista2.add(OtraLista[i].ToString());
    }

  }

  public ficha[] revolver(){
    int i=0;
    ficha[] NuevaLista=new ficha[28];
      while(revisarLista(NuevaLista)){
        int A=(int)(Math.random()*28);
        //System.out.println(A);
        if(NuevaLista[A]==null){
          NuevaLista[A]=Lista[i];
          i++;
        }else{
          continue;
        }
      }
      return NuevaLista;
  }
  public boolean revisarLista(ficha[] A){
    boolean control=false;
    for(int i=0;i<28;i++){
      if(A[i]==null){
        //System.out.println("encontre un null");
        control=true;
      }
    }
    return control;
  }
}
