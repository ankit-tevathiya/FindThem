package findthem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class FindThem extends JFrame implements ActionListener{
 JFrame f= new JFrame("Label Example"); 
JButton b; 

    JRadioButton r1=new JRadioButton("A) Admin");    
JRadioButton r2=new JRadioButton("B)Not Admin");    
 FindThem() {    
    JLabel l1,l2;  
    l1=new JLabel("Welcome to FindMyFamily");  
    l1.setBounds(85,25, 150,30);  
    l2=new JLabel("Choose the any one below");  
    l2.setBounds(85,75, 160,30);  
    
r1.setBounds(75,100,100,30);    
r2.setBounds(75,135,100,30);    
ButtonGroup bg=new ButtonGroup();   
b=new JButton("click");    
b.setBounds(100,180,80,30);    
b.addActionListener(this);
bg.add(r1);bg.add(r2);  
f.add(b);
f.add(r1);f.add(r2);
    f.add(l1); f.add(l2);  
    f.setSize(600,600);  
    f.setLayout(null);  
    f.setVisible(true);
 } 
   

    @Override
    public void actionPerformed(ActionEvent e) {
        
    if(r1.isSelected()){    
        Admin o=new Admin();
       f.dispose();      
    }
    if(r2.isSelected()){    
        Family o=new Family();
       f.dispose();      
    }
    }
    
     public static void main(String[] args) {
new FindThem(); 

    }
}
    



