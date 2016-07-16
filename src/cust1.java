import javax.swing.*;
import java.io.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
public class cust1 extends JFrame implements ActionListener
{
	
  JTextField tf1,tf2;
	JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2;
	cust1()
	{
		setTitle("CUSTOMER HOME PAGE");
		setSize(650,650);
		setLayout(null);
		


       
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Home");
        m1.add(mi1);

        JMenu m2=new JMenu("Register");
        m.add(m2);
        mi2=new JMenuItem("Form");
        m2.add(mi2);
       

     


        Label l1=new Label("Customer Login from here.....",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(50,50,500,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,550,650,30);
        add(l2);



        Label l3=new Label("User id",Label.RIGHT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(170,150,137,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,150,200,30);
        add(tf1);


        
        Label l4=new Label("Username",Label.RIGHT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(170,200,160,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,200,200,30);
        add(tf2);


        


        Label l5=new Label("Password",Label.RIGHT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(170,250,155,30);
        add(l5);


        
        pf1=new JPasswordField();
        pf1.setBounds(340,250,200,30);
        add(pf1);




        b1=new JButton("Submit");
        b1.setBounds(280,300,100,30);
        add(b1);
         



        b2=new JButton("Reset");
        b2.setBounds(410,300,100,30);
        add(b2);


        mi1.addActionListener(this);
        mi2.addActionListener(this);
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



   /* void WriteToFile()
      {
       try 
        {
            File fl = new File("trial3.txt");
            char pass[]=pf1.getPassword();
            String str1=tf1.getText();
            String str2=tf2.getText();
            String str3=new String(pass);
            String str4=ta1.getText();
            FileWriter fw = new FileWriter(fl,true);
            fw.write(str1+" ");
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
    }*/



          @Override
     public void actionPerformed(ActionEvent ae)
       {
          /*if(ae.getSource()==mi1)
              {
                  new home().setVisible(true);
               }*/
            /*  if(ae.getSource()==mi2)
              {
                  new cust2().setVisible(true);
               }
            /*  if(ae.getSource()==b1)
              {
                WriteToFile();
              }*/
              if(ae.getSource()==b2)
              {
                 tf1.setText(null);
                 tf2.setText(null);
                 pf1.setText(null);  
               }

        }

  public static void main(String args[])
    {
        new cust1().setVisible(true);

        
    }
    
}

/*class cust11
{
  public static void main(String args[])
    {
        new cust1().setVisible(true);

        
    }
}*/