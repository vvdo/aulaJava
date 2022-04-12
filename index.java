package exercicio3;

    //biblioteca do sacanner para receber info do teclado
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        float sal,salLiquid,descvt = 0, desc = 0;//variavel que recebe salario e calculo desconto 
        float i, j, k, l;//variaveis com percentual de desconto
        float a, b, c, d;//variaveis com valores dos salarios
        float dvt, vale, ticket, qtdias=0;
        float mes;
        
        a = 1212.00f;
        b = 2427.35f;
        c = 3641.03f;
        d = 7087.22f;

        i = 7.5f;
        j = 9f;
        k = 12f;
        l = 14f;
        dvt = 6f;
        ticket = 4.10f;
       
            //comando que recebe informação do teclado
        Scanner leituraTeclado = new Scanner(System.in);

            //solicita interação do usuario
        System.out.println("Digite seu salario");
        sal = leituraTeclado.nextFloat();
        
        System.out.println("Informe o mes");
        System.out.println("1 para Janeiro");
        System.out.println("2 para Fevereiro");
        System.out.println("3 para Março");
        System.out.println("4 para Abril");
        System.out.println("5 para Maio");
        System.out.println("6 para Junho");
        System.out.println("7 para Julho");
        System.out.println("8 para Agosto");
        System.out.println("9 para Setembro");
        System.out.println("10 para Outubro");
        System.out.println("11 para Novembro");
        System.out.println("12 para Dezembro");
        mes = leituraTeclado.nextFloat();
       
        //dias uteis por mes 2022
        //19 dias 4
        //20 dias 2, 10, 11
        //21 dias 1, 6, 7, 9
        //22 dias 3, 5, 12 
        //23 dias 8
        
        if (mes != 4)if (mes == 2 || mes == 10 || mes == 11){
            qtdias = 20;
        } else if (mes == 1 || mes == 6 || mes == 7 || mes == 9){
            qtdias = 21;
        } else if (mes == 3 || mes == 5 || mes == 12){
            qtdias = 22;
        } else if(mes == 8){
            qtdias = 23;
        } else {
            qtdias = 19;
        }
        
        descvt = sal * (dvt/100);
            //calculo de salarios com valor menor ou igual 1212,00 com desconto
            //de 7,5%
        if (sal <= a) {
            desc = sal * (i / 100);
            sal = sal - desc;

            //calculo de salarios com desconto 9%
        } else if (sal > a && sal <= b) {
            desc = sal * (j / 100);
            sal = sal - desc;

            //calculo de salarios com desconto 12%
        } else if (sal > b && sal <= c) {
            desc = sal * (k / 100);
            sal = sal - desc;

            //calculo de salarios com desconto 14%
        } else if (sal > c && sal <= d) {
            desc = sal * (l / 100);
            sal = sal - desc;

        } else {
            desc = d * (l / 100);
            sal = sal - desc;
        }
        salLiquid = sal;
        sal = sal - descvt;
        vale = qtdias * ticket;
        
        //Calculo de imposto de renda
        
            if ()
        
            //imprime resultado do desconto e do salario liquido
        System.out.format("Seu desconto será de: %.2f\n", desc);
        System.out.format("Desconto do vale transporte: %.2f\n", descvt);
        System.out.format("Você receberá de vale: %.2f\n", vale);
        System.out.format("Você receberá de salário: %.2f\n", sal);

    }

}
