package fighterfadergs;

import java.util.Scanner;

public class Menu extends Lutador{
    Scanner leia = new Scanner(System.in);
    public int numberMenu;

    
    public void carregarMenu(){
        System.out.println("Menu:");
        System.out.println("|1| Seleção de personagens");
        System.out.println("|2| Luta Livre");
        System.out.println("|3| Modo História");
        numberMenu = leia.nextInt();
        
        switch(numberMenu){
            case 1: 
                System.out.println("|1| Vilões/deuses");
                System.out.println("|2| Heróis/humanos");
                int escolha;
                escolha = leia.nextInt();
                if(escolha == 1) {
                    System.out.println("|1| The Penguin");
                    System.out.println("|2| The IceMan");
                    System.out.println("|3| The GrillMan");
                    System.out.println("|4| The AdsAlto");
                    int vilao;
                    vilao = leia.nextInt();
                    switch(vilao){
                        case 1:
                            thePenguinStatus();
                        break;
                        case 2:
                            theIcemanStatus();
                        break;
                        case 3:
                            theGrillManStatus();
                        break;
                        case 4:
                            theAdsAltoStatus();
                        break;
                        default:
                            System.out.println("Opção inválida!");
                        break;
                    }
                } else if (escolha == 2) {
                    System.out.println("|1| Marcus");
                     int heroi;
                     heroi = leia.nextInt();
                     switch(heroi){
                         case 1:
                             theLutadorMarcus();
                         break;
                             
                             
                             
                                 }
                    
                }
                
            break;
            case 2:
                
                
               
                    
                    
                    
                
                
            break;
            default:
                System.out.println("Opção inválida!");
            break;
        }                                                   
    }


    
}
