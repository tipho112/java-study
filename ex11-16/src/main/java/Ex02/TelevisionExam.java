package Ex02;

public class TelevisionExam {

	public static void main(String[] args) {
		RemoteControl rc;
		
		//rc = new Television();
		rc = new RemoteControl() {
			private int volumn;

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV�� �մϴ�.");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV�� ���ϴ�.");
			}

			@Override
			public void setVolumn(int volumn) {
				// TODO Auto-generated method stub
				if(volumn > RemoteControl.MAX_VOLUMN) {
					this.volumn = RemoteControl.MAX_VOLUMN;
				} else if(volumn < RemoteControl.MIN_VOLUMN) {
					this.volumn = RemoteControl.MIN_VOLUMN;
				} else {
					this.volumn = volumn;
				}
				System.out.println("���� TV ����: " + this.volumn);
			}
		};
		
		RemoteControl rc2 =  new  RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setVolumn(int volumn) {
				// TODO Auto-generated method stub
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		
		rc2.turnOn();
		rc2.turnOff();
	}

}
