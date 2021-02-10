
import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomNumber extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JPanel chartPanel;
    private JTextField termField;
    double a;
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    RandomNumber frame = new RandomNumber();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
  
    public RandomNumber() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 200, 450, 450);
       
        setLayout(new GridLayout(10,10));

      
        Random random =new Random();

      
        JTextField field;
        for(int i=0;i<100;i++) {
            field =new JTextField(1);
            field.setText(Integer.toString(random.nextInt(2)));
            add(field);
        }
        setSize(300,300);
    }
}
