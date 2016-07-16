import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class emp3b extends JFrame implements ActionListener
{
  
    JTextField tf1;
    JButton b1;
    JMenuItem mi1;
    JTextArea ta1;
    
  emp3b()
  {
    setTitle("Track Suggestions");
    setSize(750,750);
    setLayout(null);
    


       
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        
        JMenu m1=new JMenu("<<");
        m.add(m1);
        mi1=new JMenuItem("Back");
        m1.add(mi1);



       
        Label l1=new Label("!! Suggestions Box !!",Label.LEFT);
        l1.setFont(new Font("Serif",Font.BOLD,30));
        l1.setForeground(Color.RED);
        l1.setBounds(50,50,300,40);
        add(l1);



        Label l2=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
        l2.setFont(new Font("Serif",Font.BOLD,25));
        l2.setForeground(Color.RED);
        l2.setBackground(Color.YELLOW);
        l2.setBounds(0,650,750,30);
        add(l2);

        


        ta1=new JTextArea(500,500);
        ta1.setFont(new Font("Serif",Font.BOLD,20));
        ta1.setBackground(Color.GRAY);
        ta1.setForeground(Color.BLACK);
        ta1.setBounds(50,100,640,430);
        add(ta1);




        b1=new JButton("Show");
        b1.setBounds(500,550,100,30);
        add(b1);
         



       

        mi1.addActionListener(this);
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

   public void read()
        {
          try
            {
             File file = new File("trial4.txt");
             BufferedReader reader = new BufferedReader(new FileReader(file));
             String line = "", oldtext = " ";
             while((line=reader.readLine())!=null)
             {
              oldtext += line + "\r\n"+" ";
              
             }
             ta1.setText(oldtext);
           }
         catch (IOException e)
             {
               e.printStackTrace();
             }
        }



       @Override
     public void actionPerformed(ActionEvent ae)
       {
         
          if(ae.getSource()==mi1)
              {
                  new emp1().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==b1)
              {
                  read();
               }
         
         
          
        }
    

    public static void main(String args[])
    {
        new emp3b().setVisible(true);

        
    }


  
    
  
}

