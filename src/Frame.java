
import javax.swing.*;

public class Frame extends JFrame {
    public void initwindow(){
        this.setSize(600,800);//设置窗口大小
        this.setVisible(true);//设置窗口是否可见
        this.setLocationRelativeTo(null);//设置窗口居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置释放窗体
        this.setResizable(false);//设置窗口大小不可变
        this.setTitle("仆scan");//设置标题
    }
    public Frame(){
        initwindow();
    }

    public static void main(String[] args) {
        Frame frame= new Frame();
    }
}
