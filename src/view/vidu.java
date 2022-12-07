package view;

import javax.swing.JFrame;

public class vidu {
    public static void main(String[] args) {
        JFrame temp = new JFrame();
        // gắn tên tiêu đề
        temp.setTitle("MENU SOCKET");
        // kích cỡ cửa sổ
        temp.setSize(600,400);
        //chọn vị trí để hiện cửa sổ
        temp.setLocation(300,200);


        // thoát ra khỏi chương trình khi đóng cửa sổ
        temp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // cho phép hiển thị(để dưới cùng)
        temp.setVisible(true);
    }
}
