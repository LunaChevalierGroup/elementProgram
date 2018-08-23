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
	 * トランプのポイントを返すメソッド
	 *
	 * @author dfjkyrcq
	 *
	 * @return トランプのポイント
	 */
	public int getTrampPoint() {
		return tramppoint.getTrampPoint();
	}

	public String getTrampNumberMark() {
		return tramppoint.getTrampNumberMark();
	}

	public String getTrampMark() {
		return trampmark.getTrampMark();
	}
}
