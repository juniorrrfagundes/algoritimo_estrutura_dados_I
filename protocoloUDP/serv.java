import java.net.*;
import java.io.*;
public class serv  {
      int pt;
      ServerSocket ssocket;
      String lercaixa;
      PrintStream  soutput;
      DataInputStream sinput;
      Socket csk,clisoket;

      public serv() {
          //  Programa Servidor
           pt = 4321;
           try  // Excecao
           {
              ssocket = new ServerSocket(pt);

           }
           catch(Exception e) {
              System.err.println(e.getMessage());
              System.exit(0);
           }
			      System.out.println("Servidor Ativo ..... ");

            try {
            while(true) {
              int port = 4321;
              DatagramSocket ds = new DatagramSocket(port);    
              byte[] msg = new byte[256];
              DatagramPacket pkg = new DatagramPacket(msg, msg.length);    
              ds.receive(pkg);

              String data = new String(pkg.getData()).trim();        
              String[] texto = data.split("#");
              Boolean saida = true;
              
              if (Integer.parseInt(texto[0],2) > 7){
                saida = false;
                System.out.println("**** Operação Inadequada***");
              }
              
              if (saida){
                switch (texto[1]){
                  case "E3":
                    saida = true;
                    break;
                  case "E4":
                    saida = true;
                    break;
                  case "E5":
                    saida = true;
                    break;
                  case "E6":
                    saida = true;
                    break;
                  default :
                    saida = false;
                    System.out.println("**** Operação Inadequada***");
                    break;
                }                
                if ((Integer.parseInt(texto[2]) > 360 || Integer.parseInt(texto[2]) < 0) && saida){
                  saida = false;
                  System.out.println("**** Operação Inadequada ***");
                }                
                if (saida){
                  System.out.println("**** Operação bem-sucedida ***");
                }
              }
              ds.close();
              }
            }
            catch(Exception e) {
              System.out.println("**** Operação Inadequada***");
            }
        }

       public static void main(String args[]) {
          new serv();
       }

  }





