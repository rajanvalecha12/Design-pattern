
package structural.pattern.facade;

import java.util.logging.Logger;

public class Client {

	public static void main(String[] args) {

		Logger log = Logger.getLogger("Main");
		FacadeDetails facade = new FacadeDetails();
		log.info(""+facade.getDetails().toString());
	}

}
