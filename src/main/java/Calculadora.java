public class Calculadora {

    // Armazena os valores digitados pelo usuário
    private double numero01;
    private double numero02;

    // Guarda o resultado da operação realizada
    private double resultado;

    // Retorna o primeiro número
    public double getNumero01() {
        return numero01;
    }

    // Define o primeiro número
    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    // Retorna o segundo número
    public double getNumero02() {
        return numero02;
    }

    // Define o segundo número
    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    // Retorna o último resultado calculado
    public double getResultado() {
        return resultado;
    }

    // Soma os dois números e retorna o resultado
    public double somar() {
        this.resultado = this.numero01 + this.numero02;
        return this.resultado;
    }

    // Subtrai o segundo número do primeiro
    public double subtrair() {
        this.resultado = this.numero01 - this.numero02;
        return this.resultado;
    }

    // Multiplica os dois números
    public double multiplicar() {
        this.resultado = this.numero01 * this.numero02;
        return this.resultado;
    }

    // Divide o primeiro número pelo segundo, evitando divisão por zero
    public double dividir() {
        if (this.numero02 != 0) {
            this.resultado = this.numero01 / this.numero02;
        } else {
            this.resultado = 0;
        }
        return this.resultado;
    }
}