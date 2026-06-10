class Solution {
    public int maxNumberOfBalloons(String text) {
       HashMap<Character,Integer> map = new HashMap<>();
       map.put('b',0);
        map.put('a',0);
         map.put('l',0);
           map.put('o',0);
           
             map.put('n',0);
             int minValue = Integer.MAX_VALUE;
        for(int i=0;i<text.length();i++)
        {
            if(map.containsKey(text.charAt(i)))
             map.put(text.charAt(i),map.getOrDefault(text.charAt(i),0)+1);
        
        }

        for( int value: map.values())
        {
            minValue = Math.min(minValue, value);
        }

        return Math.min(minValue, Math.min(map.getOrDefault('l',0)/2,map.getOrDefault('o',0)/2));

    }
}