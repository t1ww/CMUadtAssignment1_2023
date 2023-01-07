/*
 * @author Narongchai Rongthong
 * 652115013  dd/mm/yyyy
 * written on 1/7/2023
 * https://github.com/t1ww
 */ 
package assignm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class assignment1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("\n//////////////new run////////////////\n");//buffer new run
        Vector<Student> myStudents = new Vector<Student>();
        File f = new File("student_list_65.csv");
        Scanner scan = new Scanner(f);
        //with every lines in the csv, seperate tokens into different datas and put into student object
        //read csv line by line
            while(scan.hasNextLine()){
                String dataLine = scan.nextLine();
                StringTokenizer token = new StringTokenizer(dataLine, ",");
                int index = Integer.parseInt(token.nextToken());
                String SID = token.nextToken();
                String firstName = token.nextToken();
                String lastName = "";
                Student myStudent;
                //put tokens into temporary object
                if(token.hasMoreTokens()){ //if has last name
                    lastName = token.nextToken();
                    myStudent = new Student(index,SID,firstName,lastName);
                }else{// dont have last name
                    lastName = "";
                    myStudent = new Student(index,SID,firstName);
                }
                //add temp object into dynamic array
                myStudents.add(myStudent);
            }
        ///output // ex. [ 0 | 000000000 | Firstname Lastname ]
            System.out.println("Total Students = " + myStudents.size());
            //all students
            showVectorLists(myStudents);
            //myStudents >> [STUDENT1, STUDENT2(object id)]
        //sort
        if(args.length > 0) { // if got argument
        System.out.print("After sorting by : ");
            switch(args[0]){ // switch by arguments 
                case "-n" :// student number (sid)
                    System.out.println("student number (sid)");
                    sort(myStudents, "SID");
                break;
                case "-f" :// first name
                    System.out.println("First name");
                    sort(myStudents, "firstName");
                break;
                case "-l" :// last name
                    System.out.println("last name");
                    sort(myStudents, "lastName");
                break;
                default:// wrong argument
                    System.out.println("no argument found or wrong argument, skipped sorting /");
                break;
            }
            //lists after sorted
            showVectorLists(myStudents);
        }
            //program end
            scan.close();//clean up
            System.out.println("\n//////////////////////////////");
            System.out.println("/////////End of THE PROGRAM");
            System.out.println("//////////////////////////////");
    }
    //methods
    private static void showVectorLists(Vector<Student> v){
        for(Student std : v){
            System.out.println(std);
        }
    }
    public static void sort(Vector<Student> vList, final String field) {
        Collections.sort(vList, new Comparator<Student>() {
            /* (non-Javadoc)
             * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
             */
            @Override
            public int compare(Student o1, Student o2) {
                if(field.equals("index")) {
                    return o1.index.compareTo(o2.index);
                } else if(field.equals("SID")) {
                    return o1.SID.compareTo(o2.SID);
                } if(field.equals("firstName")) {
                    return o1.firstName.compareTo(o2.firstName);
                } if(field.equals("lastName")) {
                    if(o1.lastName == null || o2.lastName == null)return -1;
                    return o1.lastName.compareTo(o2.lastName);
                }
                return 0;
            }           
        });
    }
}
