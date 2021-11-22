/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Order.Order;
import Business.Restaurant.Dishes;
import java.util.ArrayList;

/**
 *
 * @author manitapasi
 */
public class CustDirectory {
    private ArrayList<Cust> custList;
   
    private Cust customer;
    public ArrayList<Cust> getCustList() {
        return custList;
    }
    
    
    public void setCustList(ArrayList<Cust> custList) {
        this.custList = custList;
    }

    public CustDirectory(){
        this.custList=new ArrayList<Cust>();
    }
    
    public Cust createCustomer(String uName){
        customer= new Cust(uName);
        custList.add(customer);
        return customer;
    }
    
    public void deleteCustomer(String username){
        for(int i=0;i<custList.size();i++){
            if(custList.get(i).getUserName().equals(username)){
                custList.remove(i);
            }
        }
    }
    
}
