import javax.swing.*; //
import java.awt.*; //
import java.awt.event.*; //

public class Calculator implements ActionListener {
    //
    JFrame frame;
    JTextField textField;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton plusButton, minusButton, multiplyButton, divideButton;
    JButton decimalButton, equalButton, deleteButton, clearButton;
    JPanel panel;
    Font myFont = new Font("Ink Free", Font.BOLD, 30);
    //
    double num1 = 0, num2 = 0, result = 0;
    char operator;

    // constructor
    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(null);
        //
        textField = new JTextField();
        textField.setBounds(25, 25,300, 30);
        textField.setFont(myFont);
        textField.setEditable(false);
        //
        frame.add(textField);
        frame.setVisible(true);
    }

    // main class
    public static void main(String[] args) {
        Calculator CalculatorProgram = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

}
