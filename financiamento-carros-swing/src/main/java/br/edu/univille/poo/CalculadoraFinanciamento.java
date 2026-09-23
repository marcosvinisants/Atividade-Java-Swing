package br.edu.univille.poo;

public class CalculadoraFinanciamento {

    private double valorVeiculo;
    private double entrada;
    private int numeroParcelas;
    private double taxaJuros;

    public CalculadoraFinanciamento(double valorVeiculo, double entrada, int numeroParcelas, double taxaJuros) {
        this.valorVeiculo = valorVeiculo;
        this.entrada = entrada;
        this.numeroParcelas = numeroParcelas;
        this.taxaJuros = taxaJuros;
    }

    public double getValorFinanciado() {
        return valorVeiculo - entrada;
    }

    public double getValorTotal() {
        return getValorFinanciado() * (1 + taxaJuros);
    }

    public double getValorParcela() {
        return getValorTotal() / numeroParcelas;
    }

    public double getTotalAPagar() {
        return getValorParcela() * numeroParcelas;
    }
}