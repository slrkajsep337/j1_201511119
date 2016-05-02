package command.light;

public class GarageDoorOpenCommand implements Command {
 Door door;

 public GarageDoorOpenCommand(Door door) {
  this.door = door;
 }
 public void execute() {
  door.up();
 }
}