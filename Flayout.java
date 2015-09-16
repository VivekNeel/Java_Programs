import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Flayout extends JFrame{
	
	private FlowLayout layout;
	private Container container;
	private JButton left;
	private JButton right;
	private JButton center;
	
	public Flayout(){
		super("Flow layout");
		layout = new FlowLayout();
		
		
		setLayout(layout);
		left = new JButton("Left");
		right = new JButton("Right");
		center = new JButton("Center");
		container = getContentPane();
		left.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.LEFT);
				layout.layoutContainer(container);
			}
			
			
		});
		right.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.RIGHT);
				layout.layoutContainer(container);
			}
			
			
		});
		
		center.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				layout.setAlignment(FlowLayout.CENTER);
				layout.layoutContainer(container);
			}
			
			
		});
		
		add(left);
		add(right);
		add(center);
	}
	
	

}
