package AI_Binary;

import java.awt.BasicStroke;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import cartesian.coordinate.CCLine;
import cartesian.coordinate.CCPoint;
import cartesian.coordinate.CCSystem;

public class The_Frame extends javax.swing.JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Random rand = new Random();
public static double x;
   public static double y;
   public static int z;
	public static CCPoint Point;
	public static CCLine Line;
	 public static CCSystem s = new CCSystem();
	 public static String str;
	 public static String[] arrStr;
     public static Main Frame = new Main();
     public static ArrayList<CCPoint> List = new ArrayList<CCPoint>();
     public static ArrayList<Double> WList =new ArrayList<Double>();
     public static ArrayList<Integer> OList =new ArrayList<Integer>();//Actual output
     public static double Threshold = 0.2;
     boolean flag = true;
     double W1=0;
 	double W2=0;
     double outputX;
     int outputY;
     int error;
     double DeltaW1;
     double DeltaW2;
    public The_Frame() {
// 	    x=myInput.nextInt();
// 	    y=myInput.nextInt();
// 	    z=myInput.nextInt();	    
    	setSize(200,200);
      initComponents();   
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LearningRateLabel = new javax.swing.JLabel();
        LearningRateLabel1 = new javax.swing.JLabel();
        LearningRateSlider = new javax.swing.JSlider();
        LabelforIterations = new javax.swing.JLabel();
        TextForIterations = new javax.swing.JTextField();
        LearnButton = new javax.swing.JButton();
        PointsText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LearningRateLabel.setText("Learning Rate:");

        LearningRateLabel1.setText("0.5");

        LearningRateSlider.setMajorTickSpacing(10);
        LearningRateSlider.setMinorTickSpacing(10);
        LearningRateSlider.setPaintTicks(true);
        LearningRateSlider.setToolTipText("");
        LearningRateSlider.setValue(0);
        LearningRateSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LearningRateSliderStateChanged(evt);
            }
        });

        LabelforIterations.setText("Number of Epoch:");

        LearnButton.setText("Learn");
        LearnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LearnButtonActionPerformed(evt);
            }
        });

        PointsText.setToolTipText("Add Points Value");
        PointsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PointsTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(LearningRateLabel)
                        .addGap(10, 10, 10)
                        .addComponent(LearningRateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelforIterations)
                        .addGap(4, 4, 4)
                        .addComponent(TextForIterations, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(PointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LearnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(98, 98, 98))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(LearningRateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LearningRateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LearningRateLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(LearningRateSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(LabelforIterations))
                    .addComponent(TextForIterations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(PointsText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(LearnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LearningRateSliderStateChanged(javax.swing.event.ChangeEvent evt) 
    {
        // TODO add your handling code here:\
        float numV = (float)LearningRateSlider.getValue(); 
        float num = numV/100;
         LearningRateLabel1.setText(""+num);
    }//Slider

    private void LearnButtonActionPerformed(java.awt.event.ActionEvent evt) 
    {
    	
    	
    	if(flag)
    	{
    		flag = false;
    		InitWeights();
    	}//called only once
   	for(int i=0; i<Integer.parseInt(TextForIterations.getText()); i++)
  	{
    		for(int k=0; k<List.size(); k++)
    		{
    			 outputX = ((List.get(k).GetX()*W1)+(List.get(k).GetY()*W2))- Threshold;
    			 outputY = Step_function(outputX);
    			 error = List.get(k).GetV() - outputY;
    			if(error==0)
    			{
    				//do nth
    			}
    			else
    			{
    			
    			   DeltaW1 = Double.parseDouble(LearningRateLabel1.getText()) * List.get(k).GetX() * error;
    			   W1= W1+DeltaW1;
    			   DeltaW2 = Double.parseDouble(LearningRateLabel1.getText()) * List.get(k).GetY() * error;
    			   W2= W2+DeltaW2;
    			   
    			}//else if
    			
    			
    		}// k loop
    		
    	}//for loop
         System.out.print(W1);
		 System.out.print("\n");
		 System.out.print(W2);
		 System.out.print("\n");
       Line = new CCLine(W1, W2,Threshold);
       s.add(Line);
    	
    }//Learn buttons

    private void PointsTextActionPerformed(java.awt.event.ActionEvent evt)
    {
    
    	str=PointsText.getText();
    	arrStr=str.split(","); 
    	x=Double.parseDouble(arrStr[0]);
    	y=Double.parseDouble(arrStr[1]);
    	z=Integer.parseInt(arrStr[2]);
    	if(z==0) {
           Point = new CCPoint(x, y,Color.red, new BasicStroke(1f),z);
    	}
    	else 
    	{
          Point = new CCPoint(x, y,Color.BLUE, new BasicStroke(1f),z);

    	}
    	 s.add(Point);
    	 List.add(Point);  
         Frame.add(s);
    	 Frame.validate();
    }//Text

    private void InitWeights()
    {
    	double max = 0.5;
    	double min = -0.5;
    		 W1 = rand.nextDouble();
    		 W2=rand.nextDouble();
    		//System.out.print(Threshold);
    }//this method to initialize weights with random values between -0.5 and 0.5
   

    public int Step_function(double x) {
        if (x >= 0) 
        {
            return 1;
        } 
        else 
        {
            return 0;
        }
    }//Step func
    
    
    
    
    public static void main(String args[]) {
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                The_Frame frame = new The_Frame();
                frame.setVisible(true);
                
            }
        });
    }//main

    private javax.swing.JLabel LabelforIterations;
    private javax.swing.JButton LearnButton;
    private javax.swing.JLabel LearningRateLabel;
    private javax.swing.JLabel LearningRateLabel1;
    private javax.swing.JSlider LearningRateSlider;
    private javax.swing.JTextField PointsText;
    private javax.swing.JTextField TextForIterations;



}

