public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ponto pontoInicial = new Ponto(0, 0);
    Retangulo retangulo = new Retangulo(5, 3, pontoInicial);

    int opcao = 0;

    do {
        System.out.println("----- Menu -----");
        System.out.println("1. Alterar valores do retângulo");
        System.out.println("2. Imprimir centro do retângulo");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double altura = scanner.nextDouble();
                retangulo.alterarValores(largura, altura);
                break;
            case 2:
                Ponto centro = retangulo.encontrarCentro();
                centro.imprimir();
                break;
            case 3:
                System.out.println("Encerrando o programa...");
                break;
            default:
                System.out.println("Opção inválida. Digite novamente.");
        }

        System.out.println();
    } while (opcao != 3);

    scanner.close();
}
