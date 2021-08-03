package br.com.apresentacoes.sprint02.java8.interfacesfuncionais.defaultinterface;

public class BrazilInterestService implements InterestService {
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

}
