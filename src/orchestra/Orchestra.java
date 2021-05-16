package orchestra;

import orchestra.section.Section;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Section> sections;

    private Orchestra() {
        this.sections = new ArrayList<Section>();
    }

    private void print() {
        System.out.println("===== Orchestra Members =====");
        this.sections.forEach(section -> section.print());
    }

    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
