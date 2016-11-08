import java.awt.*;
import javax.swing.*;

class GUI extends JFrame {
    
    String[] buttonsList = {
    "AC", "/", "*", "Backspace",
    "7", "8", "9", "10",
    "4", "5", "6", "7",
    "1", "2", "3", "4",
    "0", ".", "( )", "="
    };
    
    JButton[] jBArray;
    JTextArea text;
    JPanel buttonsPanel;
    MainController mainController;
    
    
    GUI() {
        
        super("Rick's Calculator");
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLookAndFeel();
        
        GridLayout gridMain = new GridLayout(2,1);
        super.setLayout(gridMain);
        text = new JTextArea();
        JPanel textPanel = new JPanel();
        textPanel.add(text);
        buttonsPanel = new JPanel();
        GridLayout grid1 = new GridLayout(5,4);
        buttonsPanel.setLayout(grid1);
        jBArray = new JButton[buttonsList.length];
        mainController = new MainController(this);
        createFormatAddActionListener(buttonsList, jBArray);
        
        super.add(textPanel);
        super.add(buttonsPanel);
        
        super.pack();
        super.setVisible(true);
    }
    
    public final void createFormatAddActionListener(String[] jBName, JButton[] jB) {
        Font buttonFont = new Font("Verdana", 0, 20);
        for (int i = 0; i < buttonsList.length; i++) {
            JButton button = new JButton(jBName[i]);
            jB[i] = button;
            button.setFont(buttonFont);
            button.addActionListener(mainController);
            buttonsPanel.add(button);
        }
    }
    
        private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                    "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException exc) {
            // ignore
        }
    }
}