import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class admin1 extends JFrame implements ActionListener
{
  
    JTextField tf1,tf2,tf3,tf4;
    JButton b1;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;
  
  admin1()
  {
    setTitle("ADMIN SECTION");
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
        l1.setBounds(10,90,500,40);
        add(l1);

        Label l9=new Label("Enter id",Label.LEFT);
        l9.setFont(new Font("Serif",Font.BOLD,20));
        l9.setForeground(Color.RED);
        l9.setBounds(135,180,145,30);
        add(l9);


        tf4=new JTextField();
        tf4.setBounds(340,180,200,30);
        add(tf4);

        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,600,790,30);
        add(l2);

        

        Label l3=new Label("Name",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(140,230,145,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,230,200,30);
        add(tf1);

        
        
        Label l4=new Label("Username",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(135,280,145,30);
        add(l4);



        tf2=new JTextField();
        tf2.setBounds(340,280,200,30);
        add(tf2);



        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(135,330,145,30);
        add(l5);


        
        tf3=new JTextField();
        tf3.setBounds(340,330,200,30);
        add(tf3);


        

        b1=new JButton("getDetails");
        b1.setBounds(560,180,100,30);
        add(b1);


      
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        b1.addActionListener(this);




       

       
       
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

          String str1,str2,str3,str4,txt1;
          txt1=tf4.getText();
         
          if(ae.getSource()==mi1)
              {
                  new admin().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==mi2)
              {
                   new admin1a().setVisible(true);
               }
          if(ae.getSource()==mi3)
              {
                 new admin1b().setVisible(true);
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
                 
              if(txt1.equals(read(1,"admin1.txt")))
                 {
                    
                    str2=read(1,"admin2.txt");
                    tf1.setText(str2);
                    str3=read(1,"admin3.txt");
                    tf2.setText(str3);
                    str4=read(1,"admin4.txt");
                    tf3.setText(str4);
                    tf1.setEditable(false);
                    tf2.setEditable(false);
                    tf3.setEditable(false);
                    tf4.setEditable(false);
                 }   
              if(txt1.equals(read(2,"admin1.txt")))
                 {
                    
                    str2=read(2,"admin2.txt");
                    tf1.setText(str2);
                    str3=read(2,"admin3.txt");
                    tf2.setText(str3);
                    str4=read(2,"admin4.txt");
                    tf3.setText(str4);
                    tf1.setEditable(false);
                    tf2.setEditable(false);
                    tf3.setEditable(false);
                    tf4.setEditable(false);
                 }   


                if(txt1.equals(read(3,"admin1.txt")))
                 {
                    
                    str2=read(3,"admin2.txt");
                    tf1.setText(str2);
                    str3=read(3,"admin3.txt");
                    tf2.setText(str3);
                    str4=read(3,"admin4.txt");
                    tf3.setText(str4);
                    tf1.setEditable(false);
                    tf2.setEditable(false);
                    tf3.setEditable(false);
                    tf4.setEditable(false);
                 }   


                 if(txt1.equals(read(4,"admin1.txt")))
                 {
                    
                    str2=read(4,"admin2.txt");
                    tf1.setText(str2);
                    str3=read(4,"admin3.txt");
                    tf2.setText(str3);
                    str4=read(4,"admin4.txt");
                    tf3.setText(str4);
                    tf1.setEditable(false);
                    tf2.setEditable(false);
                    tf3.setEditable(false);
                    tf4.setEditable(false);
                 }  
              
                 
          }
        }
    

    public static void main(String args[])
    {
        new admin1().setVisible(true);

        
    }


  
    
  
}

   