package orchestra.section;

import java.util.ArrayList;
import java.util.List;

public abstract class Section {
    private String name;
    private List<String> instruments;

    public Section(String name) {
        this.name = name;
        this.instruments = new ArrayList<String>();
    }

    protected void addInstrument(String instrument) {
        this.instruments.add(instrument);
    }

    public void print() {
        System.out.println(this.name + ":");
        this.instruments.forEach(instrument -> {
            System.out.println('\t' + instrument);
        });
    }
}
