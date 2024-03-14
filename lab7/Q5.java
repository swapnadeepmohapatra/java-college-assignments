// Aim of the Program: Create
// an user defined exception named CheckArgument to check the number of
// arguments passed through command line. If the number of arguments is
// less than four then throw the Check Argument exception, else print the
// addition of squares of all the four elements.
// Input: 4 3 2 1
// Output : 30
// Input: 4 3 2
// Output : Exception occurred - CheckArgument

class CheckArgument extends Exception {
    CheckArgument(String s) {
        super(s);
    }
}

public class Q5 {
    public static void main(String[] args) {
        try {
            if (args.length < 4) {
                throw new CheckArgument("Exception occurred - CheckArgument");
            } else {
                int sum = 0;
                for (String arg : args) {
                    sum += Math.pow(Integer.parseInt(arg), 2);
                }
                System.out.println(sum);
            }
        } catch (CheckArgument e) {
            System.out.println(e);
        }
    }
}