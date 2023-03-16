class VaccineDatabase {
    List<Record> records = new ArrayList<>();

    void addRecordToDatabase(Record record) {
        records.add(record);
    }

    List<Record> getRecordsByVaccine(Vaccine vac) {
        List<Record> rez = new ArrayList<>();
        for (Record r : records) {
            if (r.getVaccine().equals(vac)) {
                rez.add(r);
            }
        }
        return rez;
    }

    Map<Vaccine, Integer> getNumberOfSideEffects() {
        Map<Vaccine, Integer> rez = new HashMap<>();
        for (Record r : records) {
            Vaccine vac = r.getVaccine();
            if (!rez.containsKey(vac)) {
                rez.put(vac, 0);
            }
            rez.put(vac, Math.max(rez.get(vac), r.getSideEffects().size()));
        }
        return rez;
    }
}