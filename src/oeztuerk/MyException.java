package oeztuerk;

public class MyException extends Exception{
      //Parameterfreier Konstruktor
      public MyException() {}

      //Konstruktor, das eine eine Nachricht annimmt
      public MyException(String message)
      {
         super(message);
      }

	public void getMessage(String string) {
		System.out.println("Falscher Parameter");
	}
 }
