/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

/**
 *
 * @author vik
 */

public class Ttriangle {
	int base,height;
        double hypotenuse;
        
        
	//boolean isTriangle;
	public String getHypo(){		
			hypotenuse =Math.sqrt((base*base)+(height*height));			
			return String.valueOf(hypotenuse);				
	}
        public void setBase(int newBase){
            this.base=newBase;
            getHypo();
        }
        public void setHeight(int newHeight){
            this.height=newHeight;
            getHypo();
        }
        
        
}