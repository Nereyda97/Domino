class ficha{
  int marca=0;
  int valor=0;
  ficha(int a,int b){
    this.marca=a;
    this.valor=b;
  }
  public void imprimir(){
    System.out.print(this.marca+","+this.valor+"\n");
  }
  public String ToString(){
    String cadena="";
    return cadena+this.marca+","+this.valor;
    }
}
