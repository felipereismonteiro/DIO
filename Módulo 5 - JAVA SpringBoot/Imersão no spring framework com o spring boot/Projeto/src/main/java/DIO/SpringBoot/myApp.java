package DIO.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class myApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception{
        System.out.println("O resultado é: " + calculadora.somar(2, 2));
    }
}
