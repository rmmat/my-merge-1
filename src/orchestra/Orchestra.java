package orchestra;

import orchestra.section.Brass;
import orchestra.section.Section;
import orchestra.section.Strings;
import orchestra.section.Woodwind;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<Section>();
        this.sections.add(new Strings());
        this.sections.add(new Woodwind());
        this.sections.add(new Brass());
    }

    private void print() {
        System.out.println("===== Orchestra Members =====");
        System.out.println("Conductor");
        this.sections.forEach(section -> section.print());
    }

    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
