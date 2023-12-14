class Faction2Factory implements ArmyFactory {
    @Override
    public Infantry createInfantry() {
        return new Faction2Infantry();
    }

    @Override
    public Tanks createTanks() {
        return new Faction2Tanks();
    }

    @Override
    public Artillery createArtillery() {
        return new Faction2Artillery();
    }
}