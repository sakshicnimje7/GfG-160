class Solution6 {
    static List<Integer> findMajority(int[] arr) { 
        int n = arr.length;
        
        int ele1 = -1, ele2 = -1;
        int cnt1 = 0, cnt2 = 0;
        
        for(int ele : arr) {
            
            if(ele1 == ele) {
                cnt1++;
            }
            
            else if(ele2 == ele) {
                cnt2++;
            }
            
            else if(cnt1 == 0) {
                ele1 = ele;
                cnt1++;
            }
            
            else if(cnt2 == 0) {
                ele2 = ele;
                cnt2++;
            }
            
            else {
                cnt1--;
                cnt2--;
            }
        }
        
        List<Integer>res = new
        ArrayList<>();
        cnt1 = 0;
        cnt2 = 0;
        
        for(int ele : arr) {
            if(ele1 == ele) cnt1++;
            if(ele2 == ele) cnt2++;
        }
        
        if(cnt1 > n/3) res.add(ele1);
        if(cnt2 > n/3 && ele1 != ele2) res.add(ele2);
        if(res.size() == 2 && res.get(0) > res.get(1)) {
            int temp = res.get(0);
            res.set(0, res.get(1));
            res.set(1, temp);
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
        List<Integer>res = findMajority(arr);
        for(int ele : res) {
            System.out.print(ele + " ");
        }
    }
}
