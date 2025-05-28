public class Principal {
    public static void menu() {
        System.out.println("--- Gerenciamento EspaçoPet ---\n");
        System.out.println("1. Cadastrar cliente e pets");
        System.out.println("2. Cadastrar novo funcionário");
        System.out.println("3. Fazer uma busca");
        System.out.println("4. Excluir informações");
        System.out.println("5. Sair\n");
    }

    public static void main(String[] args) {
        while(true) {
            menu();
            int opcao = Teclado.leInt("Digite a opção desejada: ");

            switch(opcao) {
                case 1:
                    // System.out.println("\n--- Cadastro de Clientes ---");
                    break;
                case 2:
                    // cadastrar funcionario
                    break;
                case 3:
                    // fazer busca
                    break;
                case 4:
                    // excluir
                    break;
                case 5:
                    System.out.println("Até a próxima! :)");
                    return;
                default:
                    System.out.println("Ops! Opção inválida, tente novamente!\n");
            }
        }
    }
}