/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproductionworker;

import Exceptions.*;
/**
 *
 * @author bluebackdev
 */
public class Employee {
    private String name;
    private char[] number = new char[5];
    private char[] hireDate = new char[8];
    
    public Employee(String name, String number, String hireDate) {
        setName(name);
        setNumber(number);
        setHireDate(hireDate);
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
    public char[] getNumber () {
        return this.number;
    }
    
    public void setNumber(String number) {
        validateNumber(number);
        
        for(int i = 0 ; i < number.length() ; i++) {
            this.number[i] =  number.charAt(i);
        }
    }
    
    private void validateNumber(String number) {
        number = number.toUpperCase();
        
        if(number.length() != 5) {
            throw new InvalidEmployeeNumberException();
        }
        
        for(int i = 0 ; i < 5 ; i++) {
            if(i == 0 || i == 1 || i == 2) {
                if(!Character.isDigit(number.charAt(i))) {
                    throw new InvalidEmployeeNumberException();
                }
            }
            if(i == 3) {
                if(number.charAt(i) != '-') {
                    throw new InvalidEmployeeNumberException();
                }
            }
            if(i == 4) {
                int compareTo = (int)number.charAt(4);
                if(compareTo < 'A' || compareTo > 'M') {
                    throw new InvalidEmployeeNumberException();
                }
            }
        }
    }
    
    public char[] getHireDate() {
        return this.hireDate;
    }
    
    public void setHireDate(String hireDate) {
        validateHireDate(hireDate);
        
        for(int i = 0 ; i < hireDate.length() ; i++) {
            this.hireDate[i] = hireDate.charAt(i);
        }
    }
    
    public void validateHireDate(String hireDate) {
        int month = 0;
        int day = 0;
        
        for(int i = 0 ; i < 8 ; i++) {
            if(i == 0 || i == 1 || i == 3 || i == 4 || i == 6 || i == 7) {
                if(!Character.isDigit(hireDate.charAt(i))) {
                    throw new InvalidHireDateException();
                }
            }
            if(i == 2 || i == 5) {
                if(hireDate.charAt(i) != '-') {
                    throw new InvalidHireDateException();
                }
            }
        }
        
        month += Character.getNumericValue(hireDate.charAt(0));
        month += Character.getNumericValue(hireDate.charAt(1));
        
        if(month < 1 || month > 12) {
            throw new InvalidHireDateException();
        }
        
        day += Character.getNumericValue(hireDate.charAt(3));
        day += Character.getNumericValue(hireDate.charAt(4));
        
        if(day  < 1 || day > 31) {
            throw new InvalidHireDateException();
        }
    }
}
