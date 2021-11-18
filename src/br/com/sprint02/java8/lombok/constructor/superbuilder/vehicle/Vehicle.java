package br.com.sprint02.java8.lombok.constructor.superbuilder.vehicle;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Vehicle {


        private String marca;
        private String modelo;
        private String cor;
        private Double kmAtual = 0.0;

}


