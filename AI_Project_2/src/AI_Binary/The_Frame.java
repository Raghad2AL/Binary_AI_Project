package AI_Binary;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import cartesian.coordinate.CCPoint;
import cartesian.coordinate.CCSystem;

public class The_Frame extends javax.swing.JFrame {

   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public static double x;
   public static double y;
   public static int z;
	//Scanner myInput = new Scanner( System.in );
	 public static CCSystem s = new CCSystem();
	 public static String str;
	 public static String[] arrStr;
     public static Main Frame = new Main();
     public static ArrayList<CCPoint> List = new ArrayList<CCPoint>();
     public static ArrayList<Double> WList =new ArrayList<Double>();
     boolean flag = true;

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

        LabelforIterations.setText("Number of Iterations:");

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
    	
       
    	
    }//Learn button

    private void PointsTextActionPerformed(java.awt.event.ActionEvent evt)
    {
    	str=PointsText.getText();
    	arrStr=str.split(","); 
    	x=Double.parseDouble(arrStr[0]);
    	y=Double.parseDouble(arrStr[1]);
    	z=Integer.parseInt(arrStr[2]);
    	CCPoint point = new CCPoint(x, y,z);
    	 s.add(point);
    	 List.add(point);  
         Frame.add(s);
    	 Frame.validate();
    }//Text

    private void InitWeights()
    {
    	double max = 0.5;
    	double min = -0.5;
    	double W=0;
    	Random rand = new Random();
    
    	for(int i=0; i<List.size();i++)
    	{
    		
    		 W = (rand.nextDouble()*(max - min)+min);
    		WList.add(W);
    		W=0;
    	}
    	
    	for(int i=0; i<WList.size();i++)
    	{
    		//System.out.print("Hello");
    		System.out.println(WList.get(i).doubleValue()); 
    	}
    }//this method to initialize weights with random values between -0.5 and 0.5
   
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

