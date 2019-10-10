

public class Exercise_1 {
    public static void main(String[] args) {
        String word = "Maris";
        String acronym = "";

        int x; //length
        int y; //
        char c;

        int count = 1;
        x = 0;
        acronym += Character.toUpperCase(word.charAt(x));

        while(x < word.length())
        {

            if(word.charAt(x) == ' ' && count < 3)
            {
                count++;
                acronym += Character.toUpperCase(word.charAt(x + 1));

            }
            ++x;


        }

        if (count != 3)
        {
            System.out.println("Not enough words! Please use 3 words.");
        }
        else
        {
            System.out.println("Your three letter achronym is: " + acronym);
        }


    }
}
