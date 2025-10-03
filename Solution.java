class Solution {
    ArrayList<String> res;
    Map<Integer,String> m;
    public void f(int ind,int[] arr,StringBuilder s)
    {
        if(ind==arr.length)
        {
            res.add(s.toString());
            return;
        }
        String x="";
        if(m.containsKey(arr[ind]))
            x=m.get(arr[ind]);
        else
            f(ind+1,arr,s);
        for(char c:x.toCharArray())
        {
            s.append(c);
            f(ind+1,arr,s);
            s.deleteCharAt(s.length()-1);
        }
    }
    public ArrayList<String> possibleWords(int[] arr) {
        res=new ArrayList<>();
        m=new HashMap<>();
        m.put(2,"abc");
        m.put(3,"def");
        m.put(4,"ghi");
        m.put(5,"jkl");
        m.put(6,"mno");
        m.put(7,"pqrs");
        m.put(8,"tuv");
        m.put(9,"wxyz");
        f(0,arr,new StringBuilder());
        return res;
    }
}