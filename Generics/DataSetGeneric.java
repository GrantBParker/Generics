import java.util.ArrayList;

public class DataSetGeneric<T extends Measurable> {

	private ArrayList<T> data;

	public DataSetGeneric() {
		data = new ArrayList<>();
	}

	public void add(T objToAdd) {
		data.add(objToAdd);
	}

	public int size() {
		return data.size();
	}

	public T getMin() {
		if (data.isEmpty()) {
			return null;
		}
		T mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			//if (( mEle).getPages() > (( data.get(i)).getPages())) {
				//mEle = data.get(i);
			//}
		}
		return mEle;
	}

	public T getMax() {
		if (data.isEmpty()) {
			return null;
		}
		T mEle = data.get(0);
		for (int i = 1; i < data.size(); i++) {
			//if (((mEle).getPages() < (( data.get(i)).getPages())) {
				//mEle = data.get(i);
			//}
		}
		return mEle;
	}

	@Override
	public String toString() {
		return "DataSetGeneric [\n size()=" + size() + "\n getMin()=" + getMin() + " getMax()=" + getMax() + " Books=\n"
				+ data.toString() + "]";
	}

}