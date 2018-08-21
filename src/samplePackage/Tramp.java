package samplePackage;

/**
 * トランプを作成するクラス
 *
 * @author dfjkyrcq
 *
 */
public class Tramp {

	private TrampPoint tramppoint;
	private TrampMark trampmark;

	public Tramp(TrampPoint tramppoint, TrampMark trampmark) {
		this.tramppoint = tramppoint;
		this.trampmark = trampmark;
	}

	/**
	 *
	 *
	 * @author dfjkyrcq
	 *
	 * @return トランプ
	 */
	public int getTrampPoint() {
		return tramppoint.getTrampPoint();
	}

	public String getTrampNumber() {
		return tramppoint.getTrampNumber();
	}

	public String getTrampMark() {
		return trampmark.getTrampMark();
	}
}
