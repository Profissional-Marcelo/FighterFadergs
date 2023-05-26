package fighterfadergs;

import java.util.Scanner;



public class FighterFadergs {
    public static void main(String[] args) {
       String saia;
       int carregar = 0;
       Scanner leia = new Scanner(System.in);
       
       while(carregar == 0){
           
       
        Menu iniciar = new Menu();
        System.out.println("===================================================");
        System.out.println("Nesse jogo de luta, você enfrentará os terríveis vilões");
        System.out.println("e deuses da FADERGS. Será que você consegue?");
        System.out.println("(V.0.0.1)");
        System.out.println("================= FADERGS FIGHTER =================");
           System.out.println("Deseja sair do jogo?");
           System.out.println("");
           System.out.println("(Pressione qualquer outra tecla para começar, ou '0' para saír.)");
           System.out.println("|0| Saír ");
           saia = leia.next();
           if (!"0".equals(saia)){
            iniciar.carregarMenu();
           } else {
               carregar++;
           }
        
 
            
            
            
            
            
            
            
            
            }
        }
    }
    

