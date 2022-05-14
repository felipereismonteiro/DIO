package Criação.métodos.src;

public class Main {
    public static void main(String[] args){

        // Calculadora
        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subtração(9, 1.8);
        Calculadora.multiplicação(7, 8);
        Calculadora.divisão(5, 2.5);

        // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // Empréstimo
        System.out.println("Exercício empréstimo");
        Empréstimo.calcular(1000, Empréstimo.getDuasParcelas());
        Empréstimo.calcular(1000, 5);
        Empréstimo.calcular(1000, Empréstimo.getTresParcelas());
        
    }

}
