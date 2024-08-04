package com.gustavolr.ContaBanco;

import java.util.Scanner;

/**
 * Classe para representar uma conta de um cliente de banco
 */
class ClienteBancario {

    private int numeroConta;
    private String agencia;
    private String nome;
    private float saldo;

    public ClienteBancario(int numeroConta, String agencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ClienteBancario [numeroConta=" + numeroConta + ", agencia=" + agencia + ", nome=" + nome + ", saldo=" + saldo
                + "]";
    }

    /**
     * Mensagem de boas vindas, quando uma nova conta é criada
     */
    public void mensagemBoasVindas() {
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, sua conta %s, e \nseu saldo %.2f já está disponível para saque.\n\n", nome, agencia, numeroConta, saldo);
    }
}

public class ContaTerminal {

    public static void main(String[] args) {
        // Criar leitor de dados
        Scanner leitor = new Scanner(System.in);

        // Cumprimentar usuário
        System.out.println("Seja bem vindo a sua Conta Bancaria!");

        // Fazendo leitura dos dados

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = lerNumero(leitor);

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = leitor.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Por fim, digite o saldo inicial da sua conta: ");
        float saldo = lerFloat(leitor);
        
        // Criando a conta do cliente
        var cliente = new ClienteBancario(numeroConta, agencia, nome, saldo);

        // Dando boas vindas ao cliente
        cliente.mensagemBoasVindas();

        // Mensagem de saida do sistema
        System.out.println("Tenha um ótimo dia!");

        // Fechar o Scanner
        leitor.close();
    }

    /**
     * Verifica se o valor lido pelo Scanner é um número inteiro válido!
     * @param sc é o Scanner
     * @return o valor lido que foi validado como um número
     */
    public static int lerNumero(Scanner sc) {

        int resultado = 0;
        boolean sucesso = false;

        // Enquanto o numero lido nao for um numero real
        while (!sucesso) {

            // Tentando ler o numero
            try {
                resultado = sc.nextInt();
                sc.nextLine();
                sucesso = true;
            } catch (Exception ex) { // Se o valor inserido nao for um numero
                System.out.println("Número inserido é inválido!\nTente novamente!");
                sc.nextLine();
            }

        }
        

        return resultado;
    }

    /**
     * Verifica se o valor lido pelo Scanner eh um numero real valido!
     * @param sc é o Scanner
     * @return o valor lido que foi validado como um número
     */
    public static float lerFloat(Scanner sc) {

        float resultado = 0;
        boolean sucesso = false;

        // Enquanto o numero lido nao for um numero real
        while (!sucesso) {

            // Tentando ler o numero
            try {
                resultado = sc.nextFloat();
                sc.nextLine();
                sucesso = true;
            } catch (Exception ex) { // Se o valor inserido nao for um numero
                System.out.println("Número inserido é inválido!\nTente novamente!");
                sc.nextLine();
            }

        }
        

        return resultado;
    }
}