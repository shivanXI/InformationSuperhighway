import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class emp3 extends JFrame implements ActionListener
{
  
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1,mi2,mi3,mi4;
    JTextArea ta1;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
  emp3()
  {
    setTitle("TECHNICAL SECTION");
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
        mi2=new JMenuItem("      Complaints");
        m2.add(mi2);
        m2.addSeparator();
        mi3=new JMenuItem("      Suggestions");
        m2.add(mi3);


        JMenu m3=new JMenu("       Logout");
        m.add(m3);
        mi4=new JMenuItem("     End Session");
        m3.add(mi4);
       



        Label l1=new Label("!! Personal Details !!",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(20,80,500,40);
        add(l1);

        Label l9=new Label("Enter id",Label.LEFT);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.RED);
        l9.setBounds(135,30,145,30);
        add(l9);


        tf4=new JTextField();
        tf4.setBounds(340,30,200,30);
        add(tf4);

        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,790,30);
        add(l2);

        

        Label l3=new Label("Employee Name",Label.RIGHT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(130,150,145,30);
        add(l3);


         tf1=new JTextField();
        tf1.setBounds(340,150,200,30);
        add(tf1);

        
        
        Label l4=new Label("Username",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(135,200,145,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,200,200,30);
        add(tf2);



        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(135,250,145,30);
        add(l5);


        
        pf1=new JPasswordField();
        pf1.setBounds(340,250,200,30);
        add(pf1);



      
        
        Label l7=new Label("Address",Label.LEFT);
        l7.setFont(new Font("Serif",Font.BOLD,20));
        l7.setForeground(Color.RED);
        l7.setBounds(135,350,145,30);
        add(l7);
        



        ta1=new JTextArea(300,200);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.WHITE);
        ta1.setForeground(Color.BLACK);
        ta1.setBounds(340,350,200,170);
        add(ta1);




        Label l8=new Label("Mobile",Label.LEFT);
        l8.setFont(new Font("Serif",Font.BOLD,20));
        l8.setForeground(Color.RED);
        l8.setBounds(135,550,145,30);
        add(l8);

        
        
        

        tf3=new JTextField();
        tf3.setBounds(340,550,200,30);
        add(tf3);

        

        b1=new JButton("getDetails");
        b1.setBounds(550,30,100,30);
        add(b1);


      
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        b1.addActionListener(this);




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


    String read1(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("emp1.txt"); 
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



    String read2(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("emp2.txt"); 
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



    String read3(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("emp3.txt"); 
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



    String read4(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("emp4.txt"); 
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


  String read5(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("emp5.txt"); 
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

          String str1,str2,str3,str4,str5;
          int id=Integer.parseInt(tf4.getText());
          if(ae.getSource()==mi1)
              {
                  new emp1().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==mi2)
              {
                 new emp3a().setVisible(true);
                 this.dispose();
               }
          if(ae.getSource()==mi3)
             {
                new emp3b().setVisible(true);
                this.dispose();
             }
          if(ae.getSource()==mi4)
            {
               System.exit(0);
            }
          if(ae.getSource()==b1)
          {
                 tf4.setEditable(false);
                 str1=read1(id);
                 tf1.setText(str1);
                 str2=read2(id);
                 tf2.setText(str2);
                 str3=read3(id);
                 pf1.setText(str3);
                 str4=read4(id);
                 ta1.setText(str4);
                 str5=read5(id);
                 tf3.setText(str5);
          }
        }
    

    public static void main(String args[])
    {
        new emp3().setVisible(true);

        
    }


  
    
  
}

