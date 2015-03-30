/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdt_computer;
/**
 *
 * @author User
 */
public class CodeEncoding {
    int red, blue, green;
    int text;
    int pixelData[];
    char textArray[]; 
    
    public CodeEncoding() {
        red = 0;
        blue = 0; 
        green = 0;
        text = 0;
        pixelData = new int[81];
        textArray = new char[81];
    }
    //public int test() {return 0;}
    
    public void ColourEncode(String input) {
        
        SplitText(input);
        
        for(int i = 0; i <textArray.length; i++) {
            blue = textArray[i] & 7; 
            green = (textArray[i] >> 3 ) & 7;
            red = (textArray[i] >> 6) & 7;       
        
            blue = (blue << 5) + 16;
            green = (green <<5) + 16;   
            red = (red <<5) + 16;
        
            pixelData[i] = 0xff000000 + (red <<16) + (green << 8) + blue; 
        } 
    }   
    private void SplitText(String input) {
        /**for() {
        //split text input set of array
        } */
    }
    
    /*private void ColourTable() {
        int r =0; 
        int g =0;
        int b =0; 
        r = (r << 5) + 16;
        g = (g << 5) + 16;
        b = (b << 5) + 16;    
    }*/
}
