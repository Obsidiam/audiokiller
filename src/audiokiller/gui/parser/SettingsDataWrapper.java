/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package audiokiller.gui.parser;

/**
 *
 * @author obsidiam
 */
public class SettingsDataWrapper {
    private String COMM,PATH,NAMES;
 
    public void setCommand(String comm){
        COMM = comm;
    }
    
    public String getCommand(){
        return COMM;
    }
    
}
