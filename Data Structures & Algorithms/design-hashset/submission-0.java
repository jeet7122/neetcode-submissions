    class MyHashSet {

        List<Integer> list = new ArrayList<>();

        public MyHashSet() {

        }

        public void add(int key) {
            for (int n : list){
                if (n == key){
                    return;
                }
            }
            list.add(key);
        }

        public void remove(int key) {
            list.remove(Integer.valueOf(key));
        }

        public boolean contains(int key) {
            for (int n : list){
                if (n == key){
                    return true;
                }
            }
            return false;
        }
    }
