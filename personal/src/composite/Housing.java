package composite;

import java.util.ArrayList;

public class Housing implements Structure {
    ArrayList<Structure> structures;

    @Override
    public void enter() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void location() {

    }

    @Override
    public String getName() {
        return null;
    }

    public void addStructure(Structure structure) {
        structures.add(structure);
    }

    public Structure getStructure(int position) {
        return structures.get(position);
    }
}
