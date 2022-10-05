// //* ****************************************************************************************
// * Faculdade de Engenharias Arquitetura e Urbanismo (FEAU) - (Univap)
// * Curso: Engenharia da Computação - Data de Entrega: 22/09/2022
// * Autor: JUNIOR RAFAEL ROSA FAGUNDES
// *
// * Turma: 8UNA Disciplina: Algoritmos Estrutura de Dados - I
// * Avaliação parcial referente ao 1 - Bimestre
// * Observação: <colocar se houver>
// *
// * Autor.java
// * ****************************************************************************************///
package prova;
import java.util.List;
import java.util.Scanner;

import estrutura01.vetor;

// 0-9 – Crianças – grupo 1
// 10 -19 – Adolescentes – grupo - 2
// 20 – 29 – Jovens – grupo - 3
// 30 – 59 – Adultos – grupo – 4
// 60 – 99 - Idosos – grupo – 5

public class Autor {
    public static void main(String[] args){
        //instanciando classes
        Scanner scanner = new Scanner(System.in);
        Dados dado = new Dados();
        Vetor lista = new Vetor();

        System.out.print("Quantidades de pessoas: ");
        int pessoas_examinadas = Integer.parseInt(scanner.next());
        pessoas_examinadas = pessoas_examinadas+1;
        int g1 = 0, g2 = 0, g3 = 0, g4 = 0, g5 = 0;
        int grupo[] = new int[5];

        for (int i =1; i < pessoas_examinadas; ++i){
            System.out.print("Idade "+i+"o. pessoa:");
            int pessoa_idade = Integer.parseInt(scanner.next());
            
            if (pessoa_idade > 0 && pessoa_idade < 10){
                //System.out.println("Pessoa pertence ao grupo 1");
                g1 = g1 + 1;
            } else if (pessoa_idade > 9 && pessoa_idade < 20){
                //System.out.println("Pessoa pertence ao grupo 2");
                g2 = g2 + 1;
            } else if (pessoa_idade > 19 && pessoa_idade < 30){
                //System.out.println("Pessoa pertence ao grupo 3");
                g3 = g3 + 1;
            } else if (pessoa_idade > 29 && pessoa_idade < 60){
                //System.out.println("Pessoa pertence ao grupo 4");
                g4 = g4 + 1;
            } else if (pessoa_idade > 59 && pessoa_idade < 100){
                //System.out.println("Pessoa pertence ao grupo 5");
                g5 = g5 + 1;
            } else {
                System.out.println("Idade errada");
            }
        }
        grupo[0] = g1;
        grupo[1] = g2;
        grupo[2] = g3;
        grupo[3] = g4;
        grupo[4] = g5;

        if(g1 > 0){
        // Add grupo 1
        dado = new Dados();
        dado.setGupo("1 0-9 "+grupo[0]);
        lista.AdicionarDados(dado);
        }
        if(g2 >0){
        // Add grupo 2
        dado = new Dados();
        dado.setGupo("2 10-19 "+grupo[1]);
        lista.AdicionarDados(dado);            
        }
        if(g3 >0){
        // Add grupo 3
        dado = new Dados();
        dado.setGupo("3 20-29 "+grupo[2]);
        lista.AdicionarDados(dado);            
        }
        if(g4>0){
        // Add grupo 4
        dado = new Dados();
        dado.setGupo("4 30-59 "+grupo[3]);
        lista.AdicionarDados(dado);
        }
        if (g5>0){
        // Add grupo 5
        dado = new Dados();
        dado.setGupo("5 60-99 "+grupo[4]);
        lista.AdicionarDados(dado);     
        }
        System.out.println(lista);
    }
}
