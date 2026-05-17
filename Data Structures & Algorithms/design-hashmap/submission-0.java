class MyHashMap {

    private List<Integer> keys;
    private List<Integer> values;

    public MyHashMap() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public void put(int key, int value) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key) {
                values.set(i, value);
                return;
            }
        }
        keys.add(key);
        values.add(value);
    }

    public int get(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key) {
                return values.get(i);
            }
        }
        return -1;
    }

    public void remove(int key) {
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key) {
                keys.remove(i);     
                values.remove(i);
                return;
            }
        }
    }
}