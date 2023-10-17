import java.io.*
import java.io.BufferedReader;

public class RicercaSequenziale{
  public static void main(String []args) throws IOException{
    BufferedReader stdin = new BufferedReader(new ImputStreamReader(System.in));

    char[] v1;
    boolean trovato=false;

    System.out.println("Quanti caratteri vuoi inserire: ");
    int numeroCaratteri = Integer.parseInt(stdin.readLine());

    v1 = new char[numeroCaratteri];

    int i;

    for(i=0;i<numeroCaratteri;i++){
      System.out.println("Inserisci " + (i+1) + "° carattere dell'array: ");
      v[i] = stdin.readLine().charAt(0);
    }

    System.out.println("Inserisci il carattere che vuoi analizzare: ");
    char carattere = stdin.readLine().charAt(0);

    for(i=0;i<numeroCaratteri;i++){
      if(v[i] == carattere){
          System.out.println("Il carattere è presente nell'array, alla posizione " + i);
          trovato=true;
          break;
      }
    }  
    if(!trovato){
      System.out.println("-1");
    }
}
