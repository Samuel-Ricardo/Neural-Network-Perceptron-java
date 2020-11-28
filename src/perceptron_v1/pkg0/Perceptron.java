/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perceptron_v1.pkg0;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class Perceptron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int option;
       
       Scanner tec = new Scanner(System.in); //Scanner para Receber os Dados de Entrada
       
       int[] x = new int [4];       // X Sao Dados de Entrada
       float [] w =  new float [4]; // W Sao os Pesos 
       
       int b = 1;    // B é o Bias
       float wB = 0; //WB é o Peso do Bias
       
       float u;         //resultado da Funçao
       int n = 1;       //Taxa de Aprendizagem
       int y;           //Resultado
       int e = 0;       //Codigo de Erro
       int er;          //Verificaçao de Erro
       int online = 1;  // manter o codigo repetindo
       int lingua;      //escolher a lingua
       
     
        for (int c = 1; c == 3; c++){ //definimdo os pesos inicias
            w[c]= 0;
        }
        System.out.println("------------------------");
        System.out.println("//choose the language://");
        System.out.println("------------------------");
        System.out.println("//                    //");
        System.out.println("//(1)- English        //");
        System.out.println("//(2)- Portuguese     //");
        System.out.println("------------------------");
        
     
            lingua = tec.nextInt();
          
                
            
            System.out.println(lingua);
      if(lingua == 2){
          
           do{
        
        System.out.println("----------------------------");  
        System.out.println("//Descubra se é Ser Vivo: //");
        System.out.println("----------------------------");
        System.out.println("+(1)-peixe                 +");
        System.out.println("+(2)-colher                +");
        System.out.println("+(3)-sapo                  +");  
        System.out.println("+(4)-cachorro              +");
        System.out.println("+(5)-aquario               +");
        System.out.println("+(6)-pessoa                +");
        System.out.println("+(7)-agulha                +");
        System.out.println("+(8)-feijao                +");
        System.out.println("----------------------------");
        
        option = tec.nextInt();
        e = 1;
        switch (option) {  //converte nome escolhido para bits
              
        case 1:
           x[1] = 0;
           x[2] = 0;
           x[3] = 0;
         
        break;
        
        case 2:
           x[1] = 0;
           x[2] = 0;
           x[3] = 1;
           
        break;
        
        case 3:
           x[1] = 0;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 4:
           x[1] = 1;
           x[2] = 0;
           x[3] = 0;
           
        break;
        
        case 5:
           x[1] = 0;
           x[2] = 1;
           x[3] = 1;
           
        break;
        
        case 6:
           x[1] = 1;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 7:
           x[1] = 1;
           x[2] = 0;
           x[3] = 1;
          
        break;
        
        case 8:
           x[1] = 1;
           x[2] = 1;
           x[3] = 1;
           
        break;
    }
        
        
       
        
        u = (x[1]*w[1]+x[2]*w[2]+x[3]*w[3])+b*wB; //funçao Combinador/Somador
        
        if (u<0){  // Funçao de Transferencia (Funçao Degrau)
          
            y = 0;
            
        }else{
        
            y = 1;
            
        }
        
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        
        if (y == 1) {       //rertorna uma frase baseado nos resultados da IA
            
            System.out.println("è um ser vivo");
        
            
                  
            }else{              //rertorna uma frase baseado nos resultados da IA
            
              System.out.println("nao è um ser vivo");
           }
           
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
        
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   System.out.println("Ocorreu um erro ao pausar: "+ex);
                   System.out.println("");
                   ex.printStackTrace();
               }
        
        System.out.println("Ele é um ser vivo??");
            
            System.out.println("(1) - sim");
            System.out.println("(0) - nao");
            
            e = tec.nextInt();
        
        er = e - y; //verificando se a IA acertou

        
        for (int c = 1; c == 3; c++){       //Redefinindo os pesos
                w[c] = w[c]+n*er*x[c];
                System.out.println(w[c]);
            }
        
        wB = wB+n*er*b;
        
         
          System.out.println("");
          for (int c = 1; c == 3; c++){       //Redefinindo os pesos
               System.out.println(w[c]);
            }
          System.out.println("");
          System.out.println("Os pesos foram atualizados...");
          
          try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   System.out.println("Ocorreu um erro ao pausar: "+ex);
                   System.out.println("");
                   ex.printStackTrace();
               }
          
          System.out.println("deseja continuar?");
          System.out.println("(1) - Sim");
          System.out.println("(2) - Nao");
          
          online = tec.nextInt();
        
      }while(online == 1); 
     
    }else if(lingua == 1){
        
         do{
        
        System.out.println("----------------------------");  
        System.out.println("//test with one of these: //");
        System.out.println("----------------------------");
        System.out.println("+(1)-fish                  +");
        System.out.println("+(2)-spoon                 +");
        System.out.println("+(3)-frog                  +");  
        System.out.println("+(4)-dog                   +");
        System.out.println("+(5)-aquarium              +");
        System.out.println("+(6)-person                +");
        System.out.println("+(7)-needle                +");
        System.out.println("+(8)-bean                  +");
        System.out.println("----------------------------");
        
        option = tec.nextInt();
        e = 1;
        switch (option) {  //converte nome escolhido para bits
              
        case 1:
           x[1] = 0;
           x[2] = 0;
           x[3] = 0;
         
        break;
        
        case 2:
           x[1] = 0;
           x[2] = 0;
           x[3] = 1;
           
        break;
        
        case 3:
           x[1] = 0;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 4:
           x[1] = 1;
           x[2] = 0;
           x[3] = 0;
           
        break;
        
        case 5:
           x[1] = 0;
           x[2] = 1;
           x[3] = 1;
           
        break;
        
        case 6:
           x[1] = 1;
           x[2] = 1;
           x[3] = 0;
           
        break;
        
        case 7:
           x[1] = 1;
           x[2] = 0;
           x[3] = 1;
          
        break;
        
        case 8:
           x[1] = 1;
           x[2] = 1;
           x[3] = 1;
           
        break;
    }
        
        
       
        
        u = (x[1]*w[1]+x[2]*w[2]+x[3]*w[3])+b*wB; //funçao Combinador/Somador
        
        if (u<0){  // Funçao de Transferencia (Funçao Degrau)
          
            y = 0;
            
        }else{
        
            y = 1;
            
        }
        
         
        System.out.println("");
        System.out.println("--------------------------------------------------------------------");
        
        if (y == 1) {       //rertorna uma frase baseado nos resultados da IA
            
            System.out.println("it's a living being");
        
            
                  
            }else{              //rertorna uma frase baseado nos resultados da IA
            
              System.out.println("it is not a living being");
           }
           
        System.out.println("--------------------------------------------------------------------");
        System.out.println("");
          
          try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   System.out.println("There was an error pausing: "+ex);
                   System.out.println("");
                   ex.printStackTrace();
               }
        
          
        System.out.println("Is it a living being?");
            
            System.out.println("(1) - Yes");
            System.out.println("(0) - not");
            
            int res = tec.nextInt();
            
            if(res == y){   //verificando se a IA acertou
                e = 0;
            }else{ 
                e = 1;    
            }
        
        er = e - y;
        
        for (int c = 1; c == 3; c++){       //Redefinindo os pesos
                w[c] = w[c]+n*er*x[c];
                System.out.println(w[c]);
            }
        
        wB = wB+n*er*b;
        
         
          System.out.println("");
          for (int c = 1; c == 3; c++){       //Redefinindo os pesos
               System.out.println(w[c]);
            }
          System.out.println("");
          System.out.println("Weights has been updated...");
          
          try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   System.out.println("Ocorreu um erro ao pausar: "+ex);
                   System.out.println("");
                   ex.printStackTrace();
               }
          
          System.out.println("Do you want to continue?");
          System.out.println("(1) - Yes");
          System.out.println("(2) - not");
          
          online = tec.nextInt();
        
      }while(online == 1); 
          
      }
}
    
}
