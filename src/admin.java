import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class admin extends JFrame implements ActionListener
{
  
    JTextField tf1;
    JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1;
  admin()
  {
    setTitle("EMPLOYEE HOME PAGE");
    setSize(650,650);
    setLayout(null);
    


        JMenu m1=new JMenu("Home");
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        m.add(m1);

        mi1=new JMenuItem("<<");
        m1.add(mi1);
       

        Label l1=new Label("Admin Login from here.....",Label.CENTER);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(50,60,500,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,550,650,30);
        add(l2);




        Label l6=new Label("Username",Label.LEFT);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setForeground(Color.RED);
        l6.setBounds(170,160,160,30);
        add(l6);


        tf1=new JTextField();
        tf1.setBounds(340,160,200,30);
        add(tf1);



        
        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(170,210,160,30);
        add(l5);



        pf1=new JPasswordField();
        pf1.setBounds(340,210,200,30);
        add(pf1);





        b1=new JButton("Submit");
        b1.setBounds(310,280,100,30);
        add(b1);
         



        b2=new JButton("Reset");
        b2.setBounds(440,280,100,30);
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




   String read(int line,String filename)

    {   FileReader tempFileReader = null;
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
      {  String str1,str2,text1,text2,text3,text4,text5,text6,text7,text8;
         str1=tf1.getText();
         str2=pf1.getText(); 

          if(ae.getSource()==mi1)
                  new home().setVisible(true);
              {
                  this.dispose();
               }
          if(ae.getSource()==b1)
            {  
              text1=read(1,"admin3.txt");
              text2=read(1,"admin4.txt");
               text3=read(2,"admin3.txt");
              text4=read(2,"admin4.txt");
               text5=read(3,"admin3.txt");
              text6=read(3,"admin4.txt");
               text7=read(4,"admin3.txt");
              text8=read(4,"admin4.txt");

              if((str1.equals(text1) && str2.equals(text2))||(str1.equals(text3) && str2.equals(text4))||(str1.equals(text5) && str2.equals(text6))||(str1.equals(text7) && str2.equals(text8)))
              {
                 new admin1().setVisible(true);
              }
              else
              {

                JOptionPane.showMessageDialog(null,"Sorry,Please enter correct Username/password");
              
              }
              
                
              
            }
           if(ae.getSource()==b2)
           {
             tf1.setText(null);
             pf1.setText(null);
           }

       }  

      

  public static void main(String args[])
  {
    new admin().setVisible(true);
  }
}