package wl7;

public class MyTable {
	private Entry[] entries = new Entry[26];

	public String get(char c) {
		int index = charToArrayIndexHelper(c);
		if (index < 0 || index > 25)
			return "Invalid Search Character";
		return entries[index].toString();
	}

	public void add(char c, String s) {
		int index = charToArrayIndexHelper(c);
		if (index < 0 || index > 25)
			return;
		Entry ent = new Entry(c, s);
		entries[index] = ent;
	}

	public String toString() {
		StringBuilder sBuilder = new StringBuilder();
		for (Entry e : entries) {
			if (e != null) {
				sBuilder.append(e.toString() + "\n");
			}
		}
		return sBuilder.toString();
	}

	private class Entry {
		char ch;
		String str;

		Entry(char ch, String str) {
			this.ch = ch;
			this.str = str;
		}

		public String toString() {
			return String.valueOf(this.ch) + "->" + this.str;
		}
	}

	private int charToArrayIndexHelper(char ch) {
		if (!Character.isLetter(ch))
			return -1;

		return (ch - 'a');
	}

	public static void main(String[] args) {
		MyTable table = new MyTable();
		table.add('a', "Addis");
		table.add('b', "Botswana");
		table.add('w', "Willie");
		table.add('w', "Winta");
		System.out.println(table);

	}

}
