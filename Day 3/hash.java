HashMap<Integer,Integer> a=new HashMap<>();
        for(int i=0;i<n;i++){
        int key=arr[i];
        int freq=0;
        if(a.containsKey(key))
        freq=a.get(key);
        freq++;
        a.put(key,freq);
