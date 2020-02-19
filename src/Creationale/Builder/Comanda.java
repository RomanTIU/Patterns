package Creationale.Builder;

import java.util.UUID;

public class Comanda {
    private UUID Id;
    private DeliveryMan deliveryMan;
    private int finalPrice;
    private String addres;
    private OptiuneaDePlata optiuneaDePlata;

     void setId(UUID id) {
        Id = id;
    }

     void setDeliveryMan(DeliveryMan deliveryMan) {
        this.deliveryMan = deliveryMan;
    }

     void setFinalPrice(int finalPrice) {
        this.finalPrice = finalPrice;
    }

     void setAddres(String addres) {
        this.addres = addres;
    }

     void setOptiuneaDePlata(OptiuneaDePlata optiuneaDePlata) {
        this.optiuneaDePlata = optiuneaDePlata;
    }

    @Override
    public String toString() {
        return "Comanda{" +
                "Id=" + Id +
                ", deliveryMan=" + deliveryMan +
                ", finalPrice=" + finalPrice +
                ", addres='" + addres + '\'' +
                ", optiuneaDePlata=" + optiuneaDePlata +
                '}';
    }
}
