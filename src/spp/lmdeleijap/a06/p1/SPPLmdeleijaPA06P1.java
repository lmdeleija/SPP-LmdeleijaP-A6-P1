/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lmdeleijap.a06.p1;
import java.util.Scanner;
/**
 *
 * @author luixm_000
 */
public class SPPLmdeleijaPA06P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
    Scanner teclado = new Scanner(System.in);
    int suma = 0, numero;
    numero = SolicitarDatos();
    while(numero>0){
        suma = CalcularSuma (numero,suma);
        numero = SolicitarDatos();
        
    }
        System.out.println("El resultado de la suma es" + suma);
     }
    static int SolicitarDatos(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero");
        try{
            numero= teclado.nextInt();
            }catch(Exception ex){
                System.out.println("Este numero no es entero");
                return 0;
               }
        return numero;
        }
    static int CalcularSuma(int numero, int suma){
        suma= suma + numero;
        return suma;
            
 
   
            
        }
            
            
    }

