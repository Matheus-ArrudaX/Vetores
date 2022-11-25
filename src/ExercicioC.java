import javax.swing.*;

public class ExercicioC {
    public static void main(String[] args) {

        int n = 20;
        int valores [] = new int[20];
        int maior = 0;
        int menor = 0;

        //Identificando o maior e o menor número entre os 20 números.

        for (int i = 0; i < valores.length; i++) {
            valores [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores: "));

            if (valores[i] > maior){
                maior = valores[i];
            }
        }
        for(int x = 0; x < valores.length; x++) {
            if (valores[x] < menor) {
                menor = valores[x];
            }
        }
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " +menor);


        //Calcular a média entre o maior e o menor valor.

        float media = (maior + menor)/2;

        System.out.println("A média entre o " +maior+ "e o " +menor+ "é: " +media);

    }




}


