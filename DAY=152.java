
class Result {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total=0;
        
        for(int i=0;i<bill.size();i++){
            if(i != k){
                total += bill.get(i);
            }
        }
        int annaShare=total/2;
        
        if(b == annaShare){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - annaShare);
        }
        }
    
}
