import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class gui{
	JFrame F=new JFrame();
	JPanel P=new JPanel();
	JButton B1=new JButton("Bubble sort");
	JButton B2=new JButton("Insertion sort");
	JButton B3=new JButton("Merge sort");
	JButton B4=new JButton("Quick sort");
	public gui(){
		P.add(B1);
		B1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				BubbleSort BS=new BubbleSort(new Grandom().generarRandom());
			}
		});
		P.add(B2);
		B2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("YOU SAW NOTHING");
			}
		});
		P.add(B3);
		B3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//mergeSorter MS=new mergeSorter().mergeSort(new Grandom().generarRandom());
				Comparable[] CL=new Comparable[2000];
				int n=0;
				for(int x:new Grandom().generarRandom()){
					CL[n]=x;
					n++;
				}
				mergeSorter MS=new mergeSorter();
				MS.mergeSort(CL);
			}
		});
		P.add(B4);
		B4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				/*QuickSort QS=new QuickSort();
				QS.quickSort(new Grandom().generarRandom());*/
				Object[] OL=new Object[2000];
				int n=0;
				for(int x:new Grandom().generarRandom()){
					OL[n]=x;
					n++;
				}
				QuickSort QS=new QuickSort();
				QS.quickSort(OL);
			}
		});
		F.add(P);
		F.pack();
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setVisible(true);
	}
	public static void main(String[] args){
		gui G=new gui();
	}
}