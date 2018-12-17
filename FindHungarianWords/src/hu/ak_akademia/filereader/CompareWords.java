package hu.ak_akademia.filereader;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class CompareWords implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Entry<String, Integer> first, Entry<String, Integer> second) {
		return first.getValue().compareTo(second.getValue());
	}

}
