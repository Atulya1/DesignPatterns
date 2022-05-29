package example.Command;

public class Test {
	public static void main(String args[]) {
		RemoteControl r = new RemoteControl();
		
		Television t = new Television();
		
		OnCommand on = new OnCommand(t);
		OffCommand off = new OffCommand(t);
		r.pressButton(off);
	}
}
