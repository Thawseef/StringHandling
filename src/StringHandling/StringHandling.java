/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author Thawseef
 */
public class StringHandling {

    public static void main(String[] args) {
        String firstname = "Joad";
        String secondname = "Smith";
        System.out.println("Concatanation:" + firstname + " " + secondname);
        System.out.println("New Line: \n" + firstname + " " + secondname);
        System.out.println("Tab: \t" + firstname + " " + secondname);
        System.out.println("Backward: \b" + firstname + " " + secondname);
        System.out.println("Cariage Return: \r" + firstname + " " + secondname);
        System.out.println("Simple Quote: \'" + firstname + " " + secondname + "\'");
        System.out.println("Double Quote: \"" + firstname + " " + secondname + "\"");
    }

}
