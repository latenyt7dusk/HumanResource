/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.work;

import nakpil.government.BIRInformation;

/**
 *
 * @author HERU
 */
public class Employer implements Business,BIRInformation,Cloneable {
    
    private String BusinessName,BusinessLine,Classification,Category,Address,zip;
    private String TinNumber,DistrictCode;

    @Override
    public void setName(String s) {
        this.BusinessName = s;
    }

    @Override
    public String getName() {
        return BusinessName;
    }

    @Override
    public void setBusinessLine(String s) {
        this.BusinessLine = s;
    }

    @Override
    public String getBusinessLine() {
        return BusinessLine;
    }

    @Override
    public void setClassification(String s) {
        this.Classification = s;
    }

    @Override
    public String getClassification() {
        return Classification;
    }

    @Override
    public void setCategory(String s) {
        this.Category = s;
    }

    @Override
    public String getCategory() {
        return Category;
    }

    @Override
    public void setTinNumber(String s) {
        this.TinNumber = s;
    }

    @Override
    public String getTinNumber() {
        return TinNumber;
    }

    @Override
    public void setDistrictCode(String s) {
        this.DistrictCode = s;
    }

    @Override
    public String getDistrictCode() {
        return DistrictCode;
    }

    @Override
    public void setAddress(String s) {
        this.Address = s;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public void setZipCode(String s) {
        this.zip = s;
    }

    @Override
    public String getZipCode() {
        return zip;
    }
    
    
    
}
