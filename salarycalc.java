import java.util.*;
public class salarycalc {
    public static void main(String args[]){
        System.out.println("enter the basic salary");
    
    Scanner sc = new Scanner(System.in);
     
    float basic_salary=sc.nextFloat();
        // System.out.println("basic_salary "+basic_salary);
    if(basic_salary<1500){
        float gsalary=basic_salary +((basic_salary*10)/100)+((basic_salary*90)/100);
        System.out.println("the gross salary is "+gsalary);    
    }
    else if(basic_salary>=1500){
        float gsalary=basic_salary+500+((basic_salary*98)/100);
        System.out.println("the gross salary is "+gsalary);    
    }

    }
}
