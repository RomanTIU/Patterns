package Creationale.Builder;

abstract class ComandaBuilder {
    Comanda comanda;

    void createComanda(){
        comanda = new Comanda();
    }

    abstract void buildAddres();
    abstract void buildOptiuneaDePlata();
    abstract void buildDeliveryMan();
    abstract void buildFinalPrice();
    abstract void buildID();

    Comanda getComanda(){
        return comanda;
    }
}
