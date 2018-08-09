package samplePackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TrampCreate {
	private static List<Tramp> trampbundle = new ArrayList<Tramp>();
	private static Tramp[] tramp = Tramp.values();

	public void setTrampBundle(List<Tramp> trampbundle) {
		TrampCreate.trampbundle = trampbundle;
	}

	public void setTramp(Tramp[] tramp) {
		TrampCreate.tramp = tramp;
	}

	public static List<Tramp> getTrampBundle() {
		return trampbundle;
	}

	public static Tramp[] getTramp() {
		return tramp;
	}

	public static void trampBundleCreate() {
		for (int i = 0; i < tramp.length; i++) {
			trampbundle.add(tramp[i]);
		}
	}

	public static void trampShuffle() {
		Collections.shuffle(trampbundle);
	}

}
