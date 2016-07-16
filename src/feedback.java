import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
class feedback extends JFrame implements ActionListener
{

	
   public JTextField tf1,tf2,tf3;
   public  JTextArea ta1;
	  JButton b1,b2;
   public JPasswordField pf1;
    JMenuItem mi1,mi2,mi3;

    
  feedback()
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
        l.setBounds(30,20,250,30);
        add(l);

        
          
        Label l1=new Label("Your Complaints",Label.LEFT);
        l1.setFont(new Font("Serif",Font.BOLD,20));
        l1.setForeground(Color.GRAY);
        l1.setBounds(30,280,170,40);
        add(l1);



        Label l2=new Label("CustomerID",Label.LEFT);
        l2.setFont(new Font("Serif",Font.BOLD,20));
        l2.setForeground(Color.GRAY);
        l2.setBounds(30,70,170,30);
        add(l2);

        


        Label l3=new Label("Username",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.GRAY);
        l3.setBounds(30,120,170,30);
        add(l3);



        Label l4=new Label("Password",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.GRAY);
        l4.setBounds(30,170,170,30);
        add(l4);




        tf1=new JTextField();
        tf1.setFont(new Font("Serif",Font.BOLD,20));
        tf1.setBackground(Color.BLACK);
        tf1.setForeground(Color.WHITE);
        tf1.setBounds(200,70,200,30);
        add(tf1);
    

        

        tf2=new JTextField();
        tf2.setFont(new Font("Serif",Font.BOLD,20));
        tf2.setBackground(Color.BLACK);
        tf2.setForeground(Color.WHITE);
        tf2.setBounds(200,120,200,30);
        add(tf2);
        



        pf1=new JPasswordField();
        pf1.setFont(new Font("Serif",Font.BOLD,20));
        pf1.setBackground(Color.BLACK);
        pf1.setForeground(Color.WHITE);
        pf1.setBounds(200,170,200,30);
        add(pf1);
    



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.BLACK);
        ta1.setForeground(Color.WHITE);
        ta1.setBounds(200,270,470,200);
        add(ta1);
    
        

        Label l5=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l5.setFont(new Font("Serif",Font.BOLD,25));
        l5.setForeground(Color.RED);
        l5.setBackground(Color.YELLOW);
        l5.setBounds(0,550,700,30);
        add(l5);



        Label l6=new Label("Date",Label.LEFT);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setForeground(Color.GRAY);
        l6.setBounds(30,220,170,30);
        add(l6);




        tf3=new JTextField();
        tf3.setFont(new Font("Serif",Font.BOLD,20));
        tf3.setBackground(Color.BLACK);
        tf3.setForeground(Color.WHITE);
        tf3.setBounds(200,220,200,30);
        add(tf3);


        b1=new JButton("Send");
        b1.setBackground(Color.GRAY);
        b1.setBounds(450,500,80,30);
        add(b1);



        b2=new JButton("Clear");
        b2.setBackground(Color.GRAY);
        b2.setBounds(550,500,80,30);
        add(b2);
        


    
        
         mi1.addActionListener(this);
         mi2.addActionListener(this);
         mi3.addActionListener(this);
         b1.addActionListener(this);
         b2.addActionListener(this);
         add(tf2);

   
        
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
            File fl = new File("trial3.txt");
            char pass[]=pf1.getPassword();
            int id=Integer.parseInt(tf1.getText());
            String str2=tf2.getText();
           // String str3=new String(pass);
            String str4=ta1.getText();
            String str5=tf3.getText();
            FileWriter fw = new FileWriter(fl,true);
            fw.write(id+"    ");
            fw.write(str5+"   ");
            fw.write(str2+"    ");
           // fw.write(str3+"    ");
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
                pf1.setText(null);
                ta1.setText(null);
              }



   
        }  

  public static void main(String args[])
  {
    new feedback().setVisible(true);

  } 

    
	
}

