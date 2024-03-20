import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static Frame window = new Frame("Matthew Hammons- SkillsUSA State Prompt");
    public static Button submitButton = new Button("Submit");
    public static TextField inputBox = new TextField("");
    public static TextArea outputBox = new TextArea("");
    public static void main(String[] args) {



        outputBox.setForeground(Color.lightGray);
        outputBox.setBackground(Color.darkGray);
        outputBox.setBounds(100, 100, 600, 300);
        outputBox.setEditable(false);


        inputBox.setForeground(Color.lightGray);
        inputBox.setBackground(Color.darkGray);
        inputBox.setBounds(268, 500, 200, 30);


        submitButton.setBounds(468, 500, 64, 30);
        submitButton.addActionListener(e -> parseInput(inputBox.getText()));


        window.add(outputBox);
        window.add(inputBox);
        window.add(submitButton);
        window.setSize(800,600);
        window.setLayout(new BorderLayout());
        window.setBackground(Color.black);
        window.setVisible(true);

        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void parseInput(String userInput) {
        inputBox.setText("");
        outputBox.setText(userInput);
    }
}