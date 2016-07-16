import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class admin2 extends Frame implements ActionListener
{
   Label l1,l2,l5,l6;
   TextField t1,t2;
   Button b1,b2,b3,b4,b5,b6;
   JMenuItem mi1,mi2,mi3;
   admin2(){
              setTitle("ISP COMPLAINTS SERVICE");
              setSize(800,800);
              setLayout(null);
              setVisible(true);
          
	
             
            /*   JMenuBar m=new JMenuBar();
               setJMenuBar(m);
               m.setBounds(0,100,800,30);
        


 
               JMenu m1=new JMenu("<<");
               m.add(m1);
               mi1=new JMenuItem("Back");
               m1.add(mi1);


               JMenu m2=new JMenu("        Info");
               m.add(m2);


               JMenu m3=new JMenu("he");
               m.add(m3);
 */
              

             l1=new Label("Customer Information");
             l1.setFont(new Font("Serif",Font.BOLD,25));
             l1.setForeground(Color.blue);
             l1.setBounds(60,230, 400, 30);
             add(l1);
  	    
             l2=new Label("--------------------------");
             l2.setFont(new Font("Serif",Font.BOLD,30));
             l2.setForeground(Color.blue);
             l2.setBounds(60,250,300,20);
             add(l2);
             
             
             
             l5=new Label("INFORMATION SUPERHIGHWAY",Label.CENTER);
             l5.setFont(new Font("Serif",Font.BOLD,40));
             l5.setForeground(Color.MAGENTA);
             l5.setBackground(Color.ORANGE);
             l5.setBounds(0,0,850,100);
             add(l5);
             
             
             
              
             l6=new Label("Copyrights @ Information Superhighway team.",Label.CENTER);
             l6.setFont(new Font("Serif",Font.BOLD,20));
             l6.setForeground(Color.MAGENTA);
             l6.setBackground(Color.ORANGE);
             l6.setBounds(0,700,850,30);
             add(l6);
             
             
             
             
             
             b3=new Button("Admin Home");
             b3.setBackground(Color.gray);
             b3.setForeground(Color.black);
             b3.setBounds(70,100,100,30);
             add(b3);
             
             
             
             b4=new Button("info");
             b4.setBackground(Color.gray);
             b4.setForeground(Color.black);
             b4.setBounds(240,100,100,30);
             add(b4);
             
             
             
            /* b5=new Button("Feedback");
             b5.setBackground(Color.gray);
             b5.setForeground(Color.black);
             b5.setBounds(430,100,100,30);
             add(b5);*/
             
             
             
             b6=new Button("Logout");
             b6.setBackground(Color.gray);
             b6.setForeground(Color.black);
             b6.setBounds(620,100,100,30);
             add(b6);
             
             
             
             
             
             
             
             
             
             b3.addActionListener(this);
             b4.addActionListener(this);
             b5.addActionListener(this);
             b6.addActionListener(this);

             
              addWindowListener(new WindowAdapter()
                     {
                        @Override
                        public void windowClosing(WindowEvent we)
                     {
                         System.exit(0);
                     }
                     });
             
            
           }
   
   
   
   @Override
   public void actionPerformed(ActionEvent ae)
       {
          if(ae.getSource()==b6)
              {
         
                      
                         new admin().setVisible(true);
                         
             
              }
         if(ae.getSource()==b3)
          {
             
              new admin1().setVisible(true);
              
          }
         /*if(ae.getSource()==b4)
         {
             new admin3_1();
         }*/
         
       }

   
   
   public static void main(String args[])
       {
          new admin2();
       }
 } 
             
               
             
   


