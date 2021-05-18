public class ShipmentDriver {
    public static void main (String [] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;
        double weight;
        double cost;

        vol = shipment1.volume();
        weight = shipment1.weight;
        cost = shipment1.cost;
        System.out.println("The volume of shipment1 is = " + vol);
        System.out.println("The weight of shipment1 is = " + weight);
        System.out.println("The shipping cost of shipment2 is = $" + cost);
        System.out.println();

        vol = shipment2.volume();
        weight = shipment2.weight;
        cost = shipment2.cost;
        System.out.println("The volume of shipment2 is = " + vol);
        System.out.println("The weight of shipment2 is = " + weight);
        System.out.println("The shipping cost of shipment2 is = $" + cost);
    }
}
