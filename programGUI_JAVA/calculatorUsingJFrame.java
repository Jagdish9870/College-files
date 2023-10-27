package programGUI_JAVA;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class calculatorUsingJFrame {

    public static void main(String[] args) {
        JFrame jf= new JFrame("calculator");
        jf.setBounds(10, 10, 200, 150);

        JLabel jl1 = new JLabel("enter first number");
        jl1.setBounds(20, 20, 200, 150);
         JLabel jl2 = new JLabel("enter second number");
        jl2.setBounds(20, 80, 200, 150);
         JLabel jl3 = new JLabel("result");
        jl3.setBounds(20, 140, 200, 150);
        JTextField jt1= new JTextField();
        jt1.setBounds(300 ,70,300,30 );
         JTextField jt2= new JTextField();
        jt2.setBounds(300 ,140,300,30 );
         JTextField jt3= new JTextField();
        jt3.setBounds(300 ,210,300,30 );
        jt3.setEditable(false);
        JButton jb1= new JButton("+");
        jb1.setBounds(350,280,80,30);
       
        JButton jb2= new JButton("-");
        jb2.setBounds(460,280,80,30);
        jf.add(jl1);
        jf.add(jl2);
        jf.add(jl3);
        jf.add(jt1);
        jf.add(jt2);
        jf.add(jt3);
        jf.add(jb1);
        jf.add(jb2);
        jb1.addActionListener((ActionEvent a)->
        {
            int num1=Integer.parseInt (jt1.getText());
            int num2= Integer.parseInt(jt2.getText());
            int num3= num1+num2;
            jt3.setText(" "+num3);
        }
        );
         jb2.addActionListener((ActionEvent a)->
        {
            int num1=Integer.parseInt (jt1.getText());
            int num2= Integer.parseInt(jt2.getText());
            int num3= num1-num2;
            jt3.setText(" "+num3);
        }
        );





        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
}
