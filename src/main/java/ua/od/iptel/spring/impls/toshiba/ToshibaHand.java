package ua.od.iptel.spring.impls.toshiba;

import ua.od.iptel.spring.interfaces.Hand;

public class ToshibaHand implements Hand {
	
	public void catchSomething(){
		System.out.println("Catched from Toshiba!");
	}

}
