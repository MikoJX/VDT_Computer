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
    int textASCII[];
    
    public CodeEncoding() {
        this.red = 0;
        this.blue = 0; 
        this.green = 0;
        this.text = 0;
        this.pixelData = new int[100];
        this.textArray = new char[100];
        this.textASCII = new int [100];
    }
    //public int test() {return 0;}
    
    public void ColourEncode(String input) {
        
        SplitText(input);
        
        for(int i = 0; i <textArray.length; i++) {
            
            blue = textArray[i] & 7; 
            green = (textArray[i] >> 3 ) & 7;
            red = (textArray[i] >> 6) & 7;   
            
            //System.out.print((int)(textArray[i]));
            //System.out.print("Encoding \nStep 1 \ntext : " + textArray[i] + "  red : " + red + "  green : " + green + "  blue : " + blue +"\n");
            
            blue = (blue << 5) + 16; //16 is to protect the number for noise 
            green = (green <<5) + 16;   
            red = (red <<5) + 16;
        
            System.out.print("Step 2\ntext : " + textArray[i] + "  red : " + red + "  green : " + green + "  blue : " + blue +"\n");
            pixelData[i] = 0xff000000 + (red <<16) + (green << 8) + blue; 
            //System.out.println("CodeEncoding: Pixel Data" + pixelData[i] );
            
            /*red = (pixelData[i] >> 16) & 255;
            green = (pixelData[i] >> 8) & 255;
            blue = (pixelData[i]) & 255; */
            
            //System.out.print("Decoding \nStep 1 \ntext : " + textArray[i] + "  red : " + red + "  green : " + green + "  blue : " + blue +"\n");
            /*//DECODING
            //Convert back to byte 
            red = (red  >> 5)& 7;
            green = (green  >> 5 ) &7;
            blue = (blue  >> 5) & 7;
            System.out.print("Decoding \nStep 1\ntext : " + textArray[i] + "  red : " + red + "  green : " + green + "  blue : " + blue +"\n");
//          
            char text = (char)((red<<6) + (green<<3) + blue); 
            System.out.print("\n Text" + text);
            System.out.print("\n Text" + ((red<<6) + (green<<3) + blue)); */
        } //end loop 
        
        
        CodePanel colourPanel = new CodePanel();
        
        System.out.println("Clicking");
        colourPanel.setColour(pixelData);
        //colourPanel.DrawBorder();
        
        
    }   
    
    private void SplitText(String input) {
        textArray = input.toCharArray();
//        for(int i = 0; i <textArray.length; i++) {
//            textASCII[i] = (int)textArray[i];
//            System.out.println(textArray[i] + ": " + textASCII[i] + "\n" );
//        }
                                      
//        for(char output : cArray) {
//            System.out.println(output);
//        }
    }
}
