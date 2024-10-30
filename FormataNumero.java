//INTERNACIONALIZAÇÃO DE NUMEROS: 
package Java;

import java.text.NumberFormat;
import java.util.Locale;

public class FormataNumero {

    public static void main(String[] args) {

        double saldo = 555_999.900;
        NumberFormat f = NumberFormat.getInstance();  
        //(NumberFormat é abstrada e não pode ser instanciada, usamos esse método auxiliar para isso).

        //Usa o método auxiliar de NumberFormat "format" para formatar os números
        f.format(saldo);
        System.out.println(f.format(saldo));


        //Formata para um número inteiro (corta a fração):
        f = NumberFormat.getIntegerInstance();
        System.out.println(f.format(saldo)); 

        //Formata para um número em percentual:
        f = NumberFormat.getPercentInstance();
        System.out.println(f.format(0.25)); 

        //Formata para um valor em dinheiro conforme a moeda de um país:
        //PARA O BRASIL: (Java usando o local do meu pc como padrao)
        f = NumberFormat.getCurrencyInstance();     
        System.out.println(f.format(saldo)); 
        

        /* INTERNACIONALIZAÇÃO DE VALORES*/
        //PARA USA:
        f = NumberFormat.getCurrencyInstance(Locale.US);   
        System.out.println(f.format(saldo)); 
        
        //PARA FRANÇA:
        f = NumberFormat.getCurrencyInstance(Locale.FRANCE);   
        System.out.println(f.format(saldo));   
        
    }

}
