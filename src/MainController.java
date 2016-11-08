import java.awt.event.*;

class MainController implements ActionListener {
    
    GUI gui;
    
    MainController(GUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        
    }
}