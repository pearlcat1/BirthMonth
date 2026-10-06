import java.util.Scanner;

class BirthMonth
{
void main()
    {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        IO.println("Enter your birth month [1-12]: ");

        if(in.hasNextInt())
            {
                birthMonth = in.nextInt();
                in.nextLine(); //clear the newline from the buffer

                if(birthMonth >= 1 && birthMonth <= 12)
                {
                    IO.println("You said your birth month is " + birthMonth);
                }
                else
                {
                    IO.println("You said you birth month is " + birthMonth);
                    IO.println("That is invalid. Must be [1-12]");
                }
            }

    }
}
