/**
 * 
 */
package com.metacube.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Chetna
 *WebService Class FahrenheitToCelsius having webMethod fahrenheitToCelsiusConverter. 
 */
@WebService
public class FahrenheitToCelsius {
	
	/**
	 * @param input: temperature in fahrenheit
	 * @return temperature in celsius.
	 */
	@WebMethod
	public float fahrenheitToCelsiusConverter(float input) {
		
		return (input-32)*5/9;
		
	}
}
