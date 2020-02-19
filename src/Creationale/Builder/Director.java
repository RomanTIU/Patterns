package Creationale.Builder;

class Director {
    ComandaBuilder  builder;

     void setBuilder(ComandaBuilder builder) {
        this.builder = builder;
    }

    Comanda buildComanda(){
        builder.createComanda();
        builder.buildAddres();
        builder.buildID();
        builder.buildDeliveryMan();
        builder.buildOptiuneaDePlata();
        builder.buildFinalPrice();

        return builder.getComanda();
    }
}
