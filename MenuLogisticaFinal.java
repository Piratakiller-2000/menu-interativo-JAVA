
import java.util.Scanner;
public class MenuLogisticaFinal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // criação do input
        String loop; // armazenamento da varialvel do loop de cada case
        int opcaoMenu = 0;  // armazena a varialvel da opção do menu

        do {
// MENU DE INICIALIZAÇÃO
            System.out.println("====================== MENU LOGÍSTICA ======================");
            System.out.println("Opção (1) = Conversor de quilometragem:");
            System.out.println("Opção (2) = Conversor de temperatura:");
            System.out.println("Opção (3) = Classificador de produto:");
            System.out.println("Opção (4) = Explicação do sistema:");
            System.out.println("Opção (5) = Sair:");
            System.out.print("Qual opção você deseja: ");

            // TRATAMENTO DE ERROS
            try {                        // se estiver no menu entra aqui
                opcaoMenu = input.nextInt();
                System.out.println("============================================================");
            }
            catch (Exception e) {        // tratamenot de erro ao digitar caracteres que não entram no menu
                System.out.println("============================================================");
                System.out.println("Erro: Você acabou usando caractere/s inválidos!");
                input.nextLine();
                opcaoMenu = 0;
                continue;
            }

            switch (opcaoMenu) {                // Criação das opções de Menu
// CONVERSOR DE QUILOMETRAGEM
                case 1:
                    do {
                        String space1 = "-".repeat(60);  // criação da variaves de linhas de space
                        String space2 = "=".repeat(60); //

                        System.out.print("Qual quilometragem deseja converter para (MILHAS): ");
                        double quilometros = 0;                   // Recebimento do valor de entrada em quilómetos

                        // TRATAMENTO DE ERROS DIRETO NO RECEBIMENTO DA INFORMAÇÃO
                        try {
                            quilometros = input.nextDouble();
                        } catch (Exception e) {
                            System.out.println(space2);
                            System.out.println("Erro: Você acabou usando caractere/s inválidos!");
                            System.out.println(space2);
                            input.nextLine();
                            loop = "S";
                            continue;
                        }
                        double resultado1 = quilometros * 0.621371;                 // Aplicação da fórmula

                        System.out.println(space1);

                        if (resultado1 <= 0) {
                            System.out.println("Erro: A quilometragem não pode ser um valor negativo ou zero!");  // Não deixa entrar valores negativo
                            System.out.println(space1);
                        }
                        else if (resultado1 < 5.0) {
                            System.out.println("Distância curta!");                // Condicional de distância curta
                            System.out.printf("%.2f mi\n", resultado1);
                            System.out.println(space1);
                        } else if (resultado1 >= 5.0 && resultado1 <= 29.9) {
                            System.out.println("Distância média!");               // Condicional de distância média
                            System.out.printf("%.2f mi\n", resultado1);
                            System.out.println(space1);
                        } else {
                            System.out.println("Distância longa!");               // Condicional de distância longa
                            System.out.printf("%.2f mi\n", resultado1);
                            System.out.println(space1);
                        }
                        System.out.print("Deseja Converter outra Distancia: (S/N): ");   // capta a entrado para continual o loop
                        loop = input.next();

                    } while (loop.equalsIgnoreCase("S"));
                    break;

// CONVERSOR DE TEMPERATURA
                case 2:
                    do {
                        String space1 = "-".repeat(60);  // separação de linha
                        String space2 = "=".repeat(60);

                        System.out.print("Qual temperatura em (ºC) quer converter para (ºF): ");
                        double C = 0;                               // guarda o input de ºC na variável (C)

                        // TRATAMENTO DE ERRO DIRETO NO RECEBIMENTO DA INFORMAÇÃO
                        try {
                            C = input.nextDouble();
                        }
                        catch (Exception e) {
                            System.out.println(space2);
                            System.out.println("Erro: Você acabou usando caractere/s inválidos!");
                            System.out.println(space2);
                            input.nextLine();
                            loop = "S";
                            continue;
                        }

                        double resultado2 = ((C * 9) / 5) + 32;                       // Criação da fórmula de conversão:

                        System.out.println(space1);

                        if (resultado2 < 60.0) {
                            System.out.println("Está fazendo FRIO!");                 // condição de (FRIO)
                            System.out.printf(resultado2 + " ºF\n");
                            System.out.println(space1);
                        } else if (resultado2 >= 60.0 && resultado2 <= 84.9) {
                            System.out.println("Está uma temperatura AGRADÁVEL!");    // condição de (AGRADÁVEL)
                            System.out.printf(resultado2 + " ºF\n");
                            System.out.println(space1);
                        } else {
                            System.out.println("Está fazendo CALOR!");                // caso não entre em nem uma condição e (QUENTE)
                            System.out.printf(resultado2 + " ºF\n");
                            System.out.println(space1);
                        }
                        System.out.print("Deseja Converter outra Temperatura: (S/N): ");   // capta a entrado para continual o loop
                        loop = input.next();

                    } while (loop.equalsIgnoreCase("S"));
                    break;

// CLASSIFICADOR DE PRODUTOS
                case 3:
                    int qnt_pro_leve = 0;        //
                    int qnt_pro_padrao = 0;      // armazenamento do contadores
                    int qnt_pro_pesado = 0;      //

                    do {
                        String space1 = "-".repeat(60);  // separação de linha
                        String space2 = "=".repeat(60);

                        System.out.print("Qual o peso da encomenda em (Kg) que deseja classificar: ");
                        double pesoProduto = 0;               // recebimento da entrada

                        // TRATAMENTO DE ERRO DIRETO NO RECEBIMENTO DA INFORMAÇÃO
                        try {
                            pesoProduto = input.nextDouble();
                        }
                        catch (Exception e) {
                            System.out.println(space2);
                            System.out.println("Erro: Você acabou usando caractere/s inválidos!");
                            System.out.println(space2);
                            input.nextLine();
                            loop = "S";
                            continue;
                        }

                        System.out.println(space1);

                        if (pesoProduto <= 0) {
                            System.out.println("Erro: O peso não pode ser um valor negativo ou zero!");  // Não deixa entrar valores negativo
                            System.out.println(space1);
                        } else if (pesoProduto < 5.0) {
                            System.out.printf("Produto (Leve) peso = %.2f Kg%n", pesoProduto);   // Condição de produto (Leve)
                            qnt_pro_leve++;
                            System.out.println(space1);
                        } else if (pesoProduto >= 5.0 && pesoProduto < 10.0) {
                            System.out.printf("Produto (Padrão) peso = %.2f Kg%n", pesoProduto);  // codição de produto (padão)
                            qnt_pro_padrao++;
                            System.out.println(space1);
                        } else {
                            System.out.printf("Produto (Pesado) peso = %.2f Kg%n", pesoProduto);  // condição de produto (pesado)
                            qnt_pro_pesado++;
                            System.out.println(space1);
                        }

                        System.out.print("Deseja classificar outro produto (S/N): ");   // capta a entrado para continual o loop
                        loop = input.next();

                    } while (loop.equalsIgnoreCase("S"));

                    String space3 = "-".repeat(60);
                    System.out.println(space3);

                    System.out.println("Quantidade de produtos (Leves)  processados: " + qnt_pro_leve);   //
                    System.out.println("Quantidade de produtos (Padrão) processados: " + qnt_pro_padrao); // apresentação dos valores armazenados
                    System.out.println("Quantidade de produtos (Pesado) processados: " + qnt_pro_pesado);   //
                    break;

                case 4:
                    String space1 = "-".repeat(60);
                    String space2 = "=".repeat(60);

                    System.out.println("Versão do Java em uso: " + System.getProperty("java.version"));
                    System.out.println(space1);

                    System.out.println("Este programa funciona em qualquer sistema operacional \n" +
                            "porque o Java não é compilado direto para a máquina\n" +
                            "mas sim para 'bytecode'. Quem roda o programa é a JVM\n" +
                            "(Máquina Virtual Java) que adapta o código para\n" +
                            "Windows, Mac ou Linux automaticamente.");
                    System.out.println(space2);
                    continue;

// EXIT MENU
                case 5:
                    System.out.println("Programa sendo finalizado...");    // Finalização do sistema
                    break;

                // TRATAMENTO DE ERROS PARA MULTIPLOS DIGITOS NO MENU
                default:
                    System.out.println("Erro: Número inválido! Escolha uma das opções do menu.");
                    break;
            }
        } while (opcaoMenu != 5);
        System.out.println("Programa encerrado com sucesso!");    // programa encerrado 
        input.close();
    }
}