import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class z1 extends JFrame {
    JButton b1;
    JLabel l1, l2;
    JTextField t1, t2;
    eWork knopa = new eWork();
    public z1(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Сохранить");
        l1 = new JLabel("Введите текст не более 25 символов");
        l2 = new JLabel("Укажите путь к файлу");
        t1 = new JTextField("", 25);
        t2 = new JTextField("", 25);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        b1.addActionListener(knopa);
    }
    public static void main(String[] args) {
        z1 g = new z1("Запись в файл");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(300, 180);
        g.setLocationRelativeTo(null);
        g.setResizable(false);
    }

    public class eWork implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            if (t1.getText().length() > 25) {
                JOptionPane.showMessageDialog(null, "Введите текст не более 25 символов!");
                return;
            }
            String s1 = t1.getText();
            String s2 = t2.getText();
            try {
                if (e.getSource() == b1) {
                    File file = new File(s2);
                    FileWriter fwr = new FileWriter(file);
                    fwr.write(s1);
                    fwr.flush();
                    fwr.close();
                    JOptionPane.showMessageDialog(null, "Данные успешно записаны в файл!");
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Ошибка записи в файл: " + ex.getMessage());
            }
        }
    }
}
