import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class feedback1 extends JFrame implements ActionListener
{
	
    JTextField tf1,tf2;
    JTextArea ta1;
	  JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2,mi3;

    
	public feedback1()
	{
		setTitle("FEEDBACK FORM");
		setSize(700,700);
		setLayout(null);
		

        JMenuBar m=new JMenuBar();

        setJMenuBar(m);




        JMenu m1=new JMenu("Home");
        m.add(m1);
        mi1=new JMenuItem("goBack");
        m1.add(mi1);



        JMenu m2=new JMenu("Register");
        m.add(m2);
        mi2=new JMenuItem("Sign up");
        m2.add(mi2);
         

        
        JMenu m3=new JMenu("Suggestions");
        m.add(m3);
        mi3=new JMenuItem("open");
        m3.add(mi3);
       



        
        Label l=new Label("!! COMPLAINT FORM !!",Label.LEFT);
        l.setFont(new Font("Serif",Font.BOLD,20));
        l.setForeground(Color.RED);
        l.setBounds(30,30,250,30);
        add(l);

        
          
        Label l1=new Label("Your Complaints",Label.LEFT);
        l1.setFont(new Font("Serif",Font.BOLD,20));
        l1.setForeground(Color.GRAY);
        l1.setBounds(30,230,170,40);
        add(l1);



        Label l2=new Label("CustomerID",Label.LEFT);
        l2.setFont(new Font("Serif",Font.BOLD,20));
        l2.setForeground(Color.GRAY);
        l2.setBounds(30,80,170,30);
        add(l2);

        


        Label l3=new Label("Username",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.GRAY);
        l3.setBounds(30,130,170,30);
        add(l3);



        Label l4=new Label("Password",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.GRAY);
        l4.setBounds(30,180,170,30);
        add(l4);




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
        



        pf1=new JPasswordField();
        pf1.setFont(new Font("Serif",Font.BOLD,20));
        pf1.setBackground(Color.BLACK);
        pf1.setForeground(Color.WHITE);
        pf1.setBounds(200,180,200,30);
        add(pf1);
    



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.BLACK);
        ta1.setForeground(Color.WHITE);
        ta1.setBounds(200,230,470,200);
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
         mi2.addActionListener(this);
         mi3.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);

   
        
         addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });
	
      }


 void WriteToFile()
  {
    try 
        {
            File fl = new File("trial4.txt");
            char pass[]=pf1.getPassword();
            int id=Integer.parseInt(tf1.getText());
            String str2=tf2.getText();
            String str3=new String(pass);
            String str4=ta1.getText();
            FileWriter fw = new FileWriter(fl,true);
            fw.write(id+" ");
            fw.write(str2+" ");
            fw.write(str3+" ");
            fw.write(str4);
            fw.write("\r\n");
            fw.close();
            
        }
  catch(IOException  e)
       {
           e.printStackTrace(); 
       }
  }
          @Override
   public void actionPerformed(ActionEvent ae)
       {
         /* if(ae.getSource()==mi1)
              {
                  new home().setVisible(true);
               }*/
              if(ae.getSource()==mi2)
              {
                  new cust2().setVisible(true);
               }
               if(ae.getSource()==mi3)
              {
                  new feedback2().setVisible(true);
               }
            if(ae.getSource()==b1)
            {
              WriteToFile();
            }
            if(ae.getSource()==b2)
            {
              tf1.setText(null);
              tf2.setText(null);
              ta1.setText(null);
              pf1.setText(null);
            }


   
        } 


  public static void main(String args[])
  {
    new feedback1().setVisible(true);
  } 

      
}
