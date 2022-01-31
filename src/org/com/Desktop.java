package org.com;

public class Desktop  implements HardWare,SoftWare {
	public void desktopModel() {
			
		
	}

	@Override
	public void softwareResources() {
		System.out.println("1234");
	}

	@Override
	public void hardwareResources() {
		System.out.println("5678");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.hardwareResources();d.softwareResources();
		
	}
	
	
}
