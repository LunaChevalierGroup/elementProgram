package samplePackage;

import java.util.Collections;
import java.util.List;

public class TrampCreate extends Carddraw {
	Tramp[] tramp = Tramp.values();

	void trampcreate(int i, List<Tramp> tlist) {
		for (i = 0; i < tramp.length; i++) {
			tlist.add(tramp[i]);
		}
		Collections.shuffle(tlist);
	}
}
