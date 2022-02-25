import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quadratic {
   JFrame frame;
   JPanel formulaPanel, buttonPanel;
   LTPanel aPanel, bPanel, cPanel, answerPanel;
   JLabel formulaLabel;
   JButton clearButton, calculateButton;
    public Quadratic() {
        // Set up the frame
        JFrame frame = new JFrame("Quadratic Formula");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set up and add the panels
        JPanel formulaPanel = new JPanel();
        LTPanel aPanel = new LTPanel("a =", 10);
        LTPanel bPanel = new LTPanel("b =", 10);
        LTPanel cPanel = new LTPanel("c =", 10);
        JPanel buttonPanel = new JPanel();
        LTPanel answerPanel = new LTPanel("Answer:", 10);

        frame.add(formulaPanel);
        frame.add(aPanel);
        frame.add(bPanel);
        frame.add(cPanel);
        frame.add(buttonPanel);
        frame.add(answerPanel);

        // Set up individual panels
        // formulaPanel code
        JLabel formulaLabel = new JLabel("ax^2 + bx + c = 0");
        formulaPanel.add(formulaLabel);

        // buttonPanel code
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                aPanel.setText("");
                bPanel.setText("");
                cPanel.setText("");
            }
        });

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                // Potentially a lot of code here
                // But just add code to call quadForm

                // YOUR CODE HERE
            }
        });

        buttonPanel.add(clearButton);
        buttonPanel.add(calculateButton);

        // pack and show
        frame.pack();
        frame.setVisible(true);
    }

    public void quadForm() {
        int a_val=Integer.parseInt(aPanel.getText());
        int b_val=Integer.parseInt(bPanel.getText());
        int c_val=Integer.parseInt(cPanel.getText());
        double discrim = Math.sqrt((b_val*b_val)-(4*a_val*c_val));
        double ans= (-(b_val)+discrim)/(2*a_val);
        String answer = ""+ans;
        answerPanel.setText(answer);

    }

    public static void main(String[] args) {
        Quadratic q = new Quadratic();
    }
}
