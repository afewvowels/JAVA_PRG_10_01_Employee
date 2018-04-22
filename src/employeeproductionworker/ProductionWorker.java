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
public class ProductionWorker extends Employee {
    private int shift;
    private double payRate;
    
    public ProductionWorker(String name, String number, String hireDate,
            int shift, double payRate) {
        super(name, number, hireDate);
        setShift(shift);
        setPayRate(payRate);
    }
    
    public String getShift() {
        if(this.shift == 1) {
            return "Day";
        }
        else if(this.shift == 2) {
            return "Night";
        }
        else {
            throw new InvalidShiftException();
        }
    }
    
    public void setShift(int shift) {
        this.shift = shift;
    }
    
    public double getPayRate() {
        return this.payRate;
    }
    
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
}
