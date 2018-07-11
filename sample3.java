import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class sample3 implements ActionListener
   {          JLabel l;JButton b;JTextField t;

                       sample3()
{
                          JFrame f=new JFrame("frame 1");
                      
                          f.setVisible(true);
                          f.setSize(200,200);
                          f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.setLayout(new FlowLayout());
                          //label
      			   l=new JLabel("label 1");
                          f.add(l);
                          //button
			   b=new JButton("click");
                          f.add(b);
                          b.setBounds(150,150,150,50);
		/*		//listener
			  b.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent ae)
									{ l.setText("welcome ");}
 								  });*/
			  //textfield
			   t=new JTextField("text");
			  f.add(t);
			  //text listener
			   /*b.addActionListener(new ActionListener(){
						public void actionPerformed(ActionEvent ae){
										t.setText("hai");}
									});*/
			b.addActionListener(this);

                       

			//tabbedpane
			JTabbedPane jt=new JTabbedPane();
 			jt.addTab("combobox",new place());
			jt.addTab("checkbox",new list());
			jt.addTab("elective",new box());
			jt.addTab("table",new table());
   			f.add(jt);


												  
      
 }            
			//classes for tabbedpane
 
		class place extends JPanel
						{
					public place(){
							JComboBox<String> jc=new JComboBox<String>();
							jc.addItem("chennai");
							jc.addItem("tirupur");jc.addItem("erode");
							add(jc);}
						}
                class list extends JPanel
                                                {
						public	list(){
							JCheckBox  c=new JCheckBox("reading");
							add(c);
							JCheckBox c1=new JCheckBox("tv");
							add(c1);}
						}
		class box extends JPanel
						{
						public box(){
							JRadioButton r=new JRadioButton("java");
							add(r);
							JRadioButton r1=new JRadioButton("AI");
							add(r1);
          						ButtonGroup bg=new ButtonGroup();
 							bg.add(r);bg.add(r1);}
						}
							           
		class table extends JPanel
						{
						public table(){
							String data[][]={   {"27","balaji.s"},{"28","balaji.t"},{"34","bhuvaneshwaren"}, {"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},{"28","balaji.t"},       {"20","arun barathy"},{"24","aswath"},{"48","dhayaneshwar"},{"38","cibi"}  };
							String column[]={"roll no","name"};
					                JTable jt=new JTable (data,column);
							JScrollPane sp=new JScrollPane(jt);
							add(sp);}
						}		






	public void actionPerformed(ActionEvent ae)
 					{ l.setText("welcome");
                                          t.setText("hai");}

   public static void main(String args[])
                      {
                          
                          SwingUtilities.invokeLater(new Runnable(){
                          public void run(){
                                   new sample3();}
 								});
                      }
   }

