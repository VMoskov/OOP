class Zapis {
    private LocalTime time;
    private Integer beats;

    public Zapis(LocalTime time, Integer beats) {
        this.time = time;
        this.beats = beats;
    }

    public LocalTime getTime() {
        return time;
    }

    public Integer getBeats() {
        return beats;
    }
}