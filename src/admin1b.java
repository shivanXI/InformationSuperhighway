import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class admin1b extends JFrame implements ActionListener
{
	
    JTextField tf1,tf2,tf3,tf4;
	JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1;
    JTextArea ta1;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
	admin1b()
	{
		setTitle("CUSTOMER TRACKING PAGE");
		setSize(750,750);
		setLayout(null);
		


       
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Back");
        m1.add(mi1);
       

     


        Label l1=new Label("!! Customer Tracking Form !!",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(50,20,500,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,750,30);
        add(l2);

        

        Label l3=new Label("Customer name",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(135,130,145,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,130,200,30);
        add(tf1);

        
        
        Label l4=new Label("Username",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(135,180,145,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,180,200,30);
        add(tf2);



        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(135,230,145,30);
        add(l5);


        
        pf1=new JPasswordField();
        pf1.setBounds(340,230,200,30);
        add(pf1);




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


        Label l9=new Label("Customer id",Label.LEFT);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.RED);
        l9.setBounds(135,80,145,30);
        add(l9);
        
        
        

        tf4=new JTextField();
        tf4.setBounds(340,80,200,30);
        add(tf4);

        

        


        b1=new JButton("remove");
        b1.setBounds(440,550,100,30);
        add(b1);



        b2=new JButton("getDetails");
        b2.setBounds(550,80,100,30);
        add(b2);
       
                 



        mi1.addActionListener(this);
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




    String read1(int line)

   {    FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("t1.txt"); 
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

   {  FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("t2.txt"); 
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

   {  FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("t3.txt"); 
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

   {  FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("t4.txt"); 
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

   {   FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("t5.txt"); 
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


    public void del(int lineno,String fname)
        {
          try
            {
             File file = new File(fname);
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line1 = "", oldtext1 = "",line2="",oldtext2="";
             int j=1;
             while((line1=reader.readLine())!=null && j!=(lineno))
             {
              oldtext1 += line1 + "\r\n";
              j++;
             }
             oldtext1=oldtext1+"\r\n";

             int i=(lineno+1);
             while((line2= reader.readLine()) != null && i!=lineno)
                 {
                   oldtext2 += line2 + "\r\n";
                   i++; 

                 }
             reader.close();
             FileWriter writer = new FileWriter(fname);
             writer.write(oldtext1);
             writer.write(oldtext2);
             writer.close();
           }
         catch (IOException e)
             {
               e.printStackTrace();
             }
        }

   


          @Override
     public void actionPerformed(ActionEvent ae)
       {  

          String str1,str2,str3,str4,str5;
          int id=Integer.parseInt(tf4.getText());
          if(ae.getSource()==mi1)
              {
                  new admin1().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==b1)
              {
                  del(id,"t1.txt");
                  del(id,"t2.txt");
                  del(id,"t3.txt");
                  del(id,"t4.txt");
                  del(id,"t5.txt");

               }
          if(ae.getSource()==b2)
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
        new admin1b().setVisible(true);

        
    }


	
		
	
}

