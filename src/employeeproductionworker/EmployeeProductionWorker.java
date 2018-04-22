/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeeproductionworker;

/**
 *
 * @author bluebackdev
 */
public class EmployeeProductionWorker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductionWorker pw = new ProductionWorker("Bob", "111-A", "12-12-99",
                                1, 15.0);
        
        System.out.println(pw.getHireDate());
        System.out.println(pw.getName());
        System.out.println(pw.getNumber());
        System.out.println(pw.getHireDate());
        System.out.println(pw.getShift());
        System.out.println(pw.getPayRate());
    }
}
