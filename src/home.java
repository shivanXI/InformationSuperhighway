import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class home extends JFrame implements ActionListener
{   
	  JLabel l1,l2,l3,l4,l5;
	  JButton b1,b2;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8;
	
     home(){
		 setTitle("HOME PAGE");
		 setSize(650,650);
         setLayout(null);


         JMenuBar m=new JMenuBar();
         setJMenuBar(m);

         JMenu m1=new JMenu("Administrator");
         m.add(m1);
         mi1=new JMenuItem("Admin Page");
         m1.add(mi1);




        JMenu m2=new JMenu("Employee");
        m.add(m2);
        mi2=new JMenuItem(">>");
        m2.add(mi2);
        


        JMenu m3=new JMenu("Customer");
        m.add(m3);
        mi4=new JMenuItem("Registered");
        m3.add(mi4);
        m3.addSeparator();
        mi5=new JMenuItem("Unregistered");
        m3.add(mi5);


        JMenu m4=new JMenu("Feedback");
        m.add(m4);
        mi6=new JMenuItem("Complaints");
        m4.add(mi6);
        m4.addSeparator();
        mi7=new JMenuItem("Suggestions");
        m4.add(mi7);

 

        JMenu m5=new JMenu("About Us");
        m.add(m5);
        mi8=new JMenuItem("Info");
        m5.add(mi8);

	


         Label l1=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
         l1.setFont(new Font("Serif",Font.BOLD,25));
         l1.setForeground(Color.RED);
         l1.setBackground(Color.YELLOW);
         l1.setBounds(0,550,650,30);
         add(l1);


         mi1.addActionListener(this);
         mi2.addActionListener(this);
         mi4.addActionListener(this);
         mi5.addActionListener(this);
         mi6.addActionListener(this);
         mi7.addActionListener(this);
         mi8.addActionListener(this);
        




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
          new admin().setVisible(true);
          this.dispose();
      }
      if(ae.getSource()==mi2)
      {
          new emp1().setVisible(true);
          this.dispose();
      }
      if(ae.getSource()==mi4)
      {
          new cust1().setVisible(true);
          this.dispose();
      }
      if(ae.getSource()==mi5)
      {
          new cust2().setVisible(true);
          this.dispose();
      }
      if(ae.getSource()==mi6)
      {
          new feedback().setVisible(true);
          this.dispose();
      }
     if(ae.getSource()==mi7)
      {
          new feedback1().setVisible(true);
          this.dispose();
      }
      if(ae.getSource()==mi8)
      {
          JOptionPane.showMessageDialog(null,"hello");
      }
   }
        
    
 public static void main(String args[])
	{
		new home().setVisible(true);
	}
}