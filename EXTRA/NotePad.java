package EXTRA;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

public class NotePad {
     public static void main(String[] args) {
        JFrame jf= new JFrame("NOTEPAD");
        jf.setBounds(10, 10, 200, 150);
        JTextArea ta = new JTextArea(20,30);
        ta.setBounds(200, 200, 400, 400);
        JScrollPane sp = new JScrollPane(ta);
        sp.setBounds(600, 200, 400, 260);
        sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JTabbedPane tp= new JTabbedPane();
        tp.setBounds(200,200,400,400);

        JPanel p1= new JPanel();
        
        JPanel p2= new JPanel();
        JPanel p3= new JPanel();
        
        p1.add(new JScrollPane(ta));
        p2.add(new JLabel("edit"));

        p3.add(new JLabel("TERMS AND CONDITIONS"));

        tp.add("home",p1);
        tp.add("Edit",p2);
        tp.add("More",p3);  
        
        jf.add(tp);
        
        
        
        
        jf.setSize(500, 300);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
