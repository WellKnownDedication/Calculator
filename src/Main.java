import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.GridLayout;

public class Main {
    private JFrame frame;
    private JPanel mainPanel;

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
        JLabel topLabel = new JLabel("topLabel", SwingConstants.RIGHT);
        displayPanel.add(topLabel);

        JLabel middleLabel = new JLabel("middleLabel", SwingConstants.RIGHT);
        displayPanel.add(middleLabel);

        JLabel bottomLabel = new JLabel("bottomLabel", SwingConstants.RIGHT);
        displayPanel.add(bottomLabel);
    }

    private void initButtons(JPanel calcPanel) {
        // First Row
        JButton buttonClear = new JButton("C");
        buttonClear.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonClear.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonClear);

        JButton buttonPercent = new JButton("%");
        buttonPercent.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonPercent.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonPercent);

        JButton buttonDel = new JButton("Del");
        buttonDel.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDel.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonDel);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDivide.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonDivide);

        // Second Row
        JButton buttonSeven = new JButton("7");
        buttonSeven.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonSeven.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonSeven);

        JButton buttonEight = new JButton("8");
        buttonEight.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonEight.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonEight);

        JButton buttonNine = new JButton("9");
        buttonNine.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonNine.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonNine);

        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonMultiply.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonMultiply);

        // third Row
        JButton buttonFour = new JButton("4");
        buttonFour.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonFour.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonFour);

        JButton buttonFive = new JButton("5");
        buttonFive.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonFive.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonFive);

        JButton buttonSix = new JButton("6");
        buttonSix.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonSix.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonSix);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonMinus.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonMinus);

        // Fourth Row
        JButton buttonOne = new JButton("1");
        buttonOne.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonOne.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonOne);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonTwo.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonTwo);

        JButton buttonThree = new JButton("3");
        buttonThree.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonThree.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonThree);

        JButton buttonPlus = new JButton("+");
        buttonPlus.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonPlus.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonPlus);

        // Fifth Row
        JButton buttonDoubleZero = new JButton("00");
        buttonDoubleZero.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonDoubleZero.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonDoubleZero);

        JButton buttonZero = new JButton("0");
        buttonZero.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonZero.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonZero);

        JButton buttonComa = new JButton(",");
        buttonComa.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonComa.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonComa);

        JButton buttonEqual = new JButton("=");
        buttonEqual.setHorizontalTextPosition(AbstractButton.CENTER);
        buttonEqual.setVerticalTextPosition(AbstractButton.CENTER);
        calcPanel.add(buttonEqual);
    }
}
