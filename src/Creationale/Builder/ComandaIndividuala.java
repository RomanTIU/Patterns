package Creationale.Builder;

import java.util.UUID;

public class ComandaIndividuala extends ComandaBuilder {
    @Override
    void buildAddres() {
        comanda.setAddres("str.Studentilor1/1");
    }

    @Override
    void buildOptiuneaDePlata() {
        comanda.setOptiuneaDePlata(OptiuneaDePlata.cash);
    }

    @Override
    void buildDeliveryMan() {
        comanda.setDeliveryMan(DeliveryMan.AndreiNastase);
    }

    @Override
    void buildFinalPrice() {
        comanda.setFinalPrice(250);
    }

    @Override
    void buildID() {
        comanda.setId(UUID.randomUUID());
    }
}
