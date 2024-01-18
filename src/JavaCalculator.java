import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private  double total1 = 0.0;
    private  double total2 = 0.0;
    private  char math_operator;
    private JPanel JavaCalculator;
    private JTextField numberDisplay;
    private JButton btnOne;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnDecimal;
    private JButton btnTwo;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnThree;
    private JButton btnSix;
    private JButton btnNine;
    private JButton btnClear;
    private JButton btnMultiply;
    private JButton btnDivide;
    private JButton btnAdd;
    private JButton btnMinus;
    private JButton btnEqual;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(numberDisplay.getText());
        numberDisplay.setText("");
    }
    public JavaCalculator() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = numberDisplay.getText() + btnOne.getText();
                numberDisplay.setText(btnOneText);
            }
        });
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = numberDisplay.getText() + btnTwo.getText();
                numberDisplay.setText(btnTwoText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = numberDisplay.getText() + btnThree.getText();
                numberDisplay.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = numberDisplay.getText() + btnFour.getText();
                numberDisplay.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = numberDisplay.getText() + btnFive.getText();
                numberDisplay.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = numberDisplay.getText() + btnSix.getText();
                numberDisplay.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = numberDisplay.getText() + btnSeven.getText();
                numberDisplay.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = numberDisplay.getText() + btnEight.getText();
                numberDisplay.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = numberDisplay.getText() + btnNine.getText();
                numberDisplay.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = numberDisplay.getText() + btnZero.getText();
                numberDisplay.setText(btnZeroText);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnAdd.getText();
                getOperator(button_text);
            }
        });
        btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(numberDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(numberDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(numberDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(numberDisplay.getText());
                        break;
                }
                numberDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                numberDisplay.setText("");
            }
        });
        btnDecimal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (numberDisplay.getText().equals("")){
                    numberDisplay.setText("0.1");
                }
                else if (numberDisplay.getText().contains(".")) {
                    btnDecimal.setEnabled(false);
                }
                else {
                    String btnDecimalText = numberDisplay.getText() + btnDecimal.getText();
                    numberDisplay.setText(btnDecimalText);
                }
                btnDecimal.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnDivide.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
