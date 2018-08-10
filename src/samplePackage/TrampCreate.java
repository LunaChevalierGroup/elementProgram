package samplePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrampCreate {
	private List<Tramp> trampbundle = new ArrayList<Tramp>();
	private Tramp[] tramp = Tramp.values();

	public void setTrampBundle(List<Tramp> trampbundle) {
		this.trampbundle = trampbundle;
	}

	public void setTramp(Tramp[] tramp) {
		this.tramp = tramp;
	}

	public List<Tramp> getTrampBundle() {
		return trampbundle;
	}

	public Tramp[] getTramp() {
		return tramp;
	}

	public void trampBundleCreate() {
		for (int i = 0; i < tramp.length; i++) {
			trampbundle.add(tramp[i]);
		}
	}

	public void trampShuffle() {
		Collections.shuffle(trampbundle);
	}

}
