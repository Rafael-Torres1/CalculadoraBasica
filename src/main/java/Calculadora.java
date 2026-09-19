import javax.swing.*;

public class Calculadora {

    private double numero01;
    private double numero02;
    private double resultado;


    public Calculadora(double numero01, double numero02, double resultado){
        this.numero01 = numero01;
        this.numero02 = numero02;
        this.resultado = resultado;
    }

    public double getNumero01() {
        return numero01;
    }

    public double getNumero02() {
        return numero02;
    }

    public double getResultado() {
        return resultado;
    }

    public void setNumero01(double numero01) {
        this.numero01 = numero01;
    }

    public void setNumero02(double numero02) {
        this.numero02 = numero02;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }


    public void somar(){
        this.resultado = this.numero01 +this.numero02;
    }

    public void subtrair(){
        this.resultado = this.numero01 - this.numero02;
    }

    public void multiplicacao(){
        this.resultado = this.numero01 * this.numero02;
    }

    public void divisao(){
        if (this.numero02 != 0){
            this.resultado = this.numero01 / this.numero02;
        }
    }
}
