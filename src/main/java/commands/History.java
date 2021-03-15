package commands;

import logic.Editor;
import logic.InputData;
import logic.OutputData;
import objects.LabWork;

import java.util.HashMap;

public class History extends AbstractNoInputCommand{
    @Override
    public String getName() {
        return "history";
    }

    @Override
    public String getDescription() {
        return "history - a command to show history of commands usage!";
    }

    @Override
    public OutputData exec(Editor editor, InputData inputData) {
        return new OutputData("Error", "This message shouldn't be here!");
    }
}
