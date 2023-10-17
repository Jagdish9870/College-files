package EXTRA;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollBar {
    public static void main(String[] args, int HORIZONTAL_SCROLLBAR_ALWAYS, int VERTICAL_SCROLLBAR_ALWAYS) {
        JFrame jf= new JFrame("hii");
        jf.setSize(500, 300);
        JTextArea ta = new JTextArea("scroll bar");
      
        JScrollPane sp = new JScrollPane(ta);
        sp.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);
        jf.add(sp);
     
        
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
