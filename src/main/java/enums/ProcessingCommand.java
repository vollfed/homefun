package enums;

public enum ProcessingCommand {

    START("start"),
    STOP("stop"),
    GETDATA("getdata"),
    GETALLDATA("getalldata");

    private String commandName;

    ProcessingCommand (String commandName){
        this.commandName = commandName;
    }

    public String getCommandName(){
        return this.commandName;
    }

    @Override
    public String toString() {
        return "Command{" +
                "comandName='" + this.commandName + '\'' +
                '}';
    }

    public static ProcessingCommand getCommand(String commandName) {
        for (ProcessingCommand command : ProcessingCommand.values()) {
            if(command.commandName.equals(commandName))
                return command;
        }

        return null;
    }

}
