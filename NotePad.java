

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePad {
     public static void main(String[] args) {
        JFrame jf= new JFrame("NOTEPAD");
        jf.setBounds(10, 10, 200, 150);
        JTextArea ta = new JTextArea(20,30);
        ta.setBounds(200, 200, 200, 200);
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(600, 200, 400, 260);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(sp);
        
        
        
        
        jf.setSize(500, 300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
