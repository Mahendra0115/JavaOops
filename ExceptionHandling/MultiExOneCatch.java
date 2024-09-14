 
 // MultipleException handeled in One Catch Block
 class MultipleException {
    public static void main(String[] args) {
        try{
            Integer num1 = Integer.parseInt(args[0]);
            Integer num2 = Integer.parseInt(args[1]);
            Integer num3 = num1/num2;
            System.out.println(num3);
        }
        catch(Exception e){
           if(e instanceof ArithmeticException){
                System.out.println(" can't devided 0 :");
            }
            else if(e instanceof NumberFormatException){
                System.out.println("can't devided by charactor");
            }
            else{
                System.out.println("you can pass Only  Integer Value: ");
            }
        }
    }
}
