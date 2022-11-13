
public class crackle_pop {
    public static void main(String[] args){
        System.out.println("Project Info: Write a program that prints out the numbers 1 to 100 (inclusive). \n If the number is divisible by 3," + 
        " print Crackle instead of the number. \n If it's divisible by 5, print Pop. \n If it's divisible by both 3 and 5, print CracklePop. You can use any language.");

        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println(i + " CracklePop");
            } else if (i % 5 == 0) {
                System.out.println(i + " Pop (Div by 5)");
            } else if (i % 3 == 0) {
                System.out.println(i + " Crackle");
            } else {
                System.out.println(i);
            }
        }
    }
}
