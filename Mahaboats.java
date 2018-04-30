package Mahaboats;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;


public class Mahaboats extends JFrame implements ActionListener{
	JLabel lname,lyear,lday,lblood,lmonth;
	JTextField tname,tyear;
	JButton b1;
	String arrDay[]={"","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	String arrBlood[]={"","O","A","B","AB"};
	String arrMonth[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
	String name,year,result;
	String tellbyDay,tellbyBlood;
	ImageIcon Jan,Feb,March,April,May,June,July,Aug,Sept,Oct,Nov,Dec,icon;
	
	JComboBox day,blood,month;
	
	public Mahaboats()
	{
		super("Instinct Teller........");
		setSize(300,200);
		setLocation(200,100);
		
		lname = new JLabel ("Enter your name : ",SwingConstants.CENTER);
		lyear=new JLabel("Birth Year : ",SwingConstants.CENTER);
		lday=new JLabel("Day On Birth : ",SwingConstants.CENTER);
		lblood=new JLabel("Blood Type : ",SwingConstants.CENTER);
		lmonth=new JLabel("Birth Month : ",SwingConstants.CENTER);
		
		tname=new JTextField(20);
		tyear=new JTextField(20);
		day=new JComboBox(arrDay);
		blood=new JComboBox(arrBlood);
		month=new JComboBox(arrMonth);
		
		Jan=new ImageIcon(getClass().getResource("January.jpg"));
		Feb=new ImageIcon(getClass().getResource("February.jpg"));
		March=new ImageIcon(getClass().getResource("March.jpg"));
		April=new ImageIcon(getClass().getResource("April.jpg"));
		May=new ImageIcon(getClass().getResource("May.jpg"));
		June=new ImageIcon(getClass().getResource("June.jpg"));
		July=new ImageIcon(getClass().getResource("July.jpg"));
		Aug=new ImageIcon(getClass().getResource("August.jpg"));
		Sept=new ImageIcon(getClass().getResource("September.jpg"));
		Oct=new ImageIcon(getClass().getResource("October.jpg"));
		Nov=new ImageIcon(getClass().getResource("November.jpg"));
		Dec=new ImageIcon(getClass().getResource("December.jpg"));
		icon=new ImageIcon();
				
		b1=new JButton("Tell Me");
		
		b1.addActionListener(this);
		
		JPanel p1=new JPanel();
		p1.setBackground(Color.PINK);
		p1.setLayout(new GridLayout(5,2));
		p1.add(lname);		p1.add(tname);
		p1.add(lyear);		p1.add(tyear);
		p1.add(lmonth); 	p1.add(month);
		p1.add(lday);			p1.add(day);
		p1.add(lblood);		p1.add(blood);
		
		JPanel p2=new JPanel();
		p2.setBackground(new Color(194,43,93));
		p2.add(b1);
		
		Container c=getContentPane();
		c.add(p1,"Center");
		c.add(p2,"South");
			
		setVisible(true);
		validate(); 
		
	}
	
	//ActionListener
	public void actionPerformed(ActionEvent e)
	{
		name=tname.getText();
		year=tyear.getText();
		int curYear=Calendar.getInstance().get(Calendar.YEAR);
		int curAge,calYear,myanYear,modulus;
		
		if(e.getSource()==b1)
		{
			if(name == null || year==null || day.getSelectedItem()=="" || blood.getSelectedItem()=="")
			{
				JOptionPane.showMessageDialog(this, "Dear "+name+" !!\nPlease enter details. ^^");
			}
			else
			{
				int y=Integer.parseInt(year);
				curAge=curYear-y;
				calYear=curAge+638;
				myanYear=curYear-calYear;
				modulus=myanYear%7;
				if(modulus==1)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them. \n"
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
				}
				if(modulus==2)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake\n "
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them. \n"
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
				}
				if(modulus==3)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them.\n "
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
				}
				if(modulus==4)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them. \n"
								+ "They hate lies and become sensitive when they don't like.\n";
				}
				if(modulus==5)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them. \n"
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
				}
				if(modulus==6)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them. \n"
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely. \n"
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
				}
				if(modulus==7 || modulus==0)
				{
					if(day.getSelectedIndex()==1)
						tellbyDay="Puti : They are not regularly famous but if they were famous no one can compare to them.\n"
								+ "They always speak straight to the point. They also (just like Binga and Mayana) \n"
								+ "have many diseases when they were young.The bad habit of Puti is hiding their mistake \n"
								+ "and seeking other's mistake.\n";
					if(day.getSelectedIndex()==2)
						tellbyDay="Stike : They are usually rish. They can become Monk . They have many plans about something.\n"
								+ " They have a good mouth. They are always inspirations for others.They love to fulfill someone's needs.\n";
					if(day.getSelectedIndex()==3)
						tellbyDay="Mayana : They have many diseases in their childhood. They can become Billionar\n"
								+ " or rich persons Monk or president. They give many advantages to people around them.\n "
								+ "They hate lies and become sensitive when they don't like.\n";
					if(day.getSelectedIndex()==4)
						tellbyDay="Adepte : They are best at Mahabot. They are very famous .Brave Kind and Honest.\n"
								+ " They are best leaders in world and perfect person more tha the bests.\n";
					if(day.getSelectedIndex()==5)
						tellbyDay="Yaza : They have many luxurious things just like King. Famous Strond and Honest.\n"
								+ " They are interested and clever in IT and creating hand-made things.\n";
					if(day.getSelectedIndex()==6)
						tellbyDay="Aetun : They are very famous persons.They can be quick-witted everywhere.\n"
								+ " Not only brave but also outstanding person.they believe themselves and have a high pride.\n";
					if(day.getSelectedIndex()==7)
						tellbyDay="Binga : They have usually many diseases when they were children. \n"
								+ "They have to worry about family and relatives .Weak heart and afraid of something extremely.\n "
								+ "Very stubborn Because they always think that this is my choice my life and mine.\n"
								+ "When they grow up they can become leader or teacher.\n";
				}//modulus
			
				
			//for Blood
			if(blood.getSelectedItem()=="A")
				tellbyBlood=" Blood Group A: the person of this blood type is a collaborator person who is intelligent,\n"
						+ " and has a sense of delicate, and maudlin despite his/her hiding for concern. \n"
						+ "According to that, the leadership positions do not suit him/her not because \n"
						+ "he/she is not good in doing this but by instinct. Therefore he/she needs for relaxation and\n"
						+ " focus exercises such as yoga. It is advisable to eat vegetables like beans, fruits like pineapples,\n"
						+ " and seafood for his/her digestive and immune system is sensitive and consequently will be susceptible\n"
						+ " to some diseases like diabetes, anaemia, and heart diseases. And the most famous figures \n"
						+ "are among this blood group such as Adolph Hitler and some of the United States presidents \n"
						+ "like Richard Nixon, Jimmy Carter, and Johnson.\n";
			if(blood.getSelectedItem()=="B")
				tellbyBlood="Blood Group B: persons who belong to this blood type are characterized by flexibility and creativity.\n"
						+ " And they live in a balance way, love to do exercises, eat in a balance way, and carry in their inside \n"
						+ "the essence of the modern man that strengthens over difficulties in life. They also combine \n"
						+ "the intellectual activity with a delicate sense and have harmony in addition to inner peace.\n"
						+ " As a result, that make them less tended to challenge and confront. Any imbalance leads them\n "
						+ "to difference in the functions of the organs of the body and thus gets susceptible for diseases and \n"
						+ "rare viruses. So, it is advisable to eat all kinds of food but in a balanced way. The holders of this blood group\n"
						+ " form the vast majority of the peoples of China, Japan, and Southeast Asia.\n";
			if(blood.getSelectedItem()=="O")
				tellbyBlood=" Blood Group (O): the holders of this blood type are having in their lives physical and personal strength,\n "
						+ "stamina, self-reliance, courage, pursuit of success, leadership features, power, and optimism. And they advise\n"
						+ " to do all kinds of sports especially the combat ones. In addition, it suit them all kinds of food as meat, fish, \n"
						+ "vegetables, and fruit and they are advised to focus on proteins. Among the most prominent figures of \n"
						+ "this category are U.S. President Ronald Reagan, the seventh Soviet Union President Mikhail Gore Bachev,\n "
						+ "Britain's Queen Elizabeth II, and Prince Charles\n";
			if(blood.getSelectedItem()=="AB")
				tellbyBlood="Blood Group (AB): holders of this blood group are called spirituals because they gently receive\n"
						+ " all kinds of life and without any negative perception of the consequences which will happen due to this. \n"
						+ "And they are the most charming and exciting people which may sometimes fall them in an emotional\n"
						+ " problems. It is advisable to avoid eating red meats and beans. And it is advisable to eat fish, vegetables,\n"
						+ " and milk products. It also advisable to do mild sport with long walk on feet mild as well as cycling and\n"
						+ " swimming. Among the most famous figures in this category are John F. Kennedy and Marilyn Monroe\n";
			
			if(month.getSelectedIndex()==1)
				icon=Jan;
			
			if(month.getSelectedIndex()==2)
				icon=Feb;
			
			if(month.getSelectedIndex()==3)
				icon=March;
			
			if(month.getSelectedIndex()==4)
				icon=April;
			
			if(month.getSelectedIndex()==5)
				icon=May;
			
			if(month.getSelectedIndex()==6)
				icon=June;
			
			if(month.getSelectedIndex()==7)
				icon=July;
			
			if(month.getSelectedIndex()==8)
				icon=Aug;
				
			if(month.getSelectedIndex()==9)
				icon=Sept;
				
			if(month.getSelectedIndex()==10)
				icon=Oct;
				
			if(month.getSelectedIndex()==11)
				icon=Nov;
				
			if(month.getSelectedIndex()==12)
				icon=Dec;
			
			
			 result="Dear "+name+" !!\nYour are "+curAge+" years old.\nYou born on "+day.getSelectedItem()+"So, you are "+tellbyDay+
					 "\n"+tellbyBlood;
			 
			 JOptionPane.showMessageDialog(null, result,"Forecasting your fortune.....",JOptionPane.INFORMATION_MESSAGE,icon);
			
			}//else
		}//if for b1
	}//action
	public static void main(String[] args)
	{
		new Mahaboats();
	}
}

//Done on 22nd February, 2018
