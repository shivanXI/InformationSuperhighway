import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class log11 extends JFrame implements ActionListener
{  public JButton b;
    public JTextArea t;
   log11()
   {
    setSize(600,600);
    setLayout(null);
    t=new JTextArea();
    t.setBounds(10,50,550,400);
    t.setFont(new Font("Serif",Font.BOLD,25));
    t.setBackground(Color.GRAY);
    t.setForeground(Color.BLUE);
    add(t);
    b=new JButton("submit");
    b.setBounds(100,470,100,40);
    add(b);
    b.addActionListener(this);
    addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });
  }

  String readFromFile(int line)

   {  FileReader tempFileReader = null;
        BufferedReader tempBufferedReader = null;
        try 
        {
          tempFileReader = new FileReader("trial5.txt"); 
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
       {  String str;
          if(ae.getSource()==b)
              {
                 str=readFromFile(3);
                 t.setText(str);
              }
              
       }  
   
}
class log
{   public static void main(String args[])
    {
        new log11().setVisible(true);
    }
}