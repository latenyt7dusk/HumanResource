/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nakpil.personal;

/**
 *
 * @author Duskmourne
 */
public class Dependent {
    
    private String sName,fName,mName,bDate,gender,relation;
    
    public void setSurname(String s){
        this.sName = s;
    }
    public String getSurname(){
        return sName;
    }
    public void setFirstname(String s){
        this.fName = s;
    }
    public String getFirstname(){
        return fName;
    }
    public void setMiddlename(String s){
        this.mName = s;
    }
    public String getMiddlename(){
        return mName;
    }
    
    public String getFullname(){
        return sName+", "+fName+((mName.isEmpty())? "":" "+mName);
    }
    
    public void setBirtdate(String s){
        this.bDate = s;
    }
    public String getBirthdate(){
        return bDate;
    }
    public void setGender(String s){
        this.gender = s;
    }
    public String getGender(){
        return gender;
    }
    public void setRelationship(String s){
        this.relation = s;
    }
    public String getRelationship(){
        return relation;
    }
    
}
