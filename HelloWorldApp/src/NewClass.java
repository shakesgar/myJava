import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
public class ButtonExample extends JFrame
{
    static final long serialVersionUID = 1L; //avoids compiler warning about serializable
    public ButtonExample()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // set to kill process on close
        setVisible(true);
        setSize(300,300);
        setTitle("Example 1");
        JButton x = new JButton("hello");
        JPanel p = new JPanel();
        p.add(x);
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        } );
        this.add(p);
    }
    private void xActionPerformed(java.awt.event.ActionEvent evt) {
        System.out.println("Hello!");
    }

public static void main(String[] args)
    {
     ButtonExample be = new ButtonExample();
    }
}