class addition{
    public static int sum(int a,int...ta){
        int result=a;
        for(int k:ta){
            result+=k;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(3));
        System.out.println(sum(3,5));
        System.out.println(sum(1,2,3,4,5));
    }
}















