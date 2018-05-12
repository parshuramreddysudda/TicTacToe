package Javalab;



import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Panel implements ActionListener {

    JLabel LabelOfGame;
    JFrame j,e;
    JTextField t1;

    JLabel Log=new JLabel();
    JButton firstButton,SecondButton,thirdButton,fourthButton,fifthButton,sixthButton,seventhButton,eigthButton,ninthButton,ReseG;
    int PlayerChange;
    int firstVal,secondVal,thirdVal,fourthVal,fifthVal,sixthVal,sevthVal,eigthVal,ninthVal;

    public void Reset()
    {

        Panel1();
//
//		 firstButton.setForeground(Color.black);
//		 SecondButton.setForeground(Color.black);
//		 thirdButton.setForeground(Color.black);
//		 fourthButton.setForeground(Color.black);
//		 fifthButton.setForeground(Color.black);
//		 sixthButton.setForeground(Color.black);
//		 seventhButton.setForeground(Color.black);
//		 eigthButton.setForeground(Color.black);
//		 ninthButton.setForeground(Color.black);
    }


    public void Panel1() {
        FirstReset();
        j=new JFrame();
        t1=new JTextField();
        JLabel l=new JLabel();

        j.add(l);


//		 Assigning Buttons For MainPage
        JButton firstButton=new JButton("1");
        JButton secondButton=new JButton("2");
        JButton thirdButton=new JButton("3");
        JButton fourthButton=new JButton("4");
        JButton fifthButton=new JButton("5");
        JButton sixthButton=new JButton("6");
        JButton seventhButton=new JButton("7");
        JButton eigthButton=new JButton("8");
        JButton ninthButton=new JButton("9");


//		 Assigning Button Size for Better UI
        firstButton.setPreferredSize(new Dimension(55,55));
        secondButton.setPreferredSize(new Dimension(55,55));
        thirdButton.setPreferredSize(new Dimension(55,55));
        fourthButton.setPreferredSize(new Dimension(55,55));
        fifthButton.setPreferredSize(new Dimension(55,55));
        sixthButton.setPreferredSize(new Dimension(55,55));
        seventhButton.setPreferredSize(new Dimension(55,55));
        eigthButton.setPreferredSize(new Dimension(55,55));
        ninthButton.setPreferredSize(new Dimension(55,55));
        JButton ResetG=new JButton("Reset The Game");

        j.add(firstButton);
        j.add(secondButton);
        j.add(thirdButton);
        j.add(fourthButton);
        j.add(fifthButton);
        j.add(sixthButton);
        j.add(seventhButton);
        j.add(eigthButton);
        j.add(ninthButton);
        j.add(Log);

        j.add(ResetG);

        firstButton.setBackground(Color.black);
        l.setText("Tic Tac Toe Game Is Runned By JFrame");
        Log.setText("Test Run");
        j.setLayout(new FlowLayout(FlowLayout.LEFT));
        j.setSize(230,300);
        j.setVisible(true);



//		 Adding Separate Action Listener for each button For Independent Execution
        ResetG.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                Reset();
                JOptionPane.showMessageDialog(null,"Game Has Been Succesfully Reseted :P");


            }

        });
        firstButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                if(PlayerChange%2!=0)
                {
                    firstButton.setBackground(Color.BLUE);
                    firstButton.setForeground(Color.red);
                    firstVal=1;
//					JOptionPane.showMessageDialog(null,"First case clicked in button");  Checking Button for Working Condition
                }
                else {
                    firstButton.setBackground(Color.GREEN);
                    firstButton.setForeground(Color.green);
                    firstVal=2;
                }
                PlayerManipulation();
            }
        });


        secondButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//					JOptionPane.showMessageDialog(null, "B2 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    secondButton.setBackground(Color.BLUE);
                    secondButton.setForeground(Color.red);
                    secondVal=1;
                }
                else {
                    secondButton.setBackground(Color.GREEN);
                    secondButton.setForeground(Color.green);
                    secondVal=2;
                }
                PlayerManipulation();

            }

        });
        thirdButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//					JOptionPane.showMessageDialog(null, "B3 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    thirdButton.setBackground(Color.BLUE);
                    thirdButton.setForeground(Color.red);
                    thirdVal=1;
                }
                else {
                    thirdButton.setBackground(Color.GREEN);
                    thirdButton.setForeground(Color.green);
                    thirdVal=2;
                }
                PlayerManipulation();
            }



        });
        fourthButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//					JOptionPane.showMessageDialog(null, "B4 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    fourthButton.setBackground(Color.BLUE);
                    fourthButton.setForeground(Color.red);
                    fourthVal=1;
                }
                else {
                    fourthButton.setBackground(Color.GREEN);
                    fourthButton.setForeground(Color.green);
                    fourthVal=2;
                }
                PlayerManipulation();
            }

        });
        fifthButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//					JOptionPane.showMessageDialog(null, "B5 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    fifthButton.setBackground(Color.BLUE);
                    fifthButton.setForeground(Color.red);
                    fifthVal=1;
                }
                else {
                    fifthButton.setBackground(Color.GREEN);
                    fifthButton.setForeground(Color.green);
                    fifthVal=2;
                }
                PlayerManipulation();

            }



        });
        sixthButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {

//					JOptionPane.showMessageDialog(null, "B6 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    sixthButton.setBackground(Color.BLUE);
                    sixthButton.setForeground(Color.red);
                    sixthVal=1;
                }
                else {
                    sixthButton.setBackground(Color.GREEN);
                    sixthButton.setForeground(Color.green);
                    sixthVal=2;
                }
                PlayerManipulation();

            }



        });
        seventhButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//					JOptionPane.showMessageDialog(null, "B7 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    seventhButton.setBackground(Color.BLUE);
                    seventhButton.setForeground(Color.red);
                    sevthVal=1;
                }
                else {
                    seventhButton.setBackground(Color.GREEN);
                    seventhButton.setForeground(Color.green);
                    sevthVal=2;
                }
                PlayerManipulation();


            }



        });
        eigthButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {

//					JOptionPane.showMessageDialog(null, "B8 Mouse Clicked");

                if(PlayerChange%2!=0)
                {
                    eigthButton.setBackground(Color.BLUE);
                    eigthButton.setForeground(Color.red);
                    eigthVal=1;
                }
                else {
                    eigthButton.setBackground(Color.GREEN);
                    eigthButton.setForeground(Color.green);
                    eigthVal=2;
                }
                PlayerManipulation();


            }



        });
        ninthButton.addActionListener(new ActionListener()  {

            @Override
            public void actionPerformed(ActionEvent arg0) {


//

                if(PlayerChange%2!=0)
                {
                    ninthButton.setBackground(Color.BLUE);
                    ninthButton.setForeground(Color.red);
                    ninthVal=1;
                }

                else {
                    ninthButton.setBackground(Color.GREEN);
                    ninthButton.setForeground(Color.green);
                    ninthVal=2;
                }

                PlayerManipulation();
            }



        });


    }


