package cadastro;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Main jim = new Main();
        jim.startup();
        Vetor lista = new Vetor();

        while(true){
            System.out.println("1 - para cadastrar");
            System.out.println("2 - para sair");
            System.out.println("3 - para ver metodos");
            int entry = scanner.nextInt();
            if (entry == 2){
                jim.exit();
            } else if(entry == 1){
                Dados dado = new Dados();
                System.out.print("Nome: ");
                String nome = scanner.next();
                System.out.print("Cidade: ");
                String cidade = scanner.next();
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                System.out.print("Telefone: ");
                String telefone = scanner.next();
                dado.setNome(nome);
                dado.setCidade(cidade);
                dado.setIdade(idade);
                dado.setTelefone(telefone);
                lista.addObject(dado);
            }else if(entry == 3){
                boolean metodo = true;
                while(metodo){
                    System.out.println("1 - para alterar");
                    System.out.println("2 - para Pesquisar");
                    System.out.println("3 - para Excluir");
                    System.out.println("4 - para relatar todos");
                    System.out.println("5 - para voltar");
                    int entrada = scanner.nextInt();
                    switch (entrada){
                        case 1:
                            Dados dado = new Dados();
                            System.out.print("Nome: ");
                            String nome = scanner.next();
                            System.out.print("Cidade: ");
                            String cidade = scanner.next();
                            System.out.print("Idade: ");
                            int idade = scanner.nextInt();
                            System.out.print("Telefone: ");
                            String telefone = scanner.next();
                            System.out.println("Index a alterar: ");
                            int index = scanner.nextInt();
                            dado.setNome(nome);
                            dado.setCidade(cidade);
                            dado.setIdade(idade);
                            dado.setTelefone(telefone);
                            lista.updateObject(index, dado);
                            break;
                        case 2:
                            System.out.println("Index a Pesquisar: ");
                            index = scanner.nextInt();
                            System.out.println(lista.search(index));
                            break;
                        case 3:
                            System.out.println("Index a Excluir: ");
                            index = scanner.nextInt();
                            lista.delete(index);
                            break;
                        case 4:
                            System.out.println(lista);
                            break;
                        case 5:
                            metodo = false;
                            break;
                    }
                }
            }
        }

    }
    public void startup(){
        System.out.println("***********************");
        System.out.println("**SISTEMA DE CADASTRO**");
        System.out.println("***********************");
        System.out.println("");
    }
    public void exit(){
        System.exit(0);
    }
}
