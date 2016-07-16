import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class emp2 extends JFrame implements ActionListener
{
  
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
    JTextArea ta1;
  
  emp2()
  {
    setTitle("MANAGER SECTION");
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
        mi2=new JMenuItem("      Employees");
        m2.add(mi2);
        m2.addSeparator();
        mi3=new JMenuItem("       Customers");
        m2.add(mi3);
        m2.addSeparator();
        mi4=new JMenuItem("      Complaints");
        m2.add(mi4);
        m2.addSeparator();
        mi5=new JMenuItem("      Suggestions");
        m2.add(mi5);



        
        JMenu m3=new JMenu("       Logout");
        m.add(m3);
        mi6=new JMenuItem("     End Session");
        m3.add(mi6);
       



        Label l1=new Label("!! Personal Details !!",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(20,70,500,40);
        add(l1);

        Label l9=new Label("Enter id",Label.LEFT);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.RED);
        l9.setBounds(135,20,145,30);
        add(l9);


        tf4=new JTextField();
        tf4.setBounds(340,20,200,30);
        add(tf4);

        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,790,30);
        add(l2);

        

        Label l3=new Label("Name",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(140,180,145,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,180,200,30);
        add(tf1);

        
        
        Label l4=new Label("Username",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(135,230,145,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,230,200,30);
        add(tf2);



        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(135,280,145,30);
        add(l5);


        
        pf1=new JPasswordField();
        pf1.setBounds(340,280,200,30);
        add(pf1);



      
        
        Label l7=new Label("Address",Label.LEFT);
        l7.setFont(new Font("Serif",Font.BOLD,20));
        l7.setForeground(Color.RED);
        l7.setBounds(135,380,145,30);
        add(l7);
        



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.WHITE);
        ta1.setForeground(Color.BLACK);
        ta1.setBounds(340,380,200,170);
        add(ta1);




        Label l8=new Label("Mobile",Label.LEFT);
        l8.setFont(new Font("Serif",Font.BOLD,20));
        l8.setForeground(Color.RED);
        l8.setBounds(135,580,145,30);
        add(l8);

        
        
        

        tf3=new JTextField();
        tf3.setBounds(340,580,200,30);
        add(tf3);


        Label l10=new Label("Manager id",Label.LEFT);
        l10.setFont(new Font("Serif",Font.BOLD,20));
        l10.setForeground(Color.RED);
        l10.setBounds(135,130,145,30);
        add(l10);

        
        
        

        tf5=new JTextField();
        tf5.setBounds(340,130,200,30);
        add(tf5);

        

        b1=new JButton("getDetails");
        b1.setBounds(550,20,100,30);
        add(b1);


      
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        b1.addActionListener(this);




        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        pf1.setEditable(false);
        ta1.setEditable(false);
        tf5.setEditable(false);
              

       
       
        addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });



   }



    public String read(int line,String filename)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader(filename); 
          tempBufferedReader = new BufferedReader(tempFileReader);
        } catch (Exception e)
               {
                e.printStackTrace(); 
               }
        String returnStr = "ERROR";
        for(int i = 0; i < line - 1; i++)
        {
            try 
            { 
              tempBufferedReader.readLine();
            } catch (Exception e) 
                    {
                      e.printStackTrace();
                    }
        }
        try
         { 
            returnStr = tempBufferedReader.readLine(); 
         }  catch (Exception e) 
                {
                  e.printStackTrace();
                }

        return returnStr;
          
  }

        @Override
     public void actionPerformed(ActionEvent ae)
       {   

          String str1,str2,str3,str4,str5,str6;
          int id=Integer.parseInt(tf4.getText());
          if(ae.getSource()==mi1)
              {
                  new emp1().setVisible(true);
                  this.dispose();
               }
         /* if(ae.getSource()==mi2)
              {
                 new emp2a().setVisible(true);
                 this.dispose();
               }*/
          if(ae.getSource()==mi3)
              {
                 new emp2a().setVisible(true);
                 this.dispose();
               }
          if(ae.getSource()==mi4)
              {
                 new emp3a().setVisible(true);
                 this.dispose();
               }
          if(ae.getSource()==mi5)
             {
                new emp3b().setVisible(true);
                this.dispose();
             }
          if(ae.getSource()==mi6)
            {
               System.exit(0);
            }
          if(ae.getSource()==b1)
          {
                 tf4.setEditable(false);
                 str6=read(id,"emp6.txt");
                 tf5.setText(str6);
                 str1=read(id,"emp1.txt");
                 tf1.setText(str1);
                 str2=read(id,"emp2.txt");
                 tf2.setText(str2);
                 str3=read(id,"emp3.txt");
                 pf1.setText(str3);
                 str4=read(id,"emp4.txt");
                 ta1.setText(str4);
                 str5=read(id,"emp5.txt");
                 tf3.setText(str5);
          }
        }
    

    public static void main(String args[])
    {
        new emp2().setVisible(true);

        
    }


  
    
  
}

   