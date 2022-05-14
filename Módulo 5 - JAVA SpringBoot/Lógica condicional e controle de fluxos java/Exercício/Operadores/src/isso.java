public class isso{
    public static void main(String[] args){
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println(b1 && b2); // and só é true se ambos forem true entao vai ser falso
        System.out.println(b1 && b3); 

        System.out.println(b2 || b3); // aqui vai dar falso só quando so 2 forem falsos
        System.out.println(b2 || b4);

        System.out.println(b1 ^ b3);
        System.out.println(b4 ^ b1); // e esse é para qunado eles forem diferentes

        System.out.println(!b1); //  inversão oq é true vira false e oq é false vira true
        System.out.println(!b2);
    
        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 25f;

        System.out.println((i1 + i2) < (f2 - f1) && true);
        System.out.println((i1 > i2) || (f2 < f1)); // basicamente maior e menor e nisso trará um resultado boleano 
    
        

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;
        
        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        boolean recebeAuxilio = ((salarioBaixo) && (muitosDependentes));

        System.out.println(recebeAuxilio);


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}