public class FacebookLikeSystem {
    
    public static String countLikes(String[] arr){
    
        String likes = null;
        for(int index = 0; index < arr.length; index++){
            
            if (arr[0] == null){
                likes = "no one likes this";
            }
            else if (arr.length == 1 ){
                likes = arr[index] + " likes this";
            }
            else if (arr.length == 2){
                likes = arr[0] + " and " + arr[1] + " likes this";
            }
            else if (arr.length == 3){
                likes = arr[0] + ", " + arr[1] + " and " + arr[2] + " likes this";  
            }else {
                likes = arr[0] + ", " + arr[1] + " and " + arr.length + " others likes this";
             }
        }
        
        return likes;   
    }
}
