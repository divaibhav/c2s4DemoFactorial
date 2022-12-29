public class DemoMultiply {
    public int multiplyEvens(int number){
        if(number == 1){
            return 1;
        }else if(number %  2 == 0){
            return number * multiplyEvens(number-1);
        }else{
            return  multiplyEvens(number-1);
        }

    }

    public static void main(String[] args) {
        DemoMultiply demoMultiply = new DemoMultiply();
        int result = demoMultiply.multiplyEvens(9);
        System.out.println("result = " + result);
    }
}
