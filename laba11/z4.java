import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class z4 extends JFrame {
    JButton b1;
    JLabel l1;
    JTextField t1, t2, t3, t4, t5, t6, t7;
    eWork knopa = new eWork();
    public z4(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Вычислить");
        l1 = new JLabel("Рандомные числа");
        t1 = new JTextField("",10);
        t2 = new JTextField("",10);
        t3 = new JTextField("",10);
        t4 = new JTextField("",10);
        t5 = new JTextField("",10);
        t6 = new JTextField("",10);
        t7 = new JTextField("",10);
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t5.setEditable(false);
        t6.setEditable(false);
        t7.setEditable(false);
        add(l1);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(t5);
        add(t6);
        add(t7);
        add(b1);
        b1.addActionListener(knopa);
    }
    public static void main(String[] args) {
        z4 g = new z4("Вычисление случ. чисел");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(150, 300);
        g.setLocationRelativeTo(null);
        g.setResizable(true);
    }
    public class eWork implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            try {
                if (e.getSource() == b1) {
                    Random rand = new Random();
                    t1.setText(String.valueOf(rand.nextInt(1000)));
                    t2.setText(String.valueOf(rand.nextInt(1000)));
                    t3.setText(String.valueOf(rand.nextInt(1000)));
                    t4.setText(String.valueOf(rand.nextInt(1000)));
                    t5.setText(String.valueOf(rand.nextInt(1000)));
                    t6.setText(String.valueOf(rand.nextInt(1000)));
                    t7.setText(String.valueOf(rand.nextInt(1000)));
                    JOptionPane.showMessageDialog(null, "Данные успешно записаны!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ошибка! " + ex.getMessage());
            }
        }
    }
}
