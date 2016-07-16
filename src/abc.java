import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class abc extends JFrame implements ActionListener
{   
	JMenuItem open,go;
	abc(){
    
        
		setTitle("hello");
	    setSize(800,800);
	    setVisible(true);
	    setLayout(null);
 
        JMenuBar m=new JMenuBar();
        setJMenuBar(m);
        



        JMenu m1=new JMenu("Home");
        m.add(m1);


        JMenu m2=new JMenu("Back");
        m.add(m2);


        JMenu m3=new JMenu("hello");
        m.add(m3);

        go=new JMenuItem("go back");

        

        m2.add(go);



        open=new JMenuItem("open");

        

        m1 .add(open);
        open.addActionListener(this);
        go.addActionListener(this);
        m3.addActionListener(this);


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
            public void actionPerformed(ActionEvent ae) {
                if(ae.getSource()==open){
                   // JOptionPane.showMessageDialog(null,"hello");
                    new emp1().setVisible(true);
                    this.dispose();
            } 

           if(ae.getSource()==go)
                {
                    new home().setVisible(true);
                    this.dispose();   
                }

                           
             }


    


    public static void main(String args[])
    {
     new abc();
    }
}



