package iteratorpattern;

public class NameRepository implements Container {
	public String animals[] = {"dog","cat","monkey","lion"};
	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}
	
	private class NameIterator implements Iterator {
		public int index;
		@Override
		public boolean hasNext() {
			if (index < animals.length) {
				return true;
			}
			return false;
		}
		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if (this.hasNext()) {
				return animals[index++];
			}
			return null;
		}
	}
}
