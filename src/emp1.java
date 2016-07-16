import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class emp1 extends JFrame implements ActionListener
{
	
    JTextField tf1,tf2;
	JButton b1,b2;
    JPasswordField pf1;
    JMenuItem mi1;
    Checkbox cb1,cb2;
    CheckboxGroup cbg;
	emp1()
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
       

        Label l1=new Label("Employee Login from here.....",Label.CENTER);
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



        Label l3=new Label("Emp Id",Label.LEFT);
        l3.setFont(new Font("Serif",Font.BOLD,20));
        l3.setForeground(Color.RED);
        l3.setBounds(170,150,155,30);
        add(l3);


        tf1=new JTextField();
        tf1.setBounds(340,150,200,30);
        add(tf1);



        Label l4=new Label("Emp Type",Label.LEFT);
        l4.setFont(new Font("Serif",Font.BOLD,20));
        l4.setForeground(Color.RED);
        l4.setBounds(170,200,160,30);
        add(l4);


        cbg=new CheckboxGroup();
        cb1=new Checkbox("Manager",cbg,true);
        cb1.setFont(new Font("Serif",Font.BOLD,20));
        cb1.setForeground(Color.GRAY);
        cb1.setBounds(340,200,100,30);
        cb2=new Checkbox("Technical",cbg,true);
        cb2.setFont(new Font("Serif",Font.BOLD,20));
        cb2.setForeground(Color.GRAY);
        cb2.setBounds(450,200,100,30);
        add(cb1);
        add(cb2);



        Label l6=new Label("Username",Label.LEFT);
        l6.setFont(new Font("Serif",Font.BOLD,20));
        l6.setForeground(Color.RED);
        l6.setBounds(170,250,160,30);
        add(l6);


        tf2=new JTextField();
        tf2.setBounds(340,250,200,30);
        add(tf2);



        
        Label l5=new Label("Password",Label.LEFT);
        l5.setFont(new Font("Serif",Font.BOLD,20));
        l5.setForeground(Color.RED);
        l5.setBounds(170,300,160,30);
        add(l5);



        pf1=new JPasswordField();
        pf1.setBounds(340,300,200,30);
        add(pf1);





        b1=new JButton("Submit");
        b1.setBounds(310,360,100,30);
        add(b1);
         



        b2=new JButton("Reset");
        b2.setBounds(440,360,100,30);
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
       {  String str1,str2,text1,text2;
          int id;
          id=Integer.parseInt(tf1.getText());
          str1=tf2.getText();
          str2=pf1.getText();
          if(ae.getSource()==mi1)
              {
                  new home().setVisible(true);
                  this.dispose();
               }
          if(ae.getSource()==b1)
            {  
              text1=read(id,"emp2.txt");
              text2=read(id,"emp3.txt");
              if(str1.equals(text1) && str2.equals(text2))
              {
                 if(cb1.getState()==true)
                   {
                       new emp2().setVisible(true);
                       this.dispose();
                   }
                 if(cb2.getState()==true)
                   {
                       new emp3().setVisible(true);
                       this.dispose();
                   }
              }
              else
              {

                JOptionPane.showMessageDialog(null,"Sorry,Please enter correct id/Username/password");
              
              }
              
                
              
            }
           if(ae.getSource()==b2)
           {
             tf1.setText(null);
             tf2.setText(null);
             pf1.setText(null);
           }

       }  

      

	public static void main(String args[])
	{
		new emp1().setVisible(true);
	}
}