//	 For Counting User Number


    public void PlayerManipulation() {

        PlayerChange++;
//		 JOptionPane.showMessageDialog(null, PlayerChange);

//		 Calculating Player Number using Odd and Even Numbers


        if(PlayerChange%2!=0)
        {
            Log.setText("Player One  CLicked");
        }
        else
        {
            Log.setText("Player Two CLicked");
        }

//	     Checking for Winning Conditions
        if(firstVal==secondVal&&secondVal==thirdVal)
        {
            if(firstVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if(fourthVal==fifthVal&&fifthVal==sixthVal)
        {
            if(fifthVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if (sevthVal==eigthVal&&eigthVal==ninthVal)
        {
            if(sevthVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if (firstVal==fifthVal&&fifthVal==ninthVal)
        {
            if(fifthVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if(firstVal==fourthVal&&fourthVal==sevthVal)
        {

            if(firstVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if(secondVal==fifthVal&&fifthVal==eigthVal)
        {
            if(fifthVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if(thirdVal==sixthVal&&sixthVal==ninthVal)
        {
            if(thirdVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }
        else if (thirdVal==fifthVal&&fifthVal==sevthVal)
        {

            if(thirdVal==1)
            {
                First();
            }
            else
            {
                Second();
            }
        }

    }


//	 Assigning Random Integers to these to skip First Time Check Condition(Since Default is Zero)


    public void FirstReset()
    {


        firstVal=4;
        secondVal=5;
        thirdVal=6;
        fourthVal=7;
        fifthVal=8;
        sixthVal=9;
        sevthVal=11;
        eigthVal=12;
        ninthVal=13;
        PlayerChange=0;
    }


    //	 This Will be Called on Satisfying Winning Conditions
    public void First()
    {
        JOptionPane.showMessageDialog(null, "Second Player Wins :)");
        JOptionPane.showMessageDialog(null, "New Game will be Created Upon this button Clicking");
        Reset();
    }
    public void Second()
    {
        JOptionPane.showMessageDialog(null, "First  Player WIns :)");
        JOptionPane.showMessageDialog(null, "New Game will be Created Upon this button Clicking");
        Reset();
    }

    public static void main(String args[])
    {
        Panel p=new Panel();
        p.Panel1();




    }


    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub

    }
}


//    GAME CAN BE REDISIGNED USING BELOW SOURCE CODE LIKE ADDING ICONS AND ETC


//int t= (Integer) evt.getSource();
//String t=(String) evt.getSource();

//
//		if(evt.getSource()==1)
//		{
//			JOptionPane.showMessageDialog(null, "Msg  Recived");
//		}
//
//if(t==1)
//{
//	JOptionPane.showMessageDialog(null, "B1 Mouse Clicked");
//}
//



// Additional FrameWork


// JButton button = new JButton();
// button.setIcon(new ImageIcon("yourButtonImage.jpg"));