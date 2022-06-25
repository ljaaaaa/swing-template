import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {
    MyKeyListener keyListener;
    MyMouseListener mouseListener;

    public Main(){
        keyListener = new MyKeyListener();
        mouseListener = new MyMouseListener();

        setUpFrame();
    }

    public void setUpFrame(){
        JFrame f = new JFrame("Swing Template");
        f.setIconImage(new ImageIcon("images/image.png").getImage());
        f.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        f.setLayout(null);

        f.addMouseListener(mouseListener);

        f.addKeyListener(keyListener);
        f.setFocusable(true);
        
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}