public class Principal {
    public static void menu() {
        System.out.println("--- Gerenciamento EspaçoPet ---\n");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Cadastrar pet");
        System.out.println("3. Cadastrar novo funcionário");
        System.out.println("4. Fazer uma busca");
        System.out.println("5. Excluir informações");
        System.out.println("6. Sair\n");
    }

    public static void main(String[] args) {
        Sistema quantClientes = new Sistema(20);

        while(true) {
            menu();
            int opcao = Teclado.leInt("Digite a opção desejada: ");

            switch(opcao) {
                case 1:
                    quantClientes.maisClientes();
                    System.out.println("\n--- Cadastro de Clientes ---\n");

                    Cliente cliente = new Cliente(Teclado.leString("Nome: "),
                            new Endereco(Teclado.leString("Rua: "),
                                    Teclado.leString("Cidade: "),
                                    Teclado.leString("Estado: "),
                                    Teclado.leString("País: "),
                                    Teclado.leString("CEP: "),
                                    Teclado.leString("Número: "),
                                    Teclado.leString("Complemento: ")),
                            Teclado.leInt("Quantos pets gostaria de cadastrar? "));

                    System.out.println("\nCliente cadastrado!");
                    System.out.println("Para cadastrar os pets, selecione a opção 2 do menu.\n");
                    break;
                case 2:
                    System.out.println("\n--- Cadastro de Pets ---\n");
                    String nomeCliente = Teclado.leString("Digite o nome do cliente para adicionar o pet: ");

                    if(nomeCliente)
                    break;
                case 3:
                    // cadastrar funcionario
                    break;
                case 4:
                    // fazer busca
                    break;
                case 5:
                    // excluir
                    break;
                case 6:
                    System.out.println("Até a próxima! :)");
                    return;
                default:
                    System.out.println("Ops! Opção inválida, tente novamente!\n");
            }
        }
    }
}