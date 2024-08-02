import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

public class Main {
    private JFrame frame;
    private JPanel mainPanel;

    private ArrayList<String> operationLsit = new ArrayList<String>();

    private JLabel topLabel;
    private JLabel middleLabel;
    private JLabel bottomLabel;

    public Main() {
        frame = new JFrame("Calculator");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        frame.add(mainPanel);

        mainPanel.setLayout(new GridLayout(2, 0, 10, 5));
        mainPanel.setBackground(Color.GRAY);

        JPanel interactivePanel = new JPanel();
        interactivePanel.setBackground(Color.LIGHT_GRAY);
        interactivePanel.setLayout(new GridLayout(3, 0, 10, 5));
        this.initLabels(interactivePanel);
        mainPanel.add(interactivePanel);

        JPanel CalcPanel = new JPanel();
        CalcPanel.setBackground(Color.DARK_GRAY);
        CalcPanel.setLayout(new GridLayout(5, 4, 10, 5));
        this.initButtons(CalcPanel);
        mainPanel.add(CalcPanel);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    private void initLabels(JPanel displayPanel) {
        topLabel = new JLabel("topLabel", SwingConstants.RIGHT);
        displayPanel.add(topLabel);

        middleLabel = new JLabel("middleLabel", SwingConstants.RIGHT);
        displayPanel.add(middleLabel);

        bottomLabel = new JLabel("bottomLabel", SwingConstants.RIGHT);
        displayPanel.add(bottomLabel);
    }

    private void initButtons(JPanel calcPanel) {
        // First Row
        JButton buttonClear = new JButton("C");
        buttonClear.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonClear.setVerticalTextPosition(AbstractButton.CENTER);
        buttonClear.addActionListener(e -> ReceiveSymbol("C"));
        calcPanel.add(buttonClear);

        JButton buttonPercent = new JButton("%");
        buttonPercent.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonPercent.setVerticalTextPosition(AbstractButton.CENTER);
        buttonPercent.addActionListener(e -> ReceiveSymbol("%"));
        calcPanel.add(buttonPercent);

        JButton buttonDel = new JButton("Del");
        buttonDel.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDel.setVerticalTextPosition(AbstractButton.CENTER);
        buttonDel.addActionListener(e -> ReceiveSymbol("Del"));
        calcPanel.add(buttonDel);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDivide.setVerticalTextPosition(AbstractButton.CENTER);
        buttonDivide.addActionListener(e -> ReceiveSymbol("/"));
        calcPanel.add(buttonDivide);

        // Second Row
        JButton buttonSeven = new JButton("7");
        buttonSeven.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonSeven.setVerticalTextPosition(AbstractButton.CENTER);
        buttonSeven.addActionListener(e -> ReceiveSymbol("7"));
        calcPanel.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonEight.setVerticalTextPosition(AbstractButton.CENTER);
        buttonEight.addActionListener(e -> ReceiveSymbol("8"));
        calcPanel.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonNine.setVerticalTextPosition(AbstractButton.CENTER);
        buttonNine.addActionListener(e -> ReceiveSymbol("9"));
        calcPanel.add(buttonNine);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonMultiply.setVerticalTextPosition(AbstractButton.CENTER);
        buttonMultiply.addActionListener(e -> ReceiveSymbol("*"));
        calcPanel.add(buttonMultiply);

        // third Row
        JButton buttonFour = new JButton("4");
        buttonFour.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonFour.setVerticalTextPosition(AbstractButton.CENTER);
        buttonFour.addActionListener(e -> ReceiveSymbol("4"));
        calcPanel.add(buttonFour);

        JButton buttonFive = new JButton("5");
        buttonFive.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonFive.setVerticalTextPosition(AbstractButton.CENTER);
        buttonFive.addActionListener(e -> ReceiveSymbol("5"));
        calcPanel.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonSix.setVerticalTextPosition(AbstractButton.CENTER);
        buttonSix.addActionListener(e -> ReceiveSymbol("6"));
        calcPanel.add(buttonSix);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonMinus.setVerticalTextPosition(AbstractButton.CENTER);
        buttonMinus.addActionListener(e -> ReceiveSymbol("-"));
        calcPanel.add(buttonMinus);

        // Fourth Row
        JButton buttonOne = new JButton("1");
        buttonOne.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonOne.setVerticalTextPosition(AbstractButton.CENTER);
        buttonOne.addActionListener(e -> ReceiveSymbol("1"));
        calcPanel.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonTwo.setVerticalTextPosition(AbstractButton.CENTER);
        buttonTwo.addActionListener(e -> ReceiveSymbol("2"));
        calcPanel.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonThree.setVerticalTextPosition(AbstractButton.CENTER);
        buttonThree.addActionListener(e -> ReceiveSymbol("3"));
        calcPanel.add(buttonThree);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonPlus.setVerticalTextPosition(AbstractButton.CENTER);
        buttonPlus.addActionListener(e -> ReceiveSymbol("+"));
        calcPanel.add(buttonPlus);

        // Fifth Row
        JButton buttonDoubleZero = new JButton("00");
        buttonDoubleZero.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDoubleZero.setVerticalTextPosition(AbstractButton.CENTER);
        buttonDoubleZero.addActionListener(e -> ReceiveSymbol("00"));
        calcPanel.add(buttonDoubleZero);

        JButton buttonZero = new JButton("0");
        buttonZero.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonZero.setVerticalTextPosition(AbstractButton.CENTER);
        buttonZero.addActionListener(e -> ReceiveSymbol("0"));
        calcPanel.add(buttonZero);

        JButton buttonComa = new JButton(",");
        buttonComa.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonComa.setVerticalTextPosition(AbstractButton.CENTER);
        buttonComa.addActionListener(e -> ReceiveSymbol(","));
        calcPanel.add(buttonComa);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonEqual.setVerticalTextPosition(AbstractButton.CENTER);
        buttonEqual.addActionListener(e -> ReceiveSymbol("="));
        calcPanel.add(buttonEqual);
    }

    private void ReceiveSymbol(String c) {
        if (bottomLabel.getText().length() > 0 && bottomLabel.getText().charAt(0) == '=') {
            bottomLabel.setText("" + bottomLabel.getText().substring(1));
        }
        switch (c) {
            case "+":
            case "/":
            case "*":
                if (!operationLsit.isEmpty() || operationLsit.size() > 0) {
                    operationLsit.add(c);
                } else {
                    bottomLabel.setText("Error");
                    operationLsit.clear();
                }
                bottomLabel.setText(bottomLabel.getText() + c);
                break;
            case "-":
                operationLsit.add(c);
                bottomLabel.setText(bottomLabel.getText() + c);
                break;
            case "=":
                System.out.println(operationLsit);
                UpdateLabels();
                bottomLabel.setText(c + bottomLabel.getText());
                break;
            case "C":
                clearLabels();
                break;
            default:
                if (!operationLsit.isEmpty()) {
                    operationLsit.add(operationLsit.get(operationLsit.size() - 1) + c);
                } else {
                    operationLsit.add(c);
                }
                bottomLabel.setText(bottomLabel.getText() + c);
                break;
        }
        System.out.println(c);
    }

    private void UpdateLabels() {
        topLabel.setText(middleLabel.getText());
        middleLabel.setText(bottomLabel.getText());
        bottomLabel.setText("");

        for (String s : operationLsit) {
            bottomLabel.setText(bottomLabel.getText() + s);
        }

        operationLsit.clear();
    }

    private void clearLabels() {
        topLabel.setText("");
        middleLabel.setText("");
        bottomLabel.setText("");
    }
}
