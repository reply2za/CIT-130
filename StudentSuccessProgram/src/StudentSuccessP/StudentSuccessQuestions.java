/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentSuccessP;
import java.util.Scanner;
/**
 *
 * @author Zain
 */
public class StudentSuccessQuestions {
      Scanner sq = new Scanner (System.in);
      
      private void ev(){
          System.out.print("> ");          
      }

    public void StudentSuccessQuestions(){
        System.out.println("Welcome to the Student Success Program!");
        System.out.println("All inputted answers should be either 'yes' or 'no' unless otherwise specified ");
        System.out.println("Are you stressed and/or facing any difficulites in school?");
        ev();
        String answer = sq.next();
        if (answer.equals("yes")){
            
            System.out.println("Is it due to academic reasons?");
            ev();
            answer = sq.next();
            
            if (answer.equals ("yes")){
                System.out.println("Is it due to homework");
                ev();
            answer = sq.next();
                if (answer.equals ("yes")){
                System.out.println("Is the coursload too difficult or homework too demanding?");
                    System.out.println("Please enter 'difficult' or 'demanding'");
                    ev();
                    answer = sq.next();
                    if (answer.equals ("difficult")){
                    System.out.println("What subject is the homework? enter one: math, english, other");
                        ev();
                        answer = sq.next();
                        if (answer.equals("math")){
                            System.out.println("Try going to the Math Cafe, there are math tutors there who are able to help");
                        }
                        if (answer.equals("english"))
                            System.out.println("Try going to the Learning Commons, there are English tutors there who are able to help ");
                        if (answer.equals("other")){
                            System.out.println("Try going the tutoring services at CCAC, they can be found at the library");
                        }
                    }
                    else {
                    System.out.println("Try setting a schedule and working on time management tactics");
                        System.out.println("If it remains to be too demanding then try talking to your professor");
                    }
                }
                else {
                System.out.println("");
                }
            }
            else {
            System.out.println("Please go to the student success office for more information");
                }
        }
        else {
            System.out.println("That's great!");
        }
    }
    
}

  