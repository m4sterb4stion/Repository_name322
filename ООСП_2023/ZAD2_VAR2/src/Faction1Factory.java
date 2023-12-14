class Faction1Factory implements ArmyFactory {
    @Override
    public Infantry createInfantry() {
        return new Faction1Infantry();
    }

    @Override
    public Tanks createTanks() {
        return new Faction1Tanks();
    }

    @Override
    public Artillery createArtillery() {
        return new Faction1Artillery();
    }
}