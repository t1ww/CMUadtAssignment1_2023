/*
 * @author Narongchai Rongthong
 * 652115013  dd/mm/yyyy
 * written on 1/7/2023
 * https://github.com/t1ww
 */

package assignm;

public class Student {
    //initiailise variables zone
    public Integer index;
    public String SID;
    public String firstName;
    public String lastName;
    //constructor
    public Student(){
        this.index = -1;
        this.SID = "";
        this.firstName = "";
        this.lastName = "";
    }
    //overload
    public Student(String SID, String firstName){
        this.SID = SID;
        this.firstName = firstName;
    }
    public Student(String SID, String firstName, String lastName){
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Student(int index, String SID, String firstName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
    }
    public Student(int index, String SID, String firstName, String lastName){
        this.index = index;
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //end overload
    //set/
    public void setIndex(int index){
        this.index = index;
    }
    public void setSID(String SID){
        this.SID =SID;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    //end set/
    //get/
    public int getIndex(){
        return this.index;
    }
    public String getSID(){
        return this.SID;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    //end get/
    //toString template to show student's all available info
    public String toString(){
    String str = "string not found";
        if(this.lastName == null){
            str = String.format("[ %3s ", this.index) + String.format("  | %s ", this.SID) + String.format("| %38s ] ", this.firstName) + "no last name";
        }else str = String.format("[ %3s ", this.index) + String.format("  | %s ", this.SID) + String.format("| %15s ", this.firstName) +String.format("| %20s ] ", this.lastName);
        return str;
    }
}