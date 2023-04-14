interface VideoStore {
    /**
     * Pozivom metode simulira se kupovina filma
     * Sukladno kupljenoj kolicini i vrsti filma potrebno je azurirati košaricu
     *
     * @param id - ID filma koji se kupuje
     */
    public void add(String id);
    /**
     * Film je moguće ukloniti samo ako je prisutan u košarici
     * Potrebno je ažurirati košaricu
     *
     * @param id - ID filma koji se uklanja
     */
    public void remove(String id);

    /**
     * @return vraca trenutnu cijenu košarice
     */
    public float getCost();

}