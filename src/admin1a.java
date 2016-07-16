import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class admin1a extends JFrame implements ActionListener
{
  
    JTextField tf1,tf2,tf3,tf4,tf5;
    JButton b1,b2,b3;
    JMenuItem mi1,mi2;
    JTextArea ta1;

  admin1a()
  {
        setTitle("EMPLOYEE TRACKING PAGE");
        setSize(750,750);
        setLayout(null);
    


       
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Back");
        m1.add(mi1);
        JMenu m2=new JMenu("           Add");
        m.add(m2);
        mi2=new JMenuItem("           Employee");
        m2.add(mi2);
       

     


        Label l1=new Label("!! EMPLOYEE TRACKING FORM !!",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,25));
        l1.setForeground(Color.RED);
        l1.setBounds(80,20,500,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,750,30);
        add(l2);

        

        Label l3=new Label("Empname",Label.LEFT);
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


        
        tf5=new JTextField();
        tf5.setBounds(340,230,200,30);
        add(tf5);




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


        Label l9=new Label("Emp id",Label.LEFT);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.RED);
        l9.setBounds(135,80,145,30);
        add(l9);
        
        
        

        tf4=new JTextField();
        tf4.setBounds(340,80,200,30);
        add(tf4);

        

        


        b1=new JButton("remove");
        b1.setBounds(320,550,100,30);
        add(b1);



        b2=new JButton("getDetails");
        b2.setBounds(550,80,100,30);
        add(b2);


        b3=new JButton("reset");
        b3.setBounds(440,550,100,30);
        add(b3);
       
                 



        mi1.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
   
       
       
        addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });



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



 
    String read(int line,String filename)

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

          String str1,str2,str3,str4,str5;
          int id=Integer.parseInt(tf4.getText());
          if(ae.getSource()==mi1)
              {
                  new admin1().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==b1)
              {
                  del(id,"emp1.txt");
                  del(id,"emp2.txt");
                  del(id,"emp3.txt");
                  del(id,"emp4.txt");
                  del(id,"emp5.txt");
                  del(id,"emp6.txt");
               }
          if(ae.getSource()==b2)
              {
                 tf4.setEditable(false);
                 str1=read(id,"emp1.txt");
                 tf1.setText(str1);
                 tf1.setEditable(false);
                 str2=read(id,"emp2.txt");
                 tf2.setText(str2);
                 tf2.setEditable(false);
                 str3=read(id,"emp3.txt");
                 tf5.setText(str3);
                 tf5.setEditable(false);
                 str4=read(id,"emp4.txt");
                 ta1.setText(str4);
                 ta1.setEditable(false);
                 str5=read(id,"emp5.txt");
                 tf3.setText(str5);
                 tf3.setEditable(false);
              }
            if(ae.getSource()==b3)
            {
               tf1.setEditable(true);
               tf1.setText(null);
               tf2.setEditable(true);
               tf2.setText(null);
               tf3.setEditable(true);
               tf3.setText(null);
               tf4.setEditable(true);
               tf4.setText(null);
               tf5.setEditable(true);
               tf5.setText(null);
               ta1.setEditable(true);
               ta1.setText(null);
              
            }
        }
    

    public static void main(String args[])
    {
        new admin1a().setVisible(true);

        
    }


  
    
  
}

