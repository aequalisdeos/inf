import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class z2 extends JFrame {
    JButton b1, b2;
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField t1, t2, t3, t4, t5, t6;
    eWork knopa = new eWork();
    public z2(String s){
        super(s);
        setLayout(new FlowLayout());
        b1 = new JButton("Записать");
        b2 = new JButton("Загрузить");
        l1 = new JLabel("Напишите имя");
        l2 = new JLabel("Напишите фамилию");
        l3 = new JLabel("Напишите отчество");
        l4 = new JLabel("Напишите дату рождения");
        l5 = new JLabel("Укажите учебную группу");
        l6 = new JLabel("Укажите путь к файлу");
        t1 = new JTextField("", 25);
        t2 = new JTextField("", 25);
        t3 = new JTextField("", 25);
        t4 = new JTextField("", 25);
        t5 = new JTextField("", 25);
        t6 = new JTextField("", 25);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(l5);
        add(t5);
        add(l6);
        add(t6);
        add(b1);
        add(b2);
        b1.addActionListener(knopa);
        b2.addActionListener(knopa);
    }
    public static void main(String[] args) {
        z2 g = new z2("Запись в файл");
        g.setVisible(true);
        g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        g.setSize(300, 400);
        g.setLocationRelativeTo(null);
        g.setResizable(false);
    }
    public class eWork implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            String s3 = t3.getText();
            String s4 = t4.getText();
            String s5 = t5.getText();
            String s6 = t6.getText();
            try {
                if (e.getSource() == b1) {
                    File file = new File(s6);
                    FileWriter fwr = new FileWriter(file);
                    fwr.write(s1 + "\n");
                    fwr.write(s2 + "\n");
                    fwr.write(s3 + "\n");
                    fwr.write(s4 + "\n");
                    fwr.write(s5 + "\n");
                    fwr.flush();
                    fwr.close();
                    JOptionPane.showMessageDialog(null, "Данные успешно записаны в файл!");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Файл не найден: " + ex.getMessage());
            }
            try{
                if (e.getSource() == b2) {
                    File file = new File(s6);
                    BufferedReader read = new BufferedReader(new FileReader(file));
                    t1.setText(read.readLine());
                    t2.setText(read.readLine());
                    t3.setText(read.readLine());
                    t4.setText(read.readLine());
                    t5.setText(read.readLine());
                    read.close();
                    JOptionPane.showMessageDialog(null, "Данные успешно загружены из файла!");
                }
            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "Файл не найден!" + ex.getMessage());
            }
        }
    }
}
