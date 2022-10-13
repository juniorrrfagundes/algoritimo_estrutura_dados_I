import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {

     DataInputStream cinput;
     PrintStream coutput;
     Socket clisoc;

     public static void client(String dados) {
           try {
            InetAddress addr = InetAddress.getByName("127.0.0.1");  
            int port = 4321; //Integer.parseInt(4321);            
            byte[] msg = dados.getBytes();            
            DatagramPacket pkg = new DatagramPacket(msg,msg.length, addr, port);            
            DatagramSocket ds = new DatagramSocket();            
            ds.send(pkg);            
            ds.close();     
            }
         catch(Exception e){
             System.err.println(e);
         }
       }
        public static void main(String args[]){
          client("101#E4#180");
        }
     }
