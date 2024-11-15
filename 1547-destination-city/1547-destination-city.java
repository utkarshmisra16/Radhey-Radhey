class Solution {
    public String destCity(List<List<String>> paths) {
       HashMap<String, Integer> mp = new HashMap<>(); 
       for(List<String> path : paths){
            String source = path.get(0);
            mp.put(source, mp.getOrDefault(source, 0) + 1);
        }

        for(List<String> path : paths){
            String dest = path.get(1);
            if(mp.getOrDefault(dest, 0) == 0){
                return dest;
            }
        }
        return "";
    }
}