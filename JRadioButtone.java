import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class JRadioButtone extends JFrame{
	
	private JRadioButton p;
	private JRadioButton b;
	private JRadioButton i;
	private JRadioButton bai;
	private JTextField text ;
	private ButtonGroup group;
	private Font fp;
	private Font fb;
	private Font fi;
	private Font fbai;
	public JRadioButtone(){
		super("Jradio button title");
		setLayout(new FlowLayout());
		
		p = new JRadioButton("plain");
		b = new JRadioButton("bold");
		i = new JRadioButton("italic");
		bai = new JRadioButton("bold and italic");
        text = new JTextField("change the textstyle");
		add(p , true);
		add(b , false);
		add(i , false);
		add(bai ,  false);
	   	group = new ButtonGroup();
		group.add(p);
		group.add(b);
		group.add(i);
		group.add(bai);
		add(text);
		fp = new Font("serif" , Font.PLAIN , 20);
		fb = new Font("serif" , Font.BOLD , 20);
		fi = new Font("serif" , Font.ITALIC , 20);
		fbai = new Font("serif" , Font.BOLD + Font.ITALIC , 20);
		
		p.addItemListener(new handler(fp));
		b.addItemListener(new handler(fb));
		i.addItemListener(new handler(fi));
		bai.addItemListener(new handler(fbai));
		
		
	} 
	
	private class handler implements ItemListener{
    
		private Font x;
		
		public handler(Font f){
			x = f;
			
		}
		public void itemStateChanged(ItemEvent event) {
			// TODO Auto-generated method stub
			text.setFont(x);
		}
		
		
		
	}

}
