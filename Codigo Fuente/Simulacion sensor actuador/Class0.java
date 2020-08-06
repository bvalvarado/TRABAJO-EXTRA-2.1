import muvium.compatibility.arduino.Arduino;

class Sweep extends Arduino{ 
 
	
	public void setup()  
	{
 
		pinMode(13, OUTPUT);
	
		
		 
	}  
  
  
	public void loop()  
	{  
		float temperatura = analogRead(0);
		float milivoltios = ( temperatura / 1023 ) * 5000;
		temperatura = milivoltios / 10; 
		
		if (temperatura > 25 ) {
			digitalWrite(13, HIGH);
		
		}
		
		else if (temperatura < 20) {
			digitalWrite(13, LOW);
		
		}
		
		
		
	}  
  

}
