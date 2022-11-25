import javax.swing.*;
import java.util.EnumSet;

public class ExercicioB {
    public static void main(String[] args) {

        float soma = 0;
        float [] vetor = new float[20];
        for (int i = 0; i< vetor.length; i++) {
            String valor = JOptionPane.showInputDialog("Qual o valor: ");
            vetor[i] = Float.parseFloat(valor);
        }
           for (int i = 0; i< vetor.length; i++){
               soma = soma + vetor[i];
           }
           float media = soma / vetor.length;
           JOptionPane.showMessageDialog(null, "A média = " +media);
    }

}
