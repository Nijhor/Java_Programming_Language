
package onlinetest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



abstract class OnlineTest extends JFrame implements ActionListener
{
    JLabel l;
 
	JRadioButton jb[]=new JRadioButton[5];
	JButton b1,b2;
	ButtonGroup bg;
        
      
       
      
        
	int count=0,current=0;
		
	OnlineTest(String s)
	{
		super(s);
		l=new JLabel();
                l.setBounds(30,40,450,20);
		add(l);
                
                
               
		bg=new ButtonGroup();
		for(int i=0;i<5;i++)
		{
			jb[i]=new JRadioButton();	
			add(jb[i]);
			bg.add(jb[i]);
		}
		b1=new JButton("Next");
		b2=new JButton();
		b1.addActionListener(this);
		b2.addActionListener(this);
                b2.setVisible(false);
                
               
                
                
		add(b1);add(b2);
              
		set();
		l.setBounds(30,40,450,20);
		jb[0].setBounds(50,80,100,20);
		jb[1].setBounds(50,110,100,20);
		//jb[2].setBounds(50,140,100,20);
		//jb[3].setBounds(50,170,100,20);
		b1.setBounds(100,240,100,30);
		b2.setBounds(270,240,100,30);
               
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
		setSize(600,350);
                  
        
        
	}
     
        
        
        
	public void actionPerformed(ActionEvent e)
	{
           
		if(e.getSource()==b1)
		{
                    
			if(check())
				count=count+1;
			current++;
			set();	
                        
                        
			if(current==9)
			{
				b1.setVisible(false);
				b2.setVisible(true);
                                b2.setText("Result");
                                
			}
                   
                            
		}

	
		if(e.getActionCommand().equals("Result"))
		{
			if(check())
				count=count+1;
			current++;
			
			JOptionPane.showMessageDialog(this,"You are " +count*10 +"% otaku");
			System.exit(0);
		}
	}
	void set()
	{
		
		if(current==0)
		{      
                        l.setText("What is Goku's father name");
			jb[0].setText("Gohan");jb[1].setText("Piccolo");jb[2].setText("Bardok");jb[3].setText("Vagita");		
		}
		if(current==1)
		{
			l.setText("What is Ichigo Kurasaki's Strongest Attack");
			jb[0].setText("Bankai");jb[1].setText("Scatter");jb[2].setText("Getsogatensho");jb[3].setText("Zabimaru");
		}
		if(current==2)
		{
			l.setText("What plot 'Grave of the fireflies' movie made ");
			jb[0].setText("Single life");jb[1].setText("Love Story");jb[2].setText("Pandamic");jb[3].setText("World war 2");
		}
		if(current==3)
		{
			l.setText("Who is the main character of one punch man");
			jb[0].setText("Saitama");jb[1].setText("Genos.");jb[2].setText("Tatsumaki");jb[3].setText("Sweetmask");
		}
		if(current==4)
		{
			l.setText("What is Hinata's clan name form anime Naruto");
			jb[0].setText("Aburame");jb[1].setText("Uchiha");jb[2].setText("Hyuga");jb[3].setText("Uzumaki");
		}
		if(current==5)
		{
			l.setText("What is Mitsuba Miyamizu's power form anime 'Wheathering with you'");
			jb[0].setText("control time");jb[1].setText("control weather");jb[2].setText("being invisible");jb[3].setText("invincible");
		}
		if(current==6)
		{
			l.setText("Which following charecter is from 'High School Dxd'");
			jb[0].setText("Bulma");jb[1].setText("Rios Gremory");jb[2].setText("Tsunade");jb[3].setText("Touka");
		}
		if(current==7)
		{
			l.setText("Who killed Erens mother from anime 'Attack on titan");
			jb[0].setText("Levi");jb[1].setText("Arancars");jb[2].setText("Zerugas");jb[3].setText("A titan");		
		}
		if(current==8)
		{
			l.setText("What do you have to do with Pokemon");
			jb[0].setText("Snacth");jb[1].setText("Catch them");jb[2].setText("Fetch them");jb[3].setText("kill them");
		}
		if(current==9)
		{
			l.setText("Fill the gap \n Dragon __ Z");
			jb[0].setText("Fire");jb[1].setText("Tale");jb[2].setText("Ball");jb[3].setText("Tail");
		}
		
	}
	boolean check()
	{
		if(current==0)
			return(jb[2].isSelected());
		if(current==1)
			return(jb[2].isSelected());
		if(current==2)
			return(jb[3].isSelected());
		if(current==3)
			return(jb[0].isSelected());
		if(current==4)
			return(jb[2].isSelected());
		if(current==5)
			return(jb[1].isSelected());
		if(current==6)
			return(jb[1].isSelected());
		if(current==7)
			return(jb[3].isSelected());
		if(current==8)
			return(jb[1].isSelected());
		if(current==9)
			return(jb[2].isSelected());
		return false;
	}


    public static void main(String[] args) {
          new OnlineTest("Test how otaku you are") {};
    }
    
}
