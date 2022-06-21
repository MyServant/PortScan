
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public void initwindow() {
        this.setSize(800, 800);//设置窗口大小
        this.setVisible(true);//设置窗口是否可见

        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置释放窗体
        this.setResizable(false);//设置窗口大小不可变
        this.setTitle("MP常见端口扫描器");//设置标题

        // 五种ui布局FlowLayout、BorderLayout、GridLayout、CardLayout、GridBagLayout
        // 显示文字的位置
        this.setLayout(new FlowLayout());
        // 使用 JLabel 文字
        JLabel label = new JLabel();
        label.setText("欢迎使用MP常见端口扫描器-JAVA版本-开发者：MyServant"); // 设置显示文字
        label.setFont(new Font("", Font.BOLD, 22));// 设置文字的字体及大小
        this.add(label);

    }

    public Frame() {
        initwindow();
    }

    public static void main(String[] args) {
        Frame frame = new Frame();
    }
}
