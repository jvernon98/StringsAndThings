package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){

        int count = 0; //begin the count 0
        String[] sentences = input.split(" "); //creating a new string with the words in 'input' split by spaces
        for (int i=0; i<sentences.length; i++) //create a variable that will stand for the numbers its counting up
        //it will increase the variable by increments of 1, so the code looks at each separately
        if(input.endsWith("y")||input.endsWith("z")){ //so if those broken up words end with y or z it increases the
            // count by one increment
            count++;
        }
        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        return base.replace(remove,"");
        //the replace method searches a string for specified characters and returns a new string where
        //the specified characters are replaced
        //the string in the first position (base) identifies the characters or words that will be replaced
        //the string in the second position (remove) identifies what to replace, but since we're not
        //actually replacing the letters we're taking out, we leave it blank, thus "" empty quotes
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        return input.split("is",-1).length == input.split("not",-1).length;
    }
    //the split turns the three strings in "input" into arrays, since strings are immutable
    //it will then search for all instances of "is" or "not" and the -1 tells it to cycle through
    //the arrays as many times as possible. the .length tells it how long it is
    //"==" is equal to the same code except with "not" being split, and if they are equal it returns true

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        String Happy = input;
        for (int i=0; i<Happy.length(); i++) {
            if (Happy.charAt(i) == 'g' && Happy.charAt(i + 1) == 'g') {
                return true;
            }
        }
    return false;
    }
    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int count = 0;

        for (int i = 0; i <= input.length() - 3; i++) {
            if (input.charAt(i) == input.charAt(i + 1) &&
                    input.charAt(i) == input.charAt(i + 2))
                count++;
        }
        return count;
    }}
