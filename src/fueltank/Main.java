package fueltank;
public class Main {
public static void main(String[] args) {
// create the tank
FuelTank tank=new FuelTank(40.0,0.0);
System.out.print("El deposito con  " + tank.getTankMax() + " litros ha sido creado. ");
System.out.println(" La cantidad de gasolina incial es de " + tank.getTankLevel() + " litros.");
    }
}
