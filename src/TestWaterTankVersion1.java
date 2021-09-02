import javax.swing.JTextArea;
import javax.swing.JOptionPane;

 

public class TestWaterTankVersion1 {

	public static void main(String[] args) {

		String menu[]={"Add Water","Remove Water","Clear tank","Setup Tank","End"};

		String choice="",name="best tank",brand="",height="",color="black";
		String Name, Brand, Color, Capacity;
		
		double amount=0.00,capacity=1000,weight=700.00;

			JOptionPane j=new JOptionPane();

			String hold ="";

				WaterTankVersion1 tank = new WaterTankVersion1("Andrea",capacity);

				do{

	hold = "Name\t:"+tank.getName()+"\tBrand\t:"+tank.getBrand()+
	"\nCapacity\t:"+tank.getCapacity()+"\tCurrent Water\t:"+tank.getCurrentWater()+
		"\nRemaining\t:"+tank.remainingCapacity()+"\tColor\t:"+tank.getColor()+
	"\nEmpty\t:"+tank.isEmpty()+"\tFull\t:"+tank.isFull();

	
	choice=j.showInputDialog(null,new JTextArea(hold),"Menu",1,null,menu,menu[0]).toString();
           switch(choice){
           
           
           case "Add Water":
			amount=Double.parseDouble(j.showInputDialog("Amount(L): "));
			double Currentwater = tank.remainingCapacity();
										
				if (amount >= 0 && amount <= Currentwater){
				tank.addWater(amount);
				j.showMessageDialog(null, amount+" Water is added.");
				}else 						
				j.showMessageDialog(null, amount+" Water exceeded.");							
        break;	

		case "Remove Water":
			amount=Double.parseDouble(j.showInputDialog("Amount(L): "));
				double currentWater = tank.getCurrentWater();
										
				if (amount <=currentWater){
				tank.removeWater(amount);
				j.showMessageDialog(null, amount+" Water removed.");
				}else
				j.showMessageDialog(null, amount+" Low water capacity.");
								break;

			case "Clear tank":
					j.showMessageDialog(null, "Tank is cleared. Wastage\t: "+tank.clearWater());
								break;
								

		case "Setup Tank":
					Name=j.showInputDialog(" Enter Name");
					tank.setName(Name);
					Brand=j.showInputDialog(" Enter Brand");
					tank.setBrand(Brand);
					weight=Double.parseDouble(j.showInputDialog("Enter Weight"));
					tank.setWeight(weight);
					height=j.showInputDialog("Enter Height");
					tank.setHeight(height);
					Color=j.showInputDialog("Enter Color");
					tank.setColor(Color);
					Capacity=j.showInputDialog("Enter Capacity");
					tank.setCapacity(capacity);				

			       break;

								case "End":
									j.showMessageDialog(null,"Program clossing...");
								} //end of switch

				}while(!choice.equals("End"));

	}//end of main
	
} //end of class