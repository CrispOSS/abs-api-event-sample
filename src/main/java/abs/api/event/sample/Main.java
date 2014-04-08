package abs.api.event.sample;

import abs.api.Actor;
import abs.api.event.EventContext;

/**
 * @author Behrooz Nobakht
 */
public class Main {

	public static void main(String[] args) throws InterruptedException {
		EventContext context = new EventContext();

		Echo e1 = new Echo(1);
		Echo e2 = new Echo(2);

		Actor a1 = context.newActor("e1", e1);
		Actor a2 = context.newActor("e2", e2);

		a1.ask(a2, "a random message");

		Thread.sleep(1000000000);
	}

}
