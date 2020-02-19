package Creationale.Builder;

import java.util.UUID;

class ComandaZilnica extends ComandaBuilder {
    @Override
    void buildAddres() {
        comanda.setAddres("str.Studentilor");
    }

    @Override
    void buildOptiuneaDePlata() {
        comanda.setOptiuneaDePlata(OptiuneaDePlata.card);
    }

    @Override
    void buildDeliveryMan() {
        comanda.setDeliveryMan(DeliveryMan.IgorDodon);

    }

    @Override
    void buildFinalPrice() {
        comanda.setFinalPrice(400);
    }

    @Override
    void buildID() {
        comanda.setId(UUID.randomUUID());
    }
}
