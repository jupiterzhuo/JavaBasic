package com.java.basic;

abstract class MyAbstractClass {
	public abstract void sendMessage();
	public abstract void receivedMessage(); 
	public abstract void saveReport();
	public void printReport() {
		System.out.println("Print From Abstract Class");
	}
}

class SMSMessage extends MyAbstractClass{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send Message From  SMS");
	}

	@Override
	public void receivedMessage() {
		// TODO Auto-generated method stub
		System.out.println("Received Message From SMS");
		
	}

	@Override
	public void saveReport() {
		// TODO Auto-generated method stub
		System.out.println("Save Report From SMS");
	}
	
}

class EmailMessage extends MyAbstractClass{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send Message From Email");
	}

	@Override
	public void receivedMessage() {
		// TODO Auto-generated method stub
		System.out.println("Received Message From Email");	
	}

	@Override
	public void saveReport() {
		// TODO Auto-generated method stub
		System.out.println("Save Report From Email");
	}
	
}

class WhatsappMessage extends MyAbstractClass{

	@Override
	public void sendMessage() {
		// TODO Auto-generated method stub
		System.out.println("Send Message From Whatsapp");
	}

	@Override
	public void receivedMessage() {
		// TODO Auto-generated method stub
		System.out.println("Received Message From Whatsapp");
	}

	@Override
	public void saveReport() {
		// TODO Auto-generated method stub
		System.out.println("Save Report From Whatsapp");
	}
	
	public void validationMessage() {
		System.out.println("Validation Message From Whatsapp");
	}
	
}

class ImplementMessage{
	public static void main(String[] args) {
		SMSMessage smsMessage =  new SMSMessage();
		smsMessage.sendMessage();
		smsMessage.receivedMessage();
		smsMessage.saveReport();
		smsMessage.printReport();
		
	}
}