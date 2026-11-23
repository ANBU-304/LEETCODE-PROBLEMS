class ProductOfNumbers {
    private ArrayList<Integer> a;

    public ProductOfNumbers() {
     a = new ArrayList<>();   
    }
    
    public void add(int num) {
      a.add(num);  
    }
    
    public int getProduct(int k) {
        int prod=1;
        int count =0;

        for(int i=a.size()-1;i>=0 && count<k;i--)
        {
            prod*=a.get(i);
            count++;
        }
        return prod;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */