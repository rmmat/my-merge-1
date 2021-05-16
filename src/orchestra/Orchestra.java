package orchestra;

import orchestra.section.Brass;
import orchestra.section.Keyboard;
import orchestra.section.Percussion;
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
        this.sections.add(new Percussion());
        this.sections.add(new Keyboard());
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
