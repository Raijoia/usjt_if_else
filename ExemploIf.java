import javax.swing.JOptionPane;

public class ExemploIf {
    static public void main(String [] args) {
        // declaração de varáveis
        // entrada
        double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota"));
        
        // processamento
        // saida
        if(nota >= 70) {
            JOptionPane.showMessageDialog(null, "Aprovado");
        } 
    }
}
