public class BadVersion {
    
    public int badOne = 1;
    
    // AC
    public int firstBadVersion(int n) {
        int right = n;
        int left = 1;
        
         while(left < right) {
            int half = left + (right - left) / 2;
            
            if(isBadVersion(half)) {
                right = half;
            } else {
                left = half + 1;
            }
        }
        return left;
    }      
  
    // HELPER
    public Boolean isBadVersion(int n) {
       
        if(n > 1) {
            if(badOne== n){
                return true;
            } else if(n > badOne){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
   
}
