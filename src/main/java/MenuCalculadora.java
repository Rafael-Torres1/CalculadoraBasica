public class MenuCalculadora {

    // Objetos usados para executar as operações da calculadora
    private Calculadora calculadora;
    private int opcao;
    private ConversorNumeros conversor;
    private EntradasaidaDados io;

    // Cria as dependências necessárias para o menu funcionar
    public MenuCalculadora() {
        this.calculadora = new Calculadora();
        this.conversor = new ConversorNumeros();
        this.io = new EntradasaidaDados();
    }

    // Loop principal da aplicação: repete até o usuário escolher sair
    public void executarCalculadora() {
        do {
            executarMenuPrincipal();
            if (opcao >= 1 && opcao <= 4) {
                aplicarOpcaoEscolhida();
            }
        } while (opcao != 0);
    }

    // Monta e mostra o menu com as opções disponíveis
    private void executarMenuPrincipal() {
        String menu = "=== CALCULADORA ===\n"
                + "1 - Somar\n"
                + "2 - Subtrair\n"
                + "3 - Multiplicar\n"
                + "4 - Dividir\n"
                + "0 - Sair\n\n"
                + "Escolha uma opção:";

        String entrada = io.EntradaDados(menu);
        if (entrada == null) {
            opcao = 0;
        } else {
            opcao = conversor.StrintToInt(entrada);
        }
    }

    // Lê os números, executa a operação escolhida e mostra o resultado
    public void aplicarOpcaoEscolhida() {
        String num1Str = io.EntradaDados("Digite o primeiro número:");
        String num2Str = io.EntradaDados("Digite o segundo número:");

        calculadora.setNumero01(conversor.StringToDouble(num1Str));
        calculadora.setNumero02(conversor.StringToDouble(num2Str));

        double res = 0;
        String operacao = "";

        switch (opcao) {
            case 1:
                res = calculadora.somar();
                operacao = "Soma";
                break;
            case 2:
                res = calculadora.subtrair();
                operacao = "Subtração";
                break;
            case 3:
                res = calculadora.multiplicar();
                operacao = "Multiplicação";
                break;
            case 4:
                if (calculadora.getNumero02() == 0) {
                    io.SaidaDados("Erro: Divisão por zero!");
                    return;
                }
                res = calculadora.dividir();
                operacao = "Divisão";
                break;
        }

        io.SaidaDados("Resultado da " + operacao + ": " + res);
    }
}