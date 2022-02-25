import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Main{

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 50, dimension.height/2 - 50, 100, 100);
        jFrame.setTitle("Pomodero");

        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);

        JButton button = new JButton("Start");
        jPanel.add(button);

        JLabel jLabel = new JLabel();
        jPanel.add(jLabel);

        jPanel.revalidate();

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton close = new JButton("Close");
                close.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.exit(1);
                    }
                });
                jPanel.remove(button);
                jPanel.add(close);
                jLabel.setText("Работаем :)");
                jPanel.revalidate();
            }
        });
    }
}
