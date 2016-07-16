import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class feedback2 extends JFrame implements ActionListener
{
	
    JTextField tf1,tf2;
    JTextArea ta1;
	JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2;
	feedback2()
	{
		setTitle("FEEDBACK FORM");
		setSize(700,700);
		setLayout(null);
		

        JMenuBar m=new JMenuBar();
        setJMenuBar(m);

        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Back");
        m1.add(mi1);
         

       



        
        Label l=new Label("!! SUGGESTION FORM !!",Label.LEFT);
        l.setFont(new Font("Serif",Font.BOLD,20));
        l.setForeground(Color.RED);
        l.setBounds(30,30,250,30);
        add(l);

        
          
        Label l1=new Label("Suggestions",Label.LEFT);
        l1.setFont(new Font("Serif",Font.BOLD,20));
        l1.setForeground(Color.GRAY);
        l1.setBounds(30,200,170,40);
        add(l1);



        Label l2=new Label("CustomerName",Label.LEFT);
        l2.setFont(new Font("Serif",Font.BOLD,20));
        l2.setForeground(Color.GRAY);
        l2.setBounds(30,80,170,30);
        add(l2);

        


        Label l3=new Label("Email id",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.GRAY);
        l3.setBounds(30,130,170,30);
        add(l3);




        tf1=new JTextField();
        tf1.setFont(new Font("Serif",Font.BOLD,20));
        tf1.setBackground(Color.BLACK);
        tf1.setForeground(Color.WHITE);
        tf1.setBounds(200,80,200,30);
        add(tf1);
    

        

        tf2=new JTextField();
        tf2.setFont(new Font("Serif",Font.BOLD,20));
        tf2.setBackground(Color.BLACK);
        tf2.setForeground(Color.WHITE);
        tf2.setBounds(200,130,200,30);
        add(tf2);
        

    



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.BLACK);
        ta1.setForeground(Color.WHITE);
        ta1.setBounds(200,180,470,200);
        add(ta1);
    
        

        Label l5=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l5.setFont(new Font("Serif",Font.BOLD,25));
        l5.setForeground(Color.RED);
        l5.setBackground(Color.YELLOW);
        l5.setBounds(0,550,700,30);
        add(l5);


        b1=new JButton("Send");
        b1.setBackground(Color.GRAY);
        b1.setBounds(450,450,80,30);
        add(b1);



        b2=new JButton("Clear");
        b2.setBackground(Color.GRAY);
        b2.setBounds(550,450,80,30);
        add(b2);



        mi1.addActionListener(this);
        
        
        addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });
	}


       @Override
   public void actionPerformed(ActionEvent ae)
       {
          if(ae.getSource()==mi1)
              {
                  new feedback1().setVisible(true);
               }
              
       }  


	public static void main(String args[])
	{
		new feedback2().setVisible(true);
	}
}