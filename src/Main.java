import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JButtonExample extends JFrame {
    private JLabel lb;

    public JButtonExample() {
        // create JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(new GridLayout(2, 1, 30, 30));

        // create JLabel
        lb = new JLabel("Label Title");
        lb.setHorizontalAlignment(JLabel.CENTER);
        //add(lb);

        // Tạo Button
        JButton btn = new JButton("chụp");
        JButton btn1 = new JButton("tắt");
        JButton btn2 = new JButton("mở");
        JButton btn3 = new JButton("task");
        // Lắng nghe sự kiện Click và xử lý
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                changeTextJLabel();

            }
        });
        add(btn);
        add(btn1);
        add(btn2);
        add(btn3);
        // display JFrame
        setLocationRelativeTo(null);
        setVisible(true);
    }

    // change text of lb
    private void changeTextJLabel() {
        lb.setText("Bạn đã nhấp vào Button");
    }

    public static void main(String[] args) {
        new JButtonExample();
    }
}