/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.government;

/**
 *
 * @author Duskmourne
 */
public abstract interface BIRInformation {
    
    public static final String TIN_NUMBER = "TIN_NUMBER";
    public static final String DISTRICT_CODE = "DISTRICT_CODE";
    
    public abstract void setTinNumber(String s);
    public abstract String getTinNumber();
    
    public abstract void setDistrictCode(String s);
    public abstract String getDistrictCode();

}
