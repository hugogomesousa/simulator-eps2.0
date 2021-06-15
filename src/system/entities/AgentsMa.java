/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package system.entities;

/**
 *
 * @author hugo
 */
public class AgentsMa {
    
    private Integer timestamp;
    private String nameAg;
    private String classAg;

    public AgentsMa(Integer timestamp, String nameAg, String classAg) {
        this.timestamp = timestamp;
        this.nameAg = nameAg;
        this.classAg = classAg;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    public String getNameAg() {
        return nameAg;
    }

    public void setNameAg(String nameAg) {
        this.nameAg = nameAg;
    }

    public String getClassAg() {
        return classAg;
    }

    public void setClassAg(String classAg) {
        this.classAg = classAg;
    }


    
   
}
