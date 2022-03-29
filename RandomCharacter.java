import static org.junit.Assert.*;
import org.junit.Test;

public class RandomCharacter {

    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }


    public static boolean checkForPrime(int inputNumber)
    {
        boolean isItPrime = true;
        
        if(inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i<= inputNumber/2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            } 
            return isItPrime;
        }
    }
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    public static char getRandomCharacter() {
        return getRandomCharacter('0', 'z');
    }

    @Test
    public final void testLowerCase(){
        assertTrue(Character.isLowerCase(RandomCharacter.getRandomLowerCaseLetter()));
    }

    @Test
    public final void testUpperCase(){
        assertTrue(Character.isUpperCase(RandomCharacter.getRandomUpperCaseLetter()));
    }

    @Test
    public final void testDigit(){
        assertTrue(Character.isDigit(RandomCharacter.getRandomDigitCharacter()));
    }

    @Test
    public final void testCharacterLetter(){
        assertTrue(Character.isLetter(RandomCharacter.getRandomCharacter()));
        //assertTrue(Character.isDigit(RandomCharacter.getRandomCharacter()));
    }

    @Test
    public final void testCharacterDigit(){
        //assertTrue(Character.isLetter(RandomCharacter.getRandomCharacter()));
        assertTrue(Character.isDigit(RandomCharacter.getRandomCharacter()));
    }

    @Test
    public final void testPrimeDigit(){
        assertTrue(RandomCharacter.checkForPrime((int)RandomCharacter.getRandomDigitCharacter()));
    }

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 15;
        final int CHARS_PER_LINE = 15;

        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomUpperCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomDigitCharacter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {
            char ch = RandomCharacter.getRandomCharacter();
            if ((i + 1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
    }
}