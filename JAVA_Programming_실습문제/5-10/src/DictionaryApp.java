abstract class PairMap {
	protected String keyArray []; // key 들을 저장하는 배열
	protected String valueArray[]; // value 들을 저장하는 배열
	abstract String get(String key); // key 값을 가진 value 리턴, 없으면 null 리턴
	abstract void put(String key, String value); 
	// key와 value를 쌍으로 저장, 기존에 key가 있으면, 값 value를 수정
	abstract String delete(String key); 
	// key 값을 가진 아이템(value와 함께) 삭제, 삭제된 value값 리턴
}
class Dictionary extends PairMap {
	private int size;
	private int index = -1;
	public Dictionary(int size) {
		this.size = size;
		keyArray = new String[this.size];
		valueArray = new String[this.size];
	}
	public String get(String key) {
		int i = 0;
		for (String k : keyArray) {
			if (k == null) {
				i++;
				continue;
			}
			else if (k.equals(key)) {
				return valueArray[i];
			}
			i++;
		}
		return null;
	}
	public void put(String key, String value) {
		int i=0;
		for (String k : keyArray) {
			if (k == null) {
				i++;
				continue;
			}
			if (k.equals(key)) {
				valueArray[i] = value;
			}
			i++;
		}
		if (index == keyArray.length-1) {
			System.out.println("공간이 다 차서 푸시 불가");
			return;
		}
		else {
			index += 1;
			keyArray[index] = key;
			valueArray[index] = value;
		}
	}
	public String delete(String key) {
		int i=0; 
		for (String k : keyArray) {
			if (k == null) {
				i++;
				continue;
			}
			else if (k.equals(key)) {
				// 삭제
				keyArray[i] = null;
				String data = valueArray[i];
				valueArray[i] = null;
				return data;
			}
			i++;
		}
		System.out.println("삭제할 key와 value가 없음");
		return null;
	}
}
public class DictionaryApp {
	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 "+ dic.get("황기태"));
	}
}
