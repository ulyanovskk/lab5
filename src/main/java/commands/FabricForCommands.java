package commands;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FabricForCommands {
    public ArrayList<Command> getAllCommandsArrayList() {
        ArrayList<Command> arrayList = new ArrayList<>();
        addCommandsToList(arrayList);
        return arrayList;
    }
    public LinkedList<Command> getAllCommandsLinkedList() {
        LinkedList<Command> linkedList = new LinkedList<>();
        addCommandsToList(linkedList);
        return linkedList;
    }

    private void addCommandsToList(List<Command> list) {
        list.add(new Help());
        list.add(new History());
        list.add(new Exit());
        list.add(new Show());
    }
}
