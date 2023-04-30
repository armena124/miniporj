import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;


public class GameMenu extends JFrame
{
    
    public static void main(String[] args)
    {
        Themain();
    }
        
    public static void Themain()
    {
        
        JFrame screen = new JFrame("Illusion Lane Menu");
        screen.setSize(600, 500);
 
      
        JLabel headerLabel = new JLabel("Illusion Lane");
        headerLabel.setBounds(250, 50, 400, 50);
        headerLabel.setFont(new Font("serif", Font.PLAIN, 30));
        screen.add(headerLabel);
    
       
        //set background 
         Container cp = screen.getContentPane();
         cp.setBackground(new Color(112,162,65));
        

        JButton play_game = new JButton("Play game");
        play_game.setBounds(190, 100, 250, 30);
        screen.add(play_game);
        play_game.addActionListener(new ActionListener()

        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
            
            }
        });

        JButton Exit = new JButton("Exit");
        Exit.setBounds(190, 200, 250, 30);
        screen.add(Exit);

        Exit.addActionListener(new ActionListener()
        {
            public void actionPerformed (ActionEvent e)
            {
                screen.dispose();
            }
        });

        screen.setLayout(null);
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        screen.setResizable(false);
        screen.setVisible(true);

        JButton instructions = new JButton("Instructions");
        instructions.setBounds(190, 150, 250, 30);
        screen.add(instructions);

        instructions.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                screen.dispose();
                instruction_screen();
            }
        });
    }
    
    public static void instruction_screen()
    {
        JFrame instr = new JFrame("Instructions");
        instr.setSize(400,400);

        JButton goBack = new JButton("Go back");
        goBack.setBounds(120,150,150,20);
        instr.add(goBack);
        goBack.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                instr.dispose();
                Themain();
            }
        });

        JLabel instructions = new JLabel("Guess the number i'm thinking of (1-100)");
        instructions.setBounds(75, 100, 300, 50);
        instr.add(instructions);

         

        instr.setLayout(null);
        instr.setResizable(false);
        instr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        instr.setVisible(true);
    }
}
