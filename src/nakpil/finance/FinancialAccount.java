/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.finance;

/**
 *
 * @author HERU
 */
public abstract interface FinancialAccount {
    
    public abstract void setAccountNumber(String s);
    public abstract String getAccountNumber();
    
    public abstract void setAccountType(String s);
    public abstract String getAccountType();
    
}
