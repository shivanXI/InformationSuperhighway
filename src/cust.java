import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class cust extends JFrame implements ActionListener
{
  
    JTextField tf1,tf2,tf3;
    JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2,mi3;
    JTextArea ta1;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
  cust()
  {
    setTitle("CUSTOMER INFORMATION");
    setSize(750,750);
    setLayout(null);
    


       
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Back");
        m1.add(mi1);


        JMenu m2=new JMenu("        Track");
        m.add(m2);
        mi2=new JMenuItem("    My Complaints");
        m2.add(mi2);


        JMenu m3=new JMenu("       Logout");
        m.add(m3);
        mi3=new JMenuItem("     End Session");
        m3.add(mi3);
       

     


        Label l1=new Label("!! Personal Details !!",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(30,30,500,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,750,30);
        add(l2);

        

        Label l3=new Label("Customer Name",Label.RIGHT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(130,100,145,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,100,200,30);
        add(tf1);

        
        
        Label l4=new Label("Username",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(135,150,145,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,150,200,30);
        add(tf2);



        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(135,200,145,30);
        add(l5);


        
        pf1=new JPasswordField();
        pf1.setBounds(340,200,200,30);
        add(pf1);



        Label l6=new Label("Gender",Label.LEFT);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setForeground(Color.RED);
        l6.setBounds(135,250,145,30);
        add(l6);


        
        cbg=new CheckboxGroup(); 
        cb1=new Checkbox("Male",cbg,true);
        cb1.setFont(new Font("Serif",Font.BOLD,20));
        cb1.setForeground(Color.RED);
        cb1.setBounds(340,250,100,30);
        cb2=new Checkbox("Female",cbg,true);
        cb2.setFont(new Font("Serif",Font.BOLD,20));
        cb2.setForeground(Color.RED);
        cb2.setBounds(450,250,100,30);
        add(cb1);
        add(cb2);




        Label l7=new Label("Address",Label.LEFT);
        l7.setFont(new Font("Serif",Font.BOLD,20));
        l7.setForeground(Color.RED);
        l7.setBounds(135,300,145,30);
        add(l7);
        



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.WHITE);
        ta1.setForeground(Color.BLACK);
        ta1.setBounds(340,300,200,170);
        add(ta1);




        Label l8=new Label("Mobile",Label.LEFT);
        l8.setFont(new Font("Serif",Font.BOLD,20));
        l8.setForeground(Color.RED);
        l8.setBounds(135,500,145,30);
        add(l8);
        
        
        

        tf3=new JTextField();
        tf3.setBounds(340,500,200,30);
        add(tf3);

        


        b1=new JButton("Edit Info");
        b1.setBounds(440,550,100,30);
        add(b1);
         



        mi1.addActionListener(this);
        mi3.addActionListener(this);
        b1.addActionListener(this);
       // cb1.addActionListener(this);
        //cb2.addActionListener(this);


        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        pf1.setEditable(false);
        ta1.setEditable(false);
               

       
       
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
            File fl = new File("trial5.txt");
            char pass[]=pf1.getPassword();
            String str1=tf1.getText();
            String str2=tf2.getText();
            String str3=new String(pass);
           /* if(cb1.isSelected()==true)
            {
              String str4="Male";
            } 
            else
            {
              String str4="Female";
            } */
            String str4="Male";
            String str5=ta1.getText();
            String str6=tf3.getText();
            FileWriter fw = new FileWriter(fl,true);
            fw.write(str1+" ");
            fw.write(str2+" ");
            fw.write(str3+" ");
            fw.write(str4+" ");
            fw.write(str5+" ");
            fw.write(str6+" ");
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
          if(ae.getSource()==mi1)
              {
                  new cust1().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==b1)
              {
                  tf1.setEditable(true);
                  tf2.setEditable(true);
                  tf3.setEditable(true);
                  pf1.setEditable(true);
                  ta1.setEditable(true);
               }
          if(ae.getSource()==mi3)
          {
            System.exit(0);
          }
        }
    

    public static void main(String args[])
    {
        new cust().setVisible(true);

        
    }


  
    
  
}

