class ordemInversa{
    public static void main(String[] args){
        int[] vetor = {1,2,3,4,5};
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i--){
            
            System.out.print(vetor[i] + " ");
        }
    }
